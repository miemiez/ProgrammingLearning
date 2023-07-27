import 'package:flutter/material.dart';
import 'package:flutterdemo01/AnimatedList.dart';
import 'package:flutterdemo01/AnimationPage/Flutter显示动画.dart';
import 'package:flutterdemo01/AnimationPage/RotationTransition.dart';
import 'package:flutterdemo01/AnimationPage/ScaleTransition.dart';
import 'package:flutterdemo01/MyIcons.dart';
import 'package:flutterdemo01/Orientation.dart';
import 'package:flutterdemo01/SearchPage.dart';
import 'package:flutterdemo01/Swiper.dart';
import 'package:get/get.dart';

import 'Buttons.dart';
import 'KeyTest.dart';
import 'BottomNavigationBar.dart';
import 'Dialog.dart';
import 'IconContainer.dart';
import 'CardTest.dart';
import 'StatefulWidget.dart';
import 'package:flutter/cupertino.dart';

import 'Swiper2.dart'; //配置ios风格的路由

void main() {
  runApp(//MyApp()
    MyApp()
  //   MaterialApp(
  //   debugShowCheckedModeBanner: false,
  //   title: 'Dialog',
  //   home: Scaffold(appBar: AppBar(title: Text('KeyTest'),
  //   ),body: MediaOrientation())
  //   //PageViewPage(),
  //   //PageViewLoad(height: 200, list: ['images/刃1.jpg','images/刃2.jpg','images/卡夫卡1.jpg','images/卡夫卡2.jpg']),
  // )
    //Scaffold(
    //appBar: AppBar(title:const Text("你好 Flutter")),
    // body: Container(
    //     width: 300,
    //     child: Column(
    //       crossAxisAlignment: CrossAxisAlignment.center,
    //       mainAxisAlignment: MainAxisAlignment.center,
    //       children: [Text('垂直居中文本')],)
    //   )
    // ),

    // body: Container(
    //   child: Column(
    //   //mainAxisAlignment: MainAxisAlignment.center,
    //   children: [
    //     CardTest('images/草原.jpg', '大草原', '一望无垠的大草原'),
    //     CardTest('images/瀑布.jpg', '瀑布', '飞流直下三千尺'),
    //   ],
    // )
    // ),

    // body: const Card(child: Column(
    //     children: [ListTile(
    //             //contentPadding: EdgeInsets.symmetric(vertical: 10), #要增加 ListTile 的上下内边距，可以通过这种方式调整
    //             //dense: true, #如果将 dense 设置为 true，则 ListTile 的垂直间距将减小。这将使得 ListTile 更加紧凑。
    //             leading: CircleAvatar(
    //             radius: 40,
    //             backgroundImage: AssetImage('images/草原.jpg'),
    //           ),
    //           title: Text('aaa'),
    //           subtitle: Text('bbb'))]
    //   ),
    // ),
    //body: Taps()
    //),
  );
}

class MyApp extends StatelessWidget {
  //配置路由
  final Map routes = {
    '/':(contxt)=>const Taps(),
    '/SearchPage':(contxt,{argument}) => SearchPage(str: argument),
    '/BottomNavigationBar': (context) => const Home(),
    '/AnimatedList' : (context) => const AnimatedListTest(),
    '/FlutterSA' : (context) => const AnimationPage(),
    '/RotationTransitionA' : (context) => const RotationTransitionA(),
    '/ScaleTransitionA' : (context) => const ScaleTransitionA()
  };
  MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return GetMaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      initialRoute: '/',
      //固定写法
      onGenerateRoute: (RouteSettings settings){
        //统一处理
        final String? name = settings.name;
        final Function? pageContentBuilder = routes[name];
        if(pageContentBuilder != null){
          if(settings.arguments != null){
            final Route route = CupertinoPageRoute(builder: (context) => pageContentBuilder(context,argument: settings.arguments));
            return route;
          } else{
            final Route route = CupertinoPageRoute(builder: pageContentBuilder as WidgetBuilder);
            return route;
          }
        }
        return null;
      },
    //   routes: {
    //     '/':(contxt)=>const Taps(),
    // '/SearchPage':(contxt) => const SearchPage(),
    // '/BottomNavigationBar': (context) => const Home(),
    //   },
    //   home:const Tabs() ,
    );
  }
}

