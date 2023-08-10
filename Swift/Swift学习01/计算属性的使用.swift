/*

在这段代码中，定义了一个名为 Test01 的结构体（struct）。结构体内部包含一个私有变量 value，
和一个计算属性 name。

1.value：私有变量 value 是一个空字符串的字符串类型变量。这个变量被用于存储 name 属性的值。

2.name：name 是一个计算属性。计算属性不直接存储值，而是通过 getter 和 setter 方法来获取和设置值。
在这里，name 属性只有 getter 方法和 setter 方法没有参数（无参数的 set 方法）。当外部代码通过 
Test01 实例的 name 属性获取值时，会执行 getter 方法；当外部代码通过 Test01 实例的 name 属性设置值时
，会执行 setter 方法。

    （1）getter 方法：在 getter 方法中，首先打印 "get"，然后返回私有变量 value 的值。

    （2）setter 方法：在 setter 方法中，首先将参数 param（也可以写成 newValue）赋值给私有变量 
    value，然后打印 "set - " + param（或 "set - " + newValue）。当外部代码设置 name 属性的值时，
    会调用这个 setter 方法。

这样，通过定义计算属性 name，你可以在获取和设置属性值时加入自定义的逻辑。在这个例子中，每次获取 name 属性时，会打印 "get"；每次设置 name 属性时，会打印 "set - " + 设置的值。
*/
struct Test01{
    private var value = ""

    var name: String
    {
        set(param) 
        {
            value = param
            print("set - " + param)
        } //如果把整个set删除掉，就成了只读属性
        /*
        set
        {
            value = newValue
            print("set - " + newValue)
        }
        */
        get
        {
            print("get")
            return value
        }
    }

    init(name: String)
    {
        self.name = name
    }
}

var person = Person()
person.name = "swift" //set - swift
print(person.name) //swift