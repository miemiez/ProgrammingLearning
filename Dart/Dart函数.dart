void main(){
  fn1(){
    print('fn1');
  }

  fn2(fn){
    fn();
  }

  fn2(fn1);

  //定义一个带可选参数的方法
  String printUserInfo01(String username,[int age = 23]){
    return "姓名：$username --- 年龄：$age";
  }

  print(printUserInfo01("XYY",12));

  //定义一个命名参数的方法
  String printUserInfo02(String username,{int age = 18,String sex = '男'}){
    return "姓名：$username --- 性别：$sex --- 年龄：$age";
  }

  print(printUserInfo02("FYY",age:12));


  //自执行方法
  ((){
    print('我是自执行方法');
  })();


  //匿名函数
  //Dart 是一种类型推断的语言，通常可以根据表达式的类型推断出返回值类型。
  //因此，如果匿名方法的返回值类型可以通过类型推断确定，可以省略显式指定返回值类型。
  var printNum = (){
    print("这是匿名方法");
    fn1();
  };
}