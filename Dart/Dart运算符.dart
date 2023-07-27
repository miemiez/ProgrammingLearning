void main(){
  int a = 13;
  int b = 2;
  print(a/b);
  print(a~/b);//整除

  //??运算符【如果c为空的话，就把??后面的值赋给 d，如果c不为空的话，则将c赋值给d】
    var c;
    var d = c ?? 10;
    print(d);

  //基础赋值运算符从右向左执行】：??=：如果e为空的话，把23赋给e
    // int e;
    // e??=23;
    // print(e);

    int f = 6;
    f??=8;
    print(f);
}