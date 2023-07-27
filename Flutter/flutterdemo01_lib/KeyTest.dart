import 'package:flutter/material.dart';

class MW extends StatefulWidget {
  const MW({super.key});

  @override
  State<MW> createState() => _MWState();
}

class _MWState extends State<MW> {
  @override
  Widget build(BuildContext context) {
    return Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Text("Name"),
          TextField(),
          Text("Address"),
          TextField(),
          AnimatedSwitcher(duration: Duration(seconds: 2),
            child: Container(child: Text('daaaaaa',key: UniqueKey(),)))
        ],
      );
  }
}