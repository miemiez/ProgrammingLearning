//一.convenience
/*
便利初始化器（convenience initializer）是在已有的初始化器基础上提供额外的初始化方式，
使得创建实例更加方便。便利初始化器通常不会直接设置所有属性的初始值，而是调用其他初始化器
来完成初始化。
*/
class Person{
    var name:String
    var age:Int

    init(name:String,age:Int){
        self.name = name
        self.age = age
    }

    convenience init(name:String){
        //调用指定初始化器
        self.init(name:name,age:0)
    }
}

let person1 = Person(name:"Alice",age:23)
let person2 = Person(name:"Bob") //使用便利初始化器，age默认属性为0


//二.extension关键字
/*
extension 是一个关键字，用于为现有的类、结构体、枚举或协议添加新的功能，包括添加新的属性、
方法、初始化器等。使用 extension 关键字，可以在不修改原始类型定义的情况下，为它们提供额外的功能。
*/
struct Point {
    var x: Int
    var y: Int
}

// 为 Point 结构体添加一个新的计算属性 length，表示点到原点的距离
extension Point {
    var length: Double {
        return sqrt(Double(x * x + y * y))
    }
}

// 定义一个简单的协议 Printable，要求遵循该协议的类型必须有一个可打印的描述信息
protocol Printable {
    var description: String { get }
}

// 为 Point 结构体遵循 Printable 协议，并提供一个自定义的描述信息
extension Point: Printable {
    var description: String {
        return "(\(x), \(y))"
    }
}

let point = Point(x: 3, y: 4)
print("Point: \(point)") // 输出：Point: (3, 4)
print("Length: \(point.length)") // 输出：Length: 5.0



//三.@objc
/*
可选协议要求：你可以在协议定义时使用 optional 关键字来标记一些协议要求是可选的。
如果一个类或结构体遵循了一个含有可选要求的协议，那么它可以选择性地实现这些可选要求。
使用可选要求时，必须将协议声明为 @objc 协议，并且该协议只能被类所遵循。
*/
@objc protocol Animal {
    func eat()
    func sleep()

    @objc optional func sound()
}

class Dog: Animal {
    func eat() {
        print("狗吃东西")
    }

    func sleep() {
        print("狗睡觉")
    }

    // sound() 方法是可选的，我们可以选择实现它，也可以不实现
    // 如果不实现，在 Dog 类中调用 sound() 方法时什么也不会发生
    func sound() {
        print("汪汪汪")
    }
}


//四.lazy
//延迟初始化，只有使用的时候才会被初始化
class Data{
    init()
    {
        print("Data init")
    }

    func play(){
        print("Data play")
    }
}

class Test
{
    lazy var data:Data = Data()

    init()
    {
        print("Test init")
    }
}

var test = Test() //Test init
test.data.play() //Data init    Data play



//五.必要初始化器required
/*
使用 required 关键字的情况有两种：
    1.实现协议初始化器要求：当一个类遵循了一个带有必需初始化器要求的协议，该类必须提供该初始化器的实
    现，并且使用 required 关键字标记该初始化器。这样，在所有遵循该协议的子类中，都必须实现该初始化器。

    2.子类重写父类必需初始化器：当一个父类中的初始化器被标记为 required，并且你在子类中重写该初始化器
    时，你也必须在子类中使用 required 关键字标记该初始化器。这样，子类的构造器会继承父类的 required 
    特性，意味着所有子类都必须实现这个初始化器。
*/