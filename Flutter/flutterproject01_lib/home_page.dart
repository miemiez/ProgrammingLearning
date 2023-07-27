import 'package:flutter/material.dart';
import 'package:flutter_project01/my_drawer.dart';
import 'package:flutter_project01/widget/navigation_icon_view.dart';

import 'constants.dart' show AppColors;

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _currentIndex = 0;
  final _appBarTitle = ['资讯','动弹','发现','我的'];
  late List<NavigationIconView> _navigationIconViews;
  late List<Widget> _pages;
  late PageController _pageController;

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
    _pages = [
      Container(color: Colors.red),
      Container(color: Colors.orange),
      Container(color: Colors.blue),
      Container(color: Colors.green)
    ];
    _pageController = PageController(initialPage: _currentIndex);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        //TODO 标题
        title: Text(
          _appBarTitle[_currentIndex],
          style: const TextStyle(color: Color(AppColors.APP_BAR)),
        ),
        iconTheme: const IconThemeData(color: Color(AppColors.APP_BAR)),
        backgroundColor: const Color(AppColors.APP_THEME),
      ),
      body: PageView.builder(
        physics: const NeverScrollableScrollPhysics(),
        itemCount: _pages.length,
        controller: _pageController,
        itemBuilder: (context,index){
           return _pages[index];
        },
        onPageChanged: (index){
          setState(() {
            _currentIndex = index;
          });
        }),
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _currentIndex,
        items: _navigationIconViews.map((view) => view.item).toList(),
        type: BottomNavigationBarType.fixed,
        onTap: (index){
          setState(() {
            _currentIndex = index;
          });
          _pageController.animateToPage(_currentIndex, duration: const Duration(microseconds: 1), curve: Curves.ease);
        },
      ),
      drawer: const MyDrawer(),
    );
  }
}
