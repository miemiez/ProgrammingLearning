var a:String = "hello world"

print(type(of: a))
print(a);

var aa = "hello world"
var b = "swift"
let c = 10
//拼接字符串的语法
print(aa + "\(c)")

//类型别名
typealias dog = Int

//类型转换：类型()和??语法
var aaa = "10"
var c = Double(a) ?? 0   //代表如果Double(a)能转成(为null)则把这个值赋值给c，如果不能，则把 0 赋值给c
print(Int(a))

print(Int(100.5)) //100
print(Double(10)) //10.0
print(Bool(0)) //false [swift中只要是非0的都是true]