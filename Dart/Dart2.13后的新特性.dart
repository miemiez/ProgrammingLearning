void main(){
  //Null safety（空安全）: ? 代表可空类型
    String? username = '张三'; //String? 表示username是一个可空类型
    username = null;
    print(username);

    List<String>? l1 = ["张三","李四"];
    l1 = null;
    print(l1);

    String? getData(apiUrl){ //在方法的返回值中使用 ? 则允许返回null
      if(apiUrl != null){
        return "this is server data";
      }
      return null;
    }

    print(getData("a"));

  //! 类型断言，非空断言
    String? str = "this is str";
    //str = null;
    print(str!.length); //类型断言：如果str不等于null，会打印str的长度，如果等于null会抛出异常

    void printLength(String? str){
      try{
        print(str!.length);
      }catch(e){
        print("str为null");
      }
    }

    printLength("1");

  //late关键字：主要用于延迟初始化
    Person p = new Person();
    p.setName("张三",18);
    print(p.getName());

  /*required关键词：
    最开始@required是注解
    现在它已经作为内置修饰符
    主要用于允许根据需要表记任何命名参数（函数或类），使得它们不为空，因为可选参数中必须有个 required
  */
  String printUserInfo(String username,{int age = 10,required String sex}){
    return "姓名:$username---性别:$sex---年龄:$age";
  }

  print(printUserInfo("XYY", sex: "女"));
}

//late关键字：主要用于延迟初始化
  class Person{
    late String name;
    late int age;

    ///Person({required this.name,required this.age});

    void setName(String name,int age){
      this.name = name;
      this.age = age;
    }

    String getName(){
      return "${this.name} --- ${this.age}";
    }
  }