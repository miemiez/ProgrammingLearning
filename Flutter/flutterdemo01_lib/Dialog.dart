import 'package:flutter/material.dart';
import 'package:fluttertoast/fluttertoast.dart';

class DialogPage extends StatefulWidget {
  const DialogPage({super.key});

  @override
  State<DialogPage> createState() => _DialogPageState();
}

class _DialogPageState extends State<DialogPage> {
  // _alertDialog() async {
  //   var result = await showDialog(
  //       barrierDismissible: false, //表示点击灰色背景的时候是否消失弹出框
  //       context: context,
  //       builder: (context) {
  //         return AlertDialog(
  //           title: const Text("提示信息!"),
  //           content: const Text("您确定要删除吗?"),
  //           actions: <Widget>[
  //             TextButton(
  //               child: const Text("取消"),
  //               onPressed: () {
  //                 print("取消");
  //                 Navigator.pop(context, 'Cancle');
  //               },
  //             ),
  //             TextButton(
  //               child: const Text("确定"),
  //               onPressed: () {
  //                 print("确定");
  //                 Navigator.pop(context, "Ok");
  //               },
  //             )
  //           ],
  //         );
  //       });
  //   print(result);
  // }
  void _alertDialog() {
    showDialog(
        context: context,
        builder: (context) {
          return AlertDialog(
            title: const Text('出现错误'),
            actions: [
              TextButton(
                  onPressed: () {
                    print('cancel');
                    Navigator.of(context).pop();
                  },
                  child: const Text('取消')),
              TextButton(
                  onPressed: () {
                    print('ok');
                    Navigator.of(context).pop();
                  },
                  child: const Text('确定'))
            ],
          );
        });
  }

  void _toast(){
    Fluttertoast.showToast(msg: '提示信息',
    toastLength: Toast.LENGTH_SHORT, //提示时间 只针对android平台
    gravity: ToastGravity.TOP,//方位
    //timeInSecForIosWeb: 1,//提示时间 针对 ios 和 web 
    backgroundColor: Colors.black,
    textColor: Colors.white,
    fontSize: 16);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
            appBar: AppBar(title: const Text('DialogPage')),
            body: Center(
                child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                ElevatedButton(
                    onPressed: _alertDialog, child: const Text('AlertDialog')),
                ElevatedButton(
                    onPressed: _toast, child: const Text('Toast')),
              ],
            )));
  }
}
