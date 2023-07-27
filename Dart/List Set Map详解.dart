import 'dart:async';

void main(){
  //List
    //List里面的常见属性：
      List myList = ['香蕉','苹果','西瓜'];
      print(myList.length);
      print(myList.isEmpty);
      print(myList.isNotEmpty);
      print(myList.reversed);
      
      var newMyList = myList.reversed.toList();
      print(newMyList);
    
    //List里面的方法：
      List myList02 = ['香蕉','苹果','西瓜'];
      myList02.addAll(['桃子','葡萄']);//拼接数组
      print(myList02.indexOf('苹果')); //indexOf查找数据，查找不到返回-1，查找到返回索引
      print(myList02.remove('西瓜'));
      print(myList02.removeAt(2));
      myList02.fillRange(1, 2,'aaa'); //(start,end]，全部替换成'aaa'
      print(myList02);
      myList02.insert(1,"梨子");//表示在指定位置插入数据
      myList02.insertAll(1, ['榴莲','木瓜']);//插入多个
      var str = myList02.join(',');//返回值是String类型
      print(str);
      var list = str.split(",");//返回值是List类型
      print(list);
  

  //Set
    //用它最主要的功能是去除数组重复内容
    //Set是没有顺序且不能重复的集合，所以不能通过索引去获取值
      var s = new Set();
      s.add('香蕉');
      s.add('苹果');
      s.add('苹果');
      print(s);
      print(s.toList());//将Set转换成List

      List myList03 = ['香蕉','苹果','西瓜','香蕉','苹果','香蕉','苹果'];
      var s02 = new Set();
      s02.addAll(myList03);
      print(s02);//将List中的数据，添加到Set中，并自动去重

  
  //Map
    //创建方式一：
      var person = {
        "name":"张三",
        "age":23
      };
    //创建方式二：
      var m = new Map();
      m["name"] = "李四";
      print(person);
      print(m);
    //常用属性：
      print(person.keys.toList());
      print(person.values.toList());
      print(person.isEmpty);
      print(person.isNotEmpty);
    //常用方法：
      person.addAll({"sex":"男",
                    "height":180
      });
      person.remove("sex");//传参为键
      print(person.containsKey("age"));
      print(person.containsValue("李四"));


  //方法：
    //forEach(遍历循环)
    myList03.forEach((element) {print(element);});
    //map(修改集合里的数据)
    var newList02 = myList03.map((element){
      return element*2;
    });
    print(newList02);
    //where
    List myList04 = [1,3,4,5,7,8,9];
    var myList05 = myList04.where((element){
      return element > 1;
    });
    print(myList05);
    //any
    var f = myList04.any((element){ //只要集合里面有满足条件的就返回true
      return element > 5;
    });
    print(f);
    //every
    var every = myList04.every((element){ //要集合里面所有的数据都满足条件，才返回true
      return element > 5;
    });
    print(every);
}