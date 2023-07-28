import 'package:flutter/material.dart';
import 'package:flutterproject01/my_page/discovery_page.dart';
import 'package:flutterproject01/my_page/news_list_page.dart';
import 'package:flutterproject01/my_page/tweet_page.dart';
import 'package:flutterproject01/web/login_web.dart';
import 'package:flutterproject01/widget/navigation_icon_view.dart';

import 'profile_page.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _currentIndex = 0;
  final _appBarTitle = ['资讯','动弹','发现','我的'];
  late List<NavigationIconView> _navigationIconViews;
  List<Color> _colors = [Colors.red,Colors.green,Colors.yellow,Colors.grey];
  late PageController _pageController;
  late List<Widget> _myPages;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    _navigationIconViews = [
      NavigationIconView(title: _appBarTitle[0], iconPath: const Icon(Icons.home)),
      NavigationIconView(title: _appBarTitle[1], iconPath: const Icon(Icons.move_up)),
      NavigationIconView(title: _appBarTitle[2], iconPath: const Icon(Icons.find_in_page)),
      NavigationIconView(title: _appBarTitle[3], iconPath: const Icon(Icons.person)),
    ];
    _pageController = PageController(
      initialPage: _currentIndex,
    );
    _myPages = [NewsListPage(),TweetPage(),DiscoveryPage(),const MyPage()];
  }

  @override
  Widget build(BuildContext context) {

    return Scaffold(
      appBar: AppBar(
        //TODO 标题
        title: Text(_appBarTitle[_currentIndex]),
      ),
      body: PageView.builder(
          physics: const NeverScrollableScrollPhysics(),
          //scrollDirection: Axis.horizontal,
          controller: _pageController,
          itemCount: _appBarTitle.length,
          itemBuilder: (context,index){
            return _myPages[index];
          }
      ),
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _currentIndex,
        items: _navigationIconViews.map((view) => view.item).toList(),
        type: BottomNavigationBarType.fixed,
        onTap: (index){
          setState(() {
            _currentIndex = index;
          });
          _pageController.animateToPage(
              index,
              duration: const Duration(microseconds: 1),
              curve: Curves.ease
          );
        },
      ),
      drawer: const Drawer(
        child: Column(
          children: [
            Row(
              children: [
                Expanded(child:
                  UserAccountsDrawerHeader(
                  accountEmail: Text('1285291486@qq.com'),
                  accountName: Text('咩咩仔'),
                  currentAccountPicture: CircleAvatar(
                    backgroundImage: AssetImage('asset/images/瀑布.jpg'),
                  ),
                  decoration: BoxDecoration(
                      image: DecorationImage(
                          image: AssetImage('asset/images/草原.jpg'),fit: BoxFit.cover
                      )
                  ),
                ),)
              ],
            ),
            ListTile(
              leading: Icon(Icons.person_2),
              title: Text('我的'),
            )
          ],
        ),
      )
    );
  }
}
