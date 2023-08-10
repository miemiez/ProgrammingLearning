struct Person{
    var name:String = "unknow"
    {
        willSet
        {
            print("willSet - " + newValue)
        }
        oldSet
        {
            print("didSet - " + oldValue)
        }
    }

    init(){

    }
}

var person = Person()
person.name = "hello"
//willSet - hello
//didSet - unknow