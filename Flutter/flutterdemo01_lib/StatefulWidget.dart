import 'package:flutter/material.dart';

class MyWidget extends StatefulWidget {
  final String title;
  const MyWidget({super.key,required this.title});
  
  @override
  State<StatefulWidget> createState() {
    // TODO: implement createState
    return _MyWidgetState();
  }
}

class _MyWidgetState extends State<MyWidget> {
  int _numCount = 0;
  @override
  Widget build(BuildContext context) {
    print(_numCount);//每次点击都会重新build
    return Scaffold(
      appBar: AppBar(title:  Text(widget.title)),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text("$_numCount",style: Theme.of(context).textTheme.headline2),
            const SizedBox(height: 60,),
            ElevatedButton(onPressed: (){
              //改变数据必须加上setState
              setState(() {
                _numCount++;
             });
            }, child: const Text("增加"))
          ]),),
          floatingActionButton: FloatingActionButton(onPressed: (){
            setState(() {
              _numCount++;
            });
          },child: const Icon(Icons.add),),
    );
  }
}