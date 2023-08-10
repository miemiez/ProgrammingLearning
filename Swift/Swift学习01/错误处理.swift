enum TestError:String,Error{
    case error1 = "错误1"
    case error2 = "错误2"
}

func play(param: Int) throws -> String{
    if(param < 0){
        throw TestError.error1
    }else if(param >= 0 && param < 10){
        throw TestError.error2
    }else{
        return "输入正确"
    }
}

var value1 = try? play(param: 100) //可选的值，这样写的话，即使错误了，也不会抛出异常
var value2 = try? play(param: 5) //如果值不符合条件，也不会报错，而是返回一个nil
print(value1) //Optional("输入正确")
print(value2) //nil


do{
    var value3 = try play(param: 100)
    print(value3) ////输入正确   defer
}
catch TestError.error1
{
    print(TestError.error1.rawValue)
}
catch TestError.error2
{
    print(TestError.error2.rawValue)
}
defer
{
    print("defer")
}