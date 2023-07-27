import 'package:flutter/material.dart';

class MyDrawer extends StatelessWidget {
  // final String headImgPath;
  // final List menuTitles;
  // final List menuIcons;
  const MyDrawer({super.key});
          // assert(headImgPath != null),
          // assert(menuTitles != null),
          // assert(menuIcons != null);

  @override
  Widget build(BuildContext context) {
    return const Drawer(
      child: Column(
          children: [Row(
              children: [
                  Expanded(child: UserAccountsDrawerHeader(
                    accountName: Text('咩咩仔'),
                    accountEmail: Text('1285291486@qq.com'),
                    decoration: BoxDecoration(
                        image: DecorationImage(
                            image: AssetImage('asset/images/瀑布.jpg'),fit: BoxFit.cover)
                    ),
                    currentAccountPicture: CircleAvatar(
                        backgroundImage: AssetImage('asset/images/草原.jpg')
                    ),)),
                ],
              ),
              ListTile(
                  leading: Icon(Icons.macro_off),
                  title: Text('发布动弹'),
                  trailing: Icon(Icons.back_hand),
              ),
          ]
          ),
      );
  }
}
