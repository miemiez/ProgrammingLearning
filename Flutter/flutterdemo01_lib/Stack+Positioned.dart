import "package:flutter/material.dart";

class StackTest extends StatelessWidget{
  const StackTest({super.key});

  Widget build(BuildContext context){
    return Container(
      height: 400,
      width: 300,
      color: Colors.red,
      child: Stack(
        children: [
          Positioned(  //Positioned容器是相对于外面包括的容器来定位的，其中Positioned容器的height和width是配置子元素的宽度和高度，没法使用double.infinity
            left: 10,
            bottom: 10,
            child: Container(
              height: 100,
              width: 100,
              color: Colors.yellow,
            )
          ),
          const Positioned(
            right: 0,
            bottom: 190,
            child: Text("你好Flutter")
          )
        ]
      )
    );
  }
}