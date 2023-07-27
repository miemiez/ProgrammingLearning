import 'package:flutter/material.dart';

class NavigationIconView{
  final BottomNavigationBarItem item;
  final String title;
  final Icon iconPath;

  NavigationIconView({required this.title,required this.iconPath})
      : item = BottomNavigationBarItem(
          icon: iconPath,
          label: title);
}