void main(){
  /*
  dart:core 库中identical-函数的用法介绍：
    用法：
      bool identical(
        Object? a,
        Object? b
      )
      检查两个引用是否指向同一个对象。
    var o = new Object();
      var isIdentical = identical(o,new Object()); //false
      print(isIdentical);

      isIdentical = identical(o,o); //true
      print(isIdentical);

      isIdentical = identical(const Object(),const Object()); //true  
      print(isIdentical);

      isIdentical = identical([1],[1]);//false
  */
  var o1 = new Object();
  var o2 = new Object();
  print(identical(o1,o2));//false
  print(identical(o1, o1));//true

  //const关键字在多个地方创建相同的对象的时候，内存中只保留了一个对象
  //这里的o3和o4共享了存储空间
  var o3 = const Object();
  var o4 = const Object();
  print(identical(o3,o4));//true


  /*常量构造函数：
    1.常量构造函数需以const关键字修饰
    2.const构造函数必须用于成员变量都是final的类
    3.如果实例化时不加const修饰符，即使调用的是常量构造函数，实例化的对象也不是常量实例
    4.实例化常量构造函数的时候，多个地方创建这个对象，如果传入的值相同，只会保留一个对象
    5.Flutter中的const修饰不仅仅是节省组件构建时的内存开销，Flutter在需要重新构建组件的时候，这个组件是不应该改变的，重新构建没用任何意义，因此Flutter不好重新构建const组件
  */
  var c1 = Container(width: 20, height: 2);
  var c2 = Container(width: 20, height: 2);
  print(identical(c1, c2));//false

  var c3 = const Container(width: 40, height: 4);
  var c4 = const Container(width: 40, height: 4);
  print(identical(c3, c4));//true

  var c5 = Container(width: 80, height: 6);
  var c6 = Container(width: 120, height: 8);
  print(identical(c5, c6));//false

  //并且如果Container中的构造函数不为const的话，就不能使用const来进行构造函数
  //var c7 = const Container01(width: 80,height:7); //报错
}

class Container{
  final int width;
  final int height;
  const Container({required this.width,required this.height});
}

// class Container01{
//   int width;
//   int height;
//   Container01({required this.width,required this.height});
// }

/*
  总结：
    共享存储空间的条件：
      1.常量
      2.值相等
*/