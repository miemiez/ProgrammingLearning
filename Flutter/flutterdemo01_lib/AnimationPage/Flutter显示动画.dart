import 'package:flutter/material.dart';

class AnimationPage extends StatefulWidget {
  const AnimationPage({super.key});

  @override
  State<AnimationPage> createState() => _AnimationPageState();
}

class _AnimationPageState extends State<AnimationPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text('AnimationPage'),
        ),
        body: Wrap(
          children: [
            ElevatedButton(
                onPressed: () {
                  Navigator.pushNamed(context, '/RotationTransitionA');
                },
                child: const Text('RotationTransition')),
            ElevatedButton(
                onPressed: () {
                  Navigator.pushNamed(context,'/ScaleTransitionA');
                },
                child: const Text('ScaleTransitionA'))
          ],
        ));
  }
}
