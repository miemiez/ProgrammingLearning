struct Test{
    var name:String
    var age:Int
}

var t = Test(name:"hello",age:10) //默认有一个带有全部属性的的构造器
print(t.name) //hello
print(t.age) //10