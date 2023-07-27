import 'package:flutter/material.dart';
//IconContainer
class IconContainer extends StatelessWidget {
  IconData icon;
  Color color;
  IconContainer({super.key,required this.icon,required this.color});

  @override
  Widget build(BuildContext context) {
    return Container(
      alignment: Alignment.center,
      height: 120,
      width: 120,
      decoration: BoxDecoration(
        color: color,
      ),
      child: Icon(icon,color: Colors.white,size:28),);
  }
}