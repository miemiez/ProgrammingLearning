import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

class Swiper extends StatefulWidget {
  final double height;
  final double width;
  final List<Widget> list;
  const Swiper(
      {super.key,
      required this.height,
      required this.width,
      required this.list});

  @override
  State<Swiper> createState() => _SwiperState();
}

class _SwiperState extends State<Swiper> {
  int _currentIndex = 0;
  late PageController _pageController;
  late Timer t;
  @override
  void initState() {
    // TODO: implement initState
    _pageController = PageController(initialPage: 0);
    super.initState();

    t = Timer.periodic(const Duration(seconds: 5), (timer) {
      _pageController.animateToPage((_currentIndex+1)%widget.list.length, duration: const Duration(milliseconds: 500), curve: Curves.linear);
    });
  }

  @override
  void dispose() {
    // TODO: implement dispose
    super.dispose();
    t.cancel();
    _pageController.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Stack(
      children: [
        SizedBox(
          width: widget.width,
          height: widget.height,
          child: PageView.builder(
            controller: _pageController,
            scrollDirection: Axis.horizontal,
            onPageChanged: (index) {
              setState(() {
                _currentIndex = index % widget.list.length;
                //print(_currentIndex);
              }); //问题：setState会重新构建页面，那会不会重新再预先构建1000个itemBuilder，widget.list[index % widget.list.length]:
            },
            itemCount: 1000,
            itemBuilder: (BuildContext context, int index) {
              return widget.list[index % widget.list.length];
            },
          ),
        ),
        Positioned(
          left: 0,
          bottom: 2,
          right: 0,
          child: Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: List.generate(
              widget.list.length,
              (index){
                return Container(
                height: 10,
                width: 10,
                decoration: BoxDecoration(
                  color: _currentIndex == index ? Colors.blue:Colors.grey,
                  borderRadius: BorderRadius.circular(5),
                ),
                );
              }
            ).toList(),
          ),
        )
      ],
    );
  }
}

//图片组件
class ImagePage extends StatefulWidget {
  final double width;
  final double height;
  final String src;
  late int num;
  ImagePage(
      {super.key,
      required this.height,
      this.width = double.infinity,
      required this.src,required this.num});

  @override
  State<ImagePage> createState() => _ImagePageState();
}

class _ImagePageState extends State<ImagePage> with AutomaticKeepAliveClientMixin {
  //with AutomaticKeepAliveClientMixin 
  @override
  Widget build(BuildContext context) {
    print(widget.num);
    return SizedBox(
      height: widget.height,
      width: widget.width,
      child: Image.asset(widget.src,fit: BoxFit.cover)
    );
  }


  //代码缓存
  @override
  // TODO: implement wantKeepAlive
  bool get wantKeepAlive => true;

}

//加载图片
class PageViewLoad extends StatefulWidget{
  final double height;
  final List<String> list;
  const PageViewLoad({super.key,required this.list, required this.height});

  @override
  State<PageViewLoad> createState() => _PageViewLoadState();
}

class _PageViewLoadState extends State<PageViewLoad> {
  List<Widget> pageList = [];
  
  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    for (int i = 0; i < widget.list.length; i++) {
      pageList.add(ImagePage(
        height: widget.height,
        src: widget.list[i],
        num: i,
      ));
    }
    }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('AutoPageView')),
      body: ListView(
        children: [
          Swiper(
              height: widget.height, width: double.infinity, list: pageList)
        ],
      ),
    );
  }
}
