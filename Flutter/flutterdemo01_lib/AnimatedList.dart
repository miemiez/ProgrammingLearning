import 'dart:async';

import 'package:flutter/material.dart';

class AnimatedListTest extends StatefulWidget {
  const AnimatedListTest({super.key});

  @override
  State<AnimatedListTest> createState() => _AnimatedListTestState();
}

class _AnimatedListTestState extends State<AnimatedListTest> {
  bool flag = true;
  final GlobalKey<AnimatedListState> _globalKey =
      GlobalKey<AnimatedListState>();
  List<String> list = [];

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    list = ['第1条数据', '第2条数据'];
  }

  Widget _builderItem(index) {
    return ListTile(
      title: Text(list[index]),
      trailing: IconButton(
        icon: Icon(Icons.delete),
        onPressed: () {
          _deleteItem(index);
        },
      ),
    );
  }

  _deleteItem(index) {
    if (flag == true) {
      flag = false;
      _globalKey.currentState!.removeItem(index, (context, animation) {
        var removeItem = _builderItem(index);
        list.removeAt(index);
        return FadeTransition(opacity: animation, child: removeItem);
      });
      Timer.periodic(const Duration(milliseconds: 800), (timer) {
        flag = true;
        timer.cancel();
      });
    }
  }
  Color c = Colors.white;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('AnimationList'),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          //问题：为什么不用setState(){}
          list.add('第${list.length + 1}条数据');
          c = Colors.blue;
          print(list[list.length-1]);
          print(c);
          _globalKey.currentState!.insertItem(list.length - 1);//被调用时，只会重构AnimatedList本身，并不会重新构建整个State
        },
        child: Icon(Icons.add),
      ),
      body: Container(
        color: c,
        alignment: Alignment.center,
        child: AnimatedList(
            key: _globalKey,
            initialItemCount: list.length,
            itemBuilder: (context, index, animation) {
              return FadeTransition(
                  opacity: animation.drive(Tween(begin: 0,end: 0.5)), child: _builderItem(index));
            }),
      ),
    );
  }
}
