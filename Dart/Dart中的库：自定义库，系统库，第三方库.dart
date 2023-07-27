/*
Dart中的库主要有三种：
  1.自定义的库
    import 'lib/xxx.dart';
  2.系统内置库
    import 'dart:math';
    import 'dart:io';
    import 'dart:convert';
  3.Pub包管理系统中的库
    https://pub.dev/packages
    https://pub.flutter_io.cn/packages
    https://pub.dartlang.org/flutter/

    1.需要在自己想项目根目录新建一个pubspec.yaml
      name:xxx
      description: A new flutter module project.
      dependencies: 【正常在Installing中能够找到】
        http:^0.12.0+2
    2.在pubspec.yaml文件 然后配置名称，描述，依赖等信息
    3.然后运行 pub get 获取包下载到本地
    4.项目中引入库 import 'package:http/http.dart' as http; 看文档使用
*/

/*
部分导入：
  如果只需要导入库的一部分，有两种模式：
    模式一：只导入需要的部分，使用show关键字，如下例子所示：
      import 'package:lib1/lib1.dart' show foo;
    模式二：隐藏不需要的部分，使用hide关键字，如下例子所示：
      import 'package:lib2/lib2.dart' hide foo;
*/