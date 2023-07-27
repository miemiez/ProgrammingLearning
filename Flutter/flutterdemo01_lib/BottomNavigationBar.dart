import 'package:flutter/material.dart';
import 'package:flutterdemo01/main.dart';

class Taps extends StatefulWidget {
  const Taps({super.key});

  @override
  State<Taps> createState() => _TapsState();
}

class _TapsState extends State<Taps> with SingleTickerProviderStateMixin {
  late TabController _tabController;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 3, vsync: this);
    _tabController.addListener(() {
      //获取点击或滑动页面的索引值
      if (_tabController.animation!.value == _tabController.index) {
        print(_tabController.index);
      }
    });
  }

//组件销毁的时候掉调用
  @override
  void dispose() {
    super.dispose();
    //销毁_tabController
    _tabController.dispose();
  }

  int _numCount = 0;
  int _currentIndex = 0;
  final List<Widget> pages = const [
    Home(),
    Catelog(),
    Message(),
    Setting(),
    User(),
  ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
          // leading: IconButton(
          //   icon: const Icon(Icons.menu),
          //   onPressed: () {
          //     print("左侧图标按钮");
          //   },
          // ),
          title: const Text('Flutter App'),
          actions: [
            IconButton(
                onPressed: () {
                  Navigator.pushNamed(context,'/SearchPage',arguments: 'aaa');
                },
                icon: Icon(Icons.search))
          ],
          bottom: TabBar(
              labelStyle: const TextStyle(fontSize: 14),
              isScrollable: true,
              indicatorColor: Colors.red,
              labelColor: Colors.red,
              unselectedLabelColor: Colors.black,
              indicatorSize: TabBarIndicatorSize.label,
              controller: _tabController, //注意：配置controller需要去掉TabBar上面的const
              tabs: const [
                Tab(child: Text('关注')),
                Tab(child: Text('热门')),
                Tab(child: Text('视频')),
              ])),
      body: TabBarView(
              controller: _tabController,
              children: [
                ListView(children: const [
                  ListTile(title: Text('我是关注列表')),
                ]),
                ListView(children: const [
                  ListTile(title: Text('我是热门列表')),
                ]),
                ListView(children: const [
                  ListTile(title: Text('我是视频列表')),
                ])
              ],
            ),

      drawer: const Drawer(
          child: Column(children: [
        Row(children: [
          Expanded(
            child: UserAccountsDrawerHeader(
              accountName: Text('咩咩仔'),
              accountEmail: Text('111111@qq.com'),
              currentAccountPicture: CircleAvatar(
                backgroundImage: AssetImage('images/瀑布.jpg'),
              ),
              decoration: BoxDecoration(
                image: DecorationImage(
                    image: AssetImage('images/草原.jpg'), fit: BoxFit.cover),
              ),
            ),
            // DrawerHeader(
            //     decoration: BoxDecoration(
            //       //color: Colors.red,
            //       image: DecorationImage(
            //           image: AssetImage('images/草原.jpg'), fit: BoxFit.cover),
            //     ),
            //     child: Column(children: [
            //       ListTile(
            //         leading: CircleAvatar(
            //           backgroundImage: AssetImage('images/瀑布.jpg'),
            //         ),
            //       ),
            //     ])),
          )
        ]),
        ListTile(
          leading: CircleAvatar(child: Icon(Icons.people)),
          title: Text('我的'),
        )
      ])),
      // Center(
      //   child: Column(
      //     mainAxisAlignment: MainAxisAlignment.center,
      //     children: [
      //     Text("$_numCount"),
      //     ElevatedButton(
      //       onPressed: () {
      //         setState(() {
      //           _numCount++;
      //           print(_numCount);
      //         });
      //       },
      //       child: Text("增加"),
      //     )
      //   ]),
      // ),
      bottomNavigationBar: BottomNavigationBar(
          fixedColor: Colors.red,
          currentIndex: _currentIndex,
          type: BottomNavigationBarType.fixed, //如果底部由4个或者以上的菜单的时候就需要配置这个参数
          onTap: (index) {
            //只能监听点击事件，没法监听滑动事件
            setState(() {
              _currentIndex = index;
              print(_currentIndex);
            });
          },
          items: const [
            BottomNavigationBarItem(icon: Icon(Icons.home), label: "首页"),
            BottomNavigationBarItem(
                icon: Icon(
                  Icons.category,
                ),
                label: "分类"),
            BottomNavigationBarItem(icon: Icon(Icons.message), label: "消息"),
            BottomNavigationBarItem(icon: Icon(Icons.settings), label: "设置"),
            BottomNavigationBarItem(icon: Icon(Icons.people), label: '用户'),
          ]),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerDocked,
      floatingActionButton: Container(
        height: 55,
        width: 55,
        padding: const EdgeInsets.all(5),
        margin: const EdgeInsets.only(top: 5),
        decoration: BoxDecoration(
          color: Color.fromARGB(255, 236, 231, 231),
          borderRadius: BorderRadius.circular(30),
        ),
        child: FloatingActionButton(
            backgroundColor: _currentIndex == 2 ? Colors.red : Colors.blue,
            child: const Icon(Icons.add),
            onPressed: () {
              //_numCount++;
              setState(() {
                _currentIndex = 2;
                print(_currentIndex);
              });
            }),
      ),
    );
  }
}

//首页
class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(child: Text("首页")),
    );
  }
}

//分类
class Catelog extends StatefulWidget {
  const Catelog({super.key});

  @override
  State<Catelog> createState() => _CatelogState();
}

class _CatelogState extends State<Catelog> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(child: Text('分类')),
    );
  }
}

//设置
class Setting extends StatelessWidget {
  const Setting({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(
        child: Text('设置'),
      ),
    );
  }
}

//用户
class User extends StatefulWidget {
  const User({super.key});

  @override
  State<User> createState() => _UserState();
}

class _UserState extends State<User> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(child: Text('用户')),
    );
  }
}

//消息
class Message extends StatefulWidget {
  const Message({super.key});

  @override
  State<Message> createState() => _MessageState();
}

class _MessageState extends State<Message> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(
        child: Text('消息'),
      ),
    );
  }
}
