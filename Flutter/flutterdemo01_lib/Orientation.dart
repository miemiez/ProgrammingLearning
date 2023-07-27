import 'package:flutter/material.dart';

class MediaOrientation extends StatefulWidget {
  const MediaOrientation({super.key});

  @override
  State<MediaOrientation> createState() => _MediaOrientationState();
}

class _MediaOrientationState extends State<MediaOrientation> {
  List<Widget> list = [];
  final GlobalKey _globalKey1 = GlobalKey();
  final GlobalKey _globalKey2 = GlobalKey();
  final GlobalKey _globalKey3 = GlobalKey();

  @override
  void initState(){
    super.initState();
    list = [
     Box(
        key: _globalKey1,
        color: Colors.red,
       ),
      Box(
        key: _globalKey2,
        color: Colors.green,
       ),
     Box(
        key: _globalKey3,
        color: Colors.grey,
       ),
    ];
  }
    @override
  Widget build(BuildContext context) {
    return Center(child: MediaQuery.of(context).orientation == Orientation.portrait ? Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: list,
          ): Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: list,
          ));
  }
}

class Box extends StatefulWidget {
  final Color color;
  const Box({super.key,required this.color});

  @override
  State<Box> createState() => _BoxState();
}

class _BoxState extends State<Box> {
  int _count = 0;
  @override
  Widget build(BuildContext context) {
    return Container(
        width: 60,
        height: 60,
        color: widget.color,
        child: TextButton(onPressed: () => setState(() {
          _count++;
        }),child: Text('$_count')),
      );
  }
}