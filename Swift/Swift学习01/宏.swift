//独立宏
//要调用独立宏，你在宏名称前加上井号（#），并在名称后的括号中写入宏的任何参数
func myFunction() {
    print("Currently running \(#function)")
    #warning("Something's wrong")
}
/*
在第一行中， #function  调用了Swift标准库中的 function  宏。当你编译这段代码时，
Swift 会调用该宏的实现，将 #function  替换为当前函数的名称。当你运行这段代码并调用 
myFunction()  时，它会打印出“Currently running myFunction()”。在第二行中， #warning  
调用了 Swift 标准库中的 warning(_:)  宏，用于生成自定义的编译时警告。
*/
//独立宏可以产生一个值，就像 #function  这样，也可以在编译时执行一个动作，就像 #warning  这样。