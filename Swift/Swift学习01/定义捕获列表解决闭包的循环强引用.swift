class Test{
    var name: String

    lazy var data:() -> Void:{[weak self]() -> Void in //定义捕获列表
        print("姓名=" + self!.name)
    }

    init(name:String){
        self.name = name
    }

    deinit{
        print("Test实例被销毁 - " + self.name)
    }

    func myFunc(){
        print("My name is" + self.name)
    }
}

var t:Test? = Test(name:"TOM")
t!.data() //这里闭包的初始化以及调用，会导致闭包中的self指向了Test(name:"TOM")，从而导致即使t = nil了也无法讲内存释放，这个时候就可以用定义捕获列表的弱引用或者无主引用来解决[weak self]/[unowned self]
t!.myFunc()
t = nil