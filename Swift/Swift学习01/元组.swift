//元组是值传递，并非引用传递
var a = (1,15.6,"hello",true)

var b:(Int,String) = (10,"Swift")

var c = a

c.0 = 0 //由于是值传递，所以这里修改c内的数据，并不会影响a

print(a.0) // 1
print(a.2) // hello


//自动类型推断
let (name1,name2) = ("swift",1.5)
let (name3,_ ,name4) = ("java",true,2.0) // _代表忽略

print(name1)//swift
print(name2)//1.5
print(name3,name4) // java 2.0


//元组类型作为参数传入到方法里进行修改
var data = (name1:1,name2:"hello",name3:true)

/*
在 Swift 中，元组内部的值是不可变的，一旦创建后不能再修改。如果需要修改元组内部的值，可以通过
 inout 参数将元素传递给函数，并在函数内部进行修改。但是，修改的是元素的值而不是元组本身的结构。

 请注意，修改参数的元组需要满足以下条件：
    1.定义函数时，参数的元组要声明为 inout，表示允许在函数内部修改参数。
    2.调用函数时，传递参数时要加上 & 符号，表示将参数的地址传递给函数，以便在函数内部修改它们
*/

func handle(parm:(Int,String,Bool)) -> (Int,String,Bool){
    var data_temp = parm
    data_temp.0 = parm.0 + 1
    data_temp.1 = parm.1 + " world"
    data_temp.2 = false
    return data_temp
}

print(handle(parm: data))

//在 Swift 中,函数参数默认情况下是常量（使用 let 声明的）