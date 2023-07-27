import 'dart:async';

import 'package:flutter/material.dart';

class PageViewPage extends StatefulWidget {
  const PageViewPage({super.key});
  @override
  State<PageViewPage> createState() => _PageViewPageState();
}

class _PageViewPageState extends State<PageViewPage> {
  List<Widget> pageList = [];
  @override
  void initState() {
    List listData = [
      {
        "imageUrl": 'images/刃1.jpg',
      },
      {
        "imageUrl": 'images/刃2.jpg',
      },
      {
        "imageUrl": 'images/卡夫卡1.jpg',
      },
      {
        "imageUrl": 'images/卡夫卡2.jpg',
      }
    ];
    for (int i = 0; i < listData.length; ++i) {
      pageList.add(PicturePage(
        url: listData[i]["imageUrl"],
      ));
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text("pageview演示"),
        ),
        body: ListView(
          children: [Swiper(pageList: pageList)],
        ));
  }
}

//Swiper组件
class Swiper extends StatefulWidget {
  final double width;
  final double height;
  final List<Widget> pageList;
  const Swiper(
      {super.key,
      this.width = double.infinity,
      this.height = 200,
      required this.pageList});
  @override
  State<Swiper> createState() => _SwiperState();
}

class _SwiperState extends State<Swiper> {
  late PageController _pageController;
  int _currentPageIndex = 0;
  late Timer t;

  @override
  void initState() {
    super.initState();
    _pageController = PageController(initialPage: 0);
    t = Timer.periodic(Duration(seconds: 5),(timer){
      _pageController.animateToPage((_currentPageIndex+1)%widget.pageList.length, duration: Duration(milliseconds: 500), curve: Curves.linear);
    });
  }

  @override
  void dispose() {
    // TODO: implement dispose
    super.dispose();
    _pageController.dispose();
    t.cancel();
  }

  @override
  Widget build(BuildContext context) {
    return Stack(
      children: [
        SizedBox(
          width: double.infinity,
          height: 200,
          child: PageView.builder(
              controller: _pageController,
              onPageChanged: (int index) {
                setState(() {
                  _currentPageIndex = index % (widget.pageList.length);
                });
              },
              itemCount: 10000,
              itemBuilder: (context, index) {
                return widget.pageList[index % (widget.pageList.length)];
              }),
        ),
        Positioned(
          bottom: 10,
          left: 0,
          right: 0,
          child: Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: List.generate(widget.pageList.length, (i) {
              return Container(
                margin: const EdgeInsets.fromLTRB(2, 0, 2, 0),
                width: 10,
                height: 10,
                decoration: BoxDecoration(
                    shape: BoxShape.circle,
                    color: _currentPageIndex == i ? Colors.blue : Colors.grey),
              );
            }).toList(),
          ),
        ),
      ],
    );
  }
}

//PicturePage 图片页面
class PicturePage extends StatefulWidget {
  final String url;
  final double width;
  final double height;
  const PicturePage(
      {super.key,
      required this.url,
      this.width = double.infinity,
      this.height = 200});
  @override
  State<PicturePage> createState() => _PicturePageState();
}

class _PicturePageState extends State<PicturePage> {
  @override
  Widget build(BuildContext context) {
    print(widget.url);
    return SizedBox(
      width: widget.width,
      height: widget.height,
      child: Image.asset(widget.url, fit: BoxFit.cover),
    );
  }
}
