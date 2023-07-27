import 'package:flutter/material.dart';

class ScaleTransitionA extends StatefulWidget {
  const ScaleTransitionA({super.key});

  @override
  State<ScaleTransitionA> createState() => _ScaleTransitionAState();
}

class _ScaleTransitionAState extends State<ScaleTransitionA>
    with SingleTickerProviderStateMixin {
  late final AnimationController _animationController;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    _animationController = AnimationController(
      vsync: this, //让程序和手机的刷新频率统一
      duration: const Duration(seconds: 1),
      lowerBound: 0.5, //表示被控制的容器的最小大小
      upperBound: 1, //表示被控制的容器的最大大小
    );
  }

  @override
  void dispose() {
    // TODO: implement dispose
    super.dispose();
    _animationController.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text('ScaleTransitionA'),
        ),
        body: Container(
          child: Column(children: [
            ScaleTransition(
                scale: _animationController,//_animationController.drive(Tween(begin: 0.5,end:1.2)),这样也可以控制范围大小
                child: Container(
                  width: 100,
                  height: 100,
                  color: Colors.red,
                )),
            Wrap(
              children: [
                ElevatedButton(
                    onPressed: () {
                      _animationController.repeat();
                    },
                    child: Text('repeat')),
                ElevatedButton(
                    onPressed: () {
                      _animationController.stop();
                    },
                    child: Text('stop')),
                ElevatedButton(
                    onPressed: () {
                      _animationController.forward();
                    },
                    child: Text('forward')),
                ElevatedButton(
                    onPressed: () {
                      _animationController.reverse();
                    },
                    child: Text('reverse')),
                ElevatedButton(
                    onPressed: () {
                      _animationController.reset();
                    },
                    child: Text('reset'))
              ],
            ),
          ]),
        ));
  }
}
