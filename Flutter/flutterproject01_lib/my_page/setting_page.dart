import 'package:flutter/material.dart';

import '../common/event_bus.dart';
import '../constants.dart';
import '../my_utils/dataUtils.dart';


class SettingsPage extends StatefulWidget {
  @override
  _SettingsPageState createState() => _SettingsPageState();
}

class _SettingsPageState extends State<SettingsPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        elevation: 0.0,
        title: Text(
          '设置',
          style: TextStyle(color: Color(AppColors.APPBAR)),
        ),
        iconTheme: IconThemeData(color: Color(AppColors.APPBAR)),
      ),
      body: Center(
        child: ElevatedButton(
            onPressed: () {
              //退出登录
              DataUtils.clearLoginInfo().then((_) {
                eventBus.fire(LogoutEvent());
                Navigator.of(context).pop();
              });
            },
            child: Text(
              '退出登录',
              style: TextStyle(fontSize: 25.0),
            )),
      ),
    );
  }
}
