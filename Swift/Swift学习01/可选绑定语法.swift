/*
    在 Swift 中，使用 if let 或 guard let 这样的可选绑定语法可以安全地解包可选类型的值，
    即从可选类型中取出非空的值。如果可选类型的值为 nil，则 if let 或 guard let 语句中的
    代码块不会被执行。
*/
var a: Int? = 10
if let b = a{
    print(b) // 10
}else{
    print("没用值")
}


//在Swift中，'类型!' 是一种特殊的可选类型，称为隐式解包可选类型
var a:Int! = 100
let b:Int = a  //这个 b 是可选类型，但是并没有用 ! 解析值
a = nil
print(b) // 100
print(a) //nil



//'类型!' 和 '类型?' 的区别就是，如果确定有值，则可以使用'类型!'
var v1:Int! = 100
let v2:Int = v1
print(v2) //100

var v3:Int? = 90
let v4 = v3!  //let v4:Int = v3!
print(v4)  //90