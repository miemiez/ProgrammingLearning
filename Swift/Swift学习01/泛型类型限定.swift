class Data
{
    var name: String
    init(name:String)
    {
        self.name = name
    }
}

func play<T:Any>(param:T){  //泛型类型的限定
    var a = param as! Data
    print(a.name)
}

play(param: Data(name: "hello")) //hello