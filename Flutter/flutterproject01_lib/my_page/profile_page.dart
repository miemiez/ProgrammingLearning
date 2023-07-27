import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:flutterproject01/my_utils/dataUtils.dart';
import 'package:flutterproject01/my_page/profile_detailPage.dart';
import 'package:flutterproject01/web/login_web.dart';
import 'package:flutterproject01/web/net_Utils.dart';

import '../common/event_bus.dart';
import '../constants.dart';
import 'my_messagePage.dart';

class MyPage extends StatefulWidget {
  const MyPage({super.key});

  @override
  State<MyPage> createState() => _MyPageState();
}

class _MyPageState extends State<MyPage> {
  List menuTitles = [
    '我的消息',
    '阅读记录',
    '我的博客',
    '我的问答',
    '我的活动',
    '我的团队',
    '邀请好友',
  ];
  List menuIcons = [
    Icons.message,
    Icons.print,
    Icons.error,
    Icons.phone,
    Icons.send,
    Icons.people,
    Icons.person,
  ];

  String userAvatar = 'https://azkk.co.jp/2021/wp-content/uploads/2021/03/ga4_001.png';
  String userName = '';

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    //嘗試顯示用戶信息
    _showUserInfo();
    eventBus.on<LoginEvent>().listen((event) {
      //獲取用戶信息并且顯示
      _getUserInfo();
    });
    eventBus.on<LogoutEvent>().listen((event) {
      _showUserInfo();
    });
  }

  _getUserInfo(){
    DataUtils.getAccessToken().then((accessToken){
      if(accessToken == null || accessToken.length == 0){
        return ;
      }
      Map<String,dynamic> params = <String,dynamic>{};
      params['access_token'] = accessToken;
      params['dataType'] = 'json';
      print('accessToken: $accessToken');
      NetUtils.get(AppUrls.OPENAPI_USER,params).then((data){
        print(data);
        Map<String,dynamic> map = json.decode(data);
        if(mounted){
          setState(() {
            userAvatar = map['avatar'];
            userName = map['name'];
          });
        }
        DataUtils.saveUserInfo(map);
      });
    });
  }

  _showUserInfo(){
    DataUtils.getUserInfo().then((user) {
        if(mounted){
          setState(() {
            if(user != null){
              userAvatar = user!.avatar!;
              userName = user!.name!;
            }else{
              userAvatar = 'asset/images/草原.jpg';
              userName = '点击头像登录';
            }
          });
        }
      }
    );
  }

  @override
  Widget build(BuildContext context) {
    return ListView.separated(
        itemBuilder: (context, index) {
          if (index == 0) {
            return _buildHeader();
          }
          index -= 1;
          return ListTile(
            leading: Icon(menuIcons[index]),
            title: Text(menuTitles[index]),
            trailing: const Icon(Icons.arrow_forward_ios),
            onTap: () {
              DataUtils.isLogin().then((isLogin) {
                if (isLogin) {
                  switch (index) {
                    case 0:
                      Navigator.of(context).push(MaterialPageRoute(
                          builder: (context) => MyMessagePage()));
                      break;
                  }
                } else {
                  _login();
                }
              });
            },
          );
        },
        separatorBuilder: (context, index) {
          return const Divider();
        },
        itemCount: menuTitles.length + 1);
  }

  _login() async {
    final result = await Navigator.of(context)
        .push(MaterialPageRoute(builder: (context) => const LoginWebPage()));
    if (result != null && result == 'refresh') {
      //登录成功
      eventBus.fire(LoginEvent());
    }
  }

  Container _buildHeader() {
    return Container(
      height: 150.0,
      color: const Color(AppColors.APP_THEME),
      child: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            //头像
            GestureDetector(
              child: userAvatar != 'asset/images/草原.jpg'
                  ? Container(
                width: 60.0,
                height: 60.0,
                decoration: BoxDecoration(
                  shape: BoxShape.circle,
                  border: Border.all(
                    color: const Color(0xffffffff),
                    width: 2.0,
                  ),
                  image: DecorationImage(
                    image: NetworkImage(userAvatar),
                    fit: BoxFit.cover,
                  ),
                ),
              )
                  : Container(
                      width: 60.0,
                      height: 60.0,
                      decoration: BoxDecoration(
                        shape: BoxShape.circle,
                        border: Border.all(
                          color: const Color(0xffffffff),
                          width: 2.0,
                        ),
                        image: const DecorationImage(
                          image: AssetImage('asset/images/草原.jpg'),
                          fit: BoxFit.cover,
                        ),
                      ),
                    ),
              onTap: () {
                DataUtils.isLogin().then((isLogin) {
                  if (isLogin) {
                    //详情
                    print(isLogin);
                    Navigator.of(context).push(MaterialPageRoute(
                        builder: (context) => const ProfileDetailPage()));
                  } else {
                    //执行登录
                    _login();
                  }
                });
              },
            ),
            const SizedBox(
              height: 10.0,
            ),
            Text(
              userName,
              style: const TextStyle(color: Color(0xffffffff)),
            ),
            //用户名
          ],
        ),
      ),
    );
  }
}

