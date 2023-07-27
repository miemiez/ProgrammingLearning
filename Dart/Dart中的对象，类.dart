/*
对象操作符：
*/
class Person{
  String name;
  num age;
  Person(this.name,this.age);
  void printInfo(){
    print("${this.name}---${this.age}");
  }
}

void main(List<String> args) {
  /*
    ?（条件运算符）: 
      是一种安全调用操作符，也称为条件成员访问操作符或者空安全操作符，
      它用于在访问对象的成员（方法或属性）之前进行空值检查，避免出现空引用异常（NullPointerException）。
    
    as（类型转换）
    
    is（类型判断）

    ..（级联操作）（连缀）


  */
  Person p;
  //p?.printInfo();
}
