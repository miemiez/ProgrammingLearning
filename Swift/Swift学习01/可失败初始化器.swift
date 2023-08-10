class Test{
    var name:String

    init?(name:String){
        if(name == "unknow"){
            return nil
        }

        self.name = name
    }
}

var t:Test? = Test(name: "unknow")

if let p = t
{
    print(p.name)
}else{
    print("初始化失败")
}
