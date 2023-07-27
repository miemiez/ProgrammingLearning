import 'dart:convert';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter_webview_plugin/flutter_webview_plugin.dart';
import 'package:flutterproject01/constants.dart';
import 'package:cupertino_icons/cupertino_icons.dart';
import 'package:flutterproject01/my_utils/dataUtils.dart';
import 'package:flutterproject01/web/net_Utils.dart';
import '';

class LoginWebPage extends StatefulWidget {
  const LoginWebPage({super.key});

  @override
  State<LoginWebPage> createState() => _LoginWebPageState();
}

class _LoginWebPageState extends State<LoginWebPage> {
  final FlutterWebviewPlugin _flutterWebviewPlugin = FlutterWebviewPlugin();
  bool isLoading = true;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    _flutterWebviewPlugin.onUrlChanged.listen((url){
      print("LoginWebPage onUrlChanged: $url");
      if(mounted){
        setState(() {
          isLoading = false;
        });
      }
      if(url != null&&url.length > 0&&url.contains('?code=')){
        //提取授權碼code
        String code = url.split('?')[1].split('&')[0].split('=')[1];
        Map<String,dynamic> params = <String,dynamic>{};
        params['client_id'] = AppInfos.CLIENT_ID;
        params['client_secret'] = AppInfos.CLIENT_SECRET;
        params['grant_type'] = 'authorization_code';
        params['redirect_uri'] = AppInfos.REDIRECT_URI;
        params['code'] = code;
        params['dataType'] = 'json';
        NetUtils.get(AppUrls.OAUTH2_TOKEN,params).then((data){
          print('date = $data');
          if(data != null){
            Map<String,dynamic> map = json.decode(data);
            if(map != null && map.isNotEmpty){
              //保存token信息
              DataUtils.saveLoginInfo(map);
              //彈出當前路由，并且返回refresh通知我的界面刷新數據
              Navigator.pop(context,'refresh');
            }
          }
        });
      }
    });

    // _flutterWebviewPlugin.onStateChanged.listen((state) {
    //   if(state.type == WebViewState.finishLoad){
    //     setState(() {
    //       isLoading = false;
    //     });
    //   }
    // });
  }

  @override
  void dispose() {
    // TODO: implement dispose
    super.dispose();
    _flutterWebviewPlugin.close();
  }

  @override
  Widget build(BuildContext context) {
    List<Widget> _appBarTitle = [
      const Text(
        "登錄開源中國",
        style: TextStyle(
          color: Color(0xffffffff),
        )
      )
    ];

    if(isLoading){
      _appBarTitle.add(const SizedBox(width: 10.0));
      _appBarTitle.add(const CupertinoActivityIndicator());
    }

    return WebviewScaffold(
        url: AppUrls.OAUTH2_AUTHORIZE +
            '?response_type=code&client_id=' + AppInfos.CLIENT_ID +
            '&redirect_uri=' + AppInfos.REDIRECT_URI,
        appBar: AppBar(
          title: Row(
            children: _appBarTitle,
          ),
        ),
      withJavascript: true, //允許執行js
      withLocalStorage: true, //允許本地存儲
      withZoom: true, //允許網頁縮放
    );
  }
}


