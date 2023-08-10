//当一个引用类型对象只要被变量引用，那么就是强引用，如果引用类型对象无变量指向，则会调用反初始化器

class Test{
    var name:String
    
    init(name:String)
    {
        self.name = name
    }

    deinit{ //反初始化器
        print("Test被销毁 - " + self.name)
    }
}

var t1:Test? = Test(name:"hello")
var t2 = t1
var t3 = t1 // t1,t2,t3都指向Test(name:"hello")

t1 = nil
t2 = nil
t3 = nil//Test被销毁 - hello
 //这时候反初始化器被调用