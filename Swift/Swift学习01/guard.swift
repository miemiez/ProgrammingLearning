var a:String? = "swift"

func test1(params: String){
    guard let value = params else
    {
        print("进入guard语句里")
        return
    }
    print(value)
}

test1(params: a) //swift

//也可以换用if的写法
func test2(params: String){
    if let value = params
    {
        print("进入if语句里面")
        print(value)
    }else{
        return
    }
}

test2(params: a)//swift