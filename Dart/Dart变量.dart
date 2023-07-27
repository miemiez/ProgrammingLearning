void main(){
  /*
  Dart变量：
    dart是一个强大的脚本类语言，可以不预先定义变量类型，自动会类型推导
    dart中定义变量可以通过var关键字，也可以通过类型来声明变量
  */
  var str = '你好dart';
  var myNum = 1234;

  print(str);
  print(myNum);

  //字符串
  String str01 = '你好dart';
  print(str01);

  //数字类型
  int myNum01 = 12345;
  print(myNum01);

  //Dart常量(const final)
  const PI = 3.14159;
  final PI2 = 3.14159; //①final可以开始不赋值，只能赋一次
  //②final不仅有const的编译时常量的特性，最重要的它是运行时常量，并且final是惰性初始化，即在运行时第一次使用前才初始化。
}