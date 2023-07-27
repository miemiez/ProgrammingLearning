void main(){
  //一.定义字符串的方式:
    var str1 = 'this is str1';
    var str2 = "this is str2";
    String str3 = '''
    this is str3
    this is str3
    str3
    ''';//只有''' '''或者""" """"才能换行写字符串
    print(str3);
    //字符串拼接
    print(str1 + str2);
    print("$str1 $str2");

  //二.Number类型
    //double类型：既可是整型也可以是浮点型

  //三.定义List【通过[]创建的List，容量是可以改变的】
    //方式一：
      var l1 = ["张三",20,true];
      print(l1);
    //方式二（指定类型）：
      var l2=<String>["张三","李四"];
      print(l2);
    //方式三定义List的方式 增加数据
      var l4 = [];
      print(14);
      l4.add("张三");
      l4.add("李四");
      print(l4);
    //方式四(固定长度的集合，无法扩容)：
      //var l5 = new List();在新版本的dart里面没法使用这个方法了
      var l6 = new List.filled(2,"a"); //创建一个固定长度的集合
      var l7 = List<String>.filled(3,'s');//指定集合类型
      print(l6);
      print(l7);

  //四.定义Maps
    //方式一：
      var person = {
        "name":"张三",
        "age":20,
        "work":["程序员","送外卖"]
      };
      print(person);
    //方式二：
      var p = new Map();
      p["name"] = "李四";
      p["age"] = 22;
      p["word"] = ["程序员","送外卖"];
      print(p);

  //五.Dart判断数据类型
    //is 关键词来判断类型
    var str = "123";
    if(str is String){
      print('是string类型');
    }else{
      print('其他类型');
    }
}