class Main extends StatelessWidget {
  const Main({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
        width: 100,
        height: 100,
        decoration: const BoxDecoration(color: Colors.red),
        child: const Text(
          "你好Flutter",
          style: TextStyle(color: Colors.white),
        ),
      ),
    );
  }
}

//加载本地图标
class IconImport extends StatelessWidget {
  const IconImport({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return const Column(
        children: [Icon(MyIcons.weixin, size: 40, color: Colors.green)]);
  }
}

//加载本地图片
class LocalImage extends StatelessWidget {
  const LocalImage({super.key});

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Container(
        height: 150,
        width: 150,
        decoration: const BoxDecoration(color: Colors.yellow),
        child: Image.asset("images/草原.jpg"));
  }
}

class MyListView extends StatelessWidget {
  const MyListView({super.key});

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return ListView(children: <Widget>[
      ListTile(
          leading: Image.asset("images/草原.jpg", fit: BoxFit.cover),
          title: const Text(
            "s",
          )),
      const Divider(),
    ]);
  }
}

//ListView.builder实现动态列表
// ignore: must_be_immutable
class MyListViewbuilder extends StatelessWidget {
  List list = [];
  MyListViewbuilder({Key? key, required int length}) : super(key: key) {
    for (int i = 0; i < length; i++) {
      list.add("第${i + 1}条数据");
    }
  }

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return ListView.builder(
        itemCount: list.length,
        itemBuilder: (context, index) {
          return ListTile(title: Text(list[index]));
        });
  }
}

//GridView.count()来创建Grid
class MyGridView extends StatelessWidget {
  const MyGridView({super.key});

  @override
  Widget build(BuildContext context) {
    return GridView.count(crossAxisCount: 4, children: const [
      Icon(Icons.pedal_bike),
      Icon(Icons.home),
      Icon(Icons.ac_unit),
      Icon(Icons.search),
      Icon(Icons.settings),
      Icon(Icons.airport_shuttle),
      Icon(Icons.all_inclusive),
      Icon(Icons.beach_access),
      Icon(Icons.cake),
      Icon(Icons.circle)
    ]);
  }
}

//GridView.extent()来创建Grid
class MyGridViewExtent extends StatelessWidget {
  const MyGridViewExtent({super.key});

  @override
  Widget build(BuildContext context) {
    return GridView.extent(
        maxCrossAxisExtent: 180, //可以创建横轴子元素固定的宽度
        crossAxisSpacing: 10, //水平子Widget之间的间距
        mainAxisSpacing: 10, //垂直Widget之间的间距
        childAspectRatio: 0.8, //宽高比
        children: const [
          Icon(Icons.pedal_bike),
          Icon(Icons.home),
          Icon(Icons.ac_unit),
          Icon(Icons.search),
          Icon(Icons.settings),
          Icon(Icons.airport_shuttle),
          Icon(Icons.all_inclusive),
          Icon(Icons.beach_access),
          Icon(Icons.cake),
          Icon(Icons.circle)
        ]);
  }
}

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Flex(direction: Axis.vertical, children: [
      Expanded(
        flex: 1,
        child: IconContainer(
            icon: Icons.home, color: Colors.yellow), //这个元素设置宽度是没用效果的
      ),
      Expanded(
        flex: 2,
        child: IconContainer(icon: Icons.search, color: Colors.green),
      )
    ]);
  }
}

class StackTest extends StatelessWidget {
  const StackTest({super.key});

  Widget build(BuildContext context) {
    return Container(
        height: 400,
        width: 300,
        color: Colors.red,
        child: Stack(children: [
          Positioned(
              left: 10,
              bottom: 10,
              child: Container(
                height: 100,
                width: 100,
                color: Colors.yellow,
              )),
          const Positioned(right: 0, bottom: 190, child: Text("你好Flutter"))
        ]));
  }
}

class StackPositioned extends StatelessWidget {
  const StackPositioned({super.key});

  @override
  Widget build(BuildContext context) {
    return SizedBox(
        width: double.infinity,
        height: 40,
        child: Stack(children: [
          Container(alignment: Alignment.centerLeft, child: const Text("收藏")),
          Container(alignment: Alignment.centerRight, child: const Text("购买")),
        ]));
  }
}
