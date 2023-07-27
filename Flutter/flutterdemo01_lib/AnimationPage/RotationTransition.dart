import 'package:flutter/material.dart';

class RotationTransitionA extends StatefulWidget {
  const RotationTransitionA({super.key});

  @override
  State<RotationTransitionA> createState() => _RotationTransitionAState();
}

class _RotationTransitionAState extends State<RotationTransitionA>
    with SingleTickerProviderStateMixin {
  late final AnimationController _animationController;

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    _animationController = AnimationController(
        vsync: this, //让程序和手机的刷新频率统一
        duration: const Duration(seconds: 1));
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
        title: const Text('RotationTransitionA'),
      ),
      body: Wrap(
        children: [
          RotationTransition(
            turns: _animationController,
            child: const FlutterLogo(
              size: 60,
            ),
          ),
          ElevatedButton(
              onPressed: () {
                //问题：_animationController.repeat()
                _animationController.repeat();
              },
              child: const Text('repeat')),
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
    );
  }
}