import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:get/get_connect/http/src/utils/utils.dart';

class Buttons extends StatelessWidget {
  const Buttons({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'CallPage',
      home: Scaffold(
        appBar: AppBar(
          title: Text('CallPage'),
        ),
      body:SizedBox(
        width: double.infinity,
         child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton(onPressed: (){
              Navigator.pushNamed(context,'/AnimatedList');
            }, child: Text('AnimatedList 实现动态列表')),
            ElevatedButton(onPressed: (){
              Navigator.pushNamed(context,'/FlutterSA');
            }, child: Text('FlutterSA')),
            ElevatedButton(onPressed: (){
              Get.defaultDialog(title: '提示信息',middleText: '您确定要删除吗',confirm: ElevatedButton(onPressed: (){
                print('确定');
                Get.back();//新的返回方法[等同于Navigator.of(context).pop()]
              }, child: const Text('确定')),cancel: ElevatedButton(onPressed: (){
                print('取消');
                Get.back();
              }, child: const Text('取消')));
            }, child: const Text("Getx defaultDialog")),
          ]
      ),
      )
      ),
    );
  }
}