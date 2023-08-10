struct Person{
    private var array:[String] = ["swift","ios","macos"]

    subscript(index:Int,param:String) -> String{
        set{
            array.insert(newValue + param,at: index)
        }
        get{
            return array[index]
        }
    }
}

var p = Person()
p[0," world"] = "hello"
print(p[0,"aaa"]) //hello world