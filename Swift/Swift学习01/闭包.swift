func printMathResult2(_ mathFunction: (Int,Int) -> Int,_ a:Int,_ b: Int) -> Int{
    return mathFunction(a,b)
}

//一.完整闭包
printMathResult2({(a:Int,b:Int) -> Int in return a*b},10,2)  //乘法，20【闭包的完整写法】

/*
当把闭包作为行内闭包表达式传递给函数或方法时，形式参数类型和返回类型都可以被推断出来。
所以说，当闭包被用作函数的实际参数时你都不需要用完整格式来书写行内闭包。
*/


//二.单表达式闭包
//单表达式闭包能够通过从它们的声明中删掉 return 关键字来隐式返回它们单个表达式的结果
//单表达式也就是方法体中只有一句的时候可以省略return
printMathResult2({a,b in a/b},10,2)  //除法，5【从单表达式闭包隐式返回】


//三.简写实际参数名
//swift 自动对行内闭包提供简写实际参数名，你也可以通过 $0 , $1 , $2 等名字来引用闭包的实际参数值。
/*
如果你在闭包表达式中使用这些简写实际参数名，那么你可以在闭包的实际参数列表中忽略对其的定义，
并且简写实际参数名的数字和类型将会从期望的函数类型中推断出来。 in  关键字也能被省略，
因为闭包表达式完全由它的函数体组成：
*/
printMathResult2({$0 - $1},10,2)  //减法，8


//四.运算符函数
//更加简略的闭包
/*
实际上还有一种更简短的方式来撰写上述闭包表达式。Swift 的 String 类型定义了关于大于号（ >）
的特定字符串实现，让其作为一个有两个 String 类型形式参数的函数并返回一个 Bool 类型的值。
这正好与  sorted(by:) 方法的第二个形式参数需要的函数相匹配。因此，你能简单地传递一个大于号，
并且 Swift 将推断你想使用大于号特殊字符串函数实现：
*/
printMathResult2( + ,10,2) //加法，12


//五.尾随闭包
/*
如果你需要将一个很长的闭包表达式作为函数最后一个实际参数传递给函数且闭包表达式很长，
使用尾随闭包将增强函数的可读性。尾随闭包是一个被书写在函数形式参数的括号外面（后面）的闭包表达式，
但它仍然是这个函数的实际参数。当你使用尾随闭包表达式时，不需要把第一个尾随闭包写对应的实际参数标签。
*/
  func someFunctionThatTakesAClosure(closure:() -> Void){
       //function body goes here
  }

  //here's how you call this function without using a trailing closure
 
  someFunctionThatTakesAClosure({
       //closure's body goes here
  })
    
  //here's how you call this function with a trailing closure instead
      
  someFunctionThatTakesAClosure() {
       // trailing closure's body goes here
  }

  //如果闭包表达式作为函数的唯一实际参数传入，而你又使用了尾随闭包的语法，那你就不需要在函数名后边写圆括号了：
  someFunctionThatTakesAClosure { $0 > $1 }


//六.捕获值
  /*
  一个闭包能够从上下文捕获已被定义的常量和变量。即使定义这些常量和变量的原作用域已经不存在，
  闭包仍能够在其函数体内引用和修改这些值。

  在 Swift 中，一个能够捕获值的闭包最简单的模型是内嵌函数，即被书写在另一个函数的内部。
  一个内嵌函数能够捕获外部函数的实际参数并且能够捕获任何在外部函数的内部定义了的常量与变量。
  */
  func makeIncrementer(forIncrement amount:Int) -> () -> Int{
    var runningTotal = 0
    func incrementer() -> Int{
        runningTotal += amount
        return runningTotal
    }
    return incrementer
  }

  var myInc1 = makeIncrementer(1)
  print(myInc()) //1
  print(myInc()) //2
  //myInc1,myInc2这些常量指向的闭包仍可以增加已捕获的变量 runningTotal 的值。这是因为函数和闭包都是引用类型。
  var alsoMyInc1 = myInc1
  print(alsoMyInc1()) //3

  //如果建立了第二个 incrementer ,它将会有一个新的、独立的 runningTotal 变量的引用：
  var myInc2 = makeIncrementer(7)
  print(myInc2()) //7


//七.逃逸闭包
/*
一个接受闭包作为参数的函数，该闭包可能在函数返回后才被调用，也就是说这个闭包逃离了函数的作用域，
这种闭包称为逃逸闭包。
当你声明一个接受闭包作为形式参数的函数时，你可以在形式参数前写 @escaping 来明确闭包是允许逃逸的。
*/
/*
逃逸闭包的生命周期：

1、闭包作为参数传递给函数；

2、退出函数；

3、闭包被调用，闭包生命周期结束。

即逃逸闭包的生命周期长于函数，函数退出的时候，逃逸闭包的引用仍被其他对象持有，不会在函数结束时释放。
*/
/*
闭包可以逃逸的一种方法是被储存在定义于函数外的变量里。比如说，很多函数接收闭包实际参数来作为启动异步
任务的回调。函数在启动任务后返回，但是闭包要直到任务完成——闭包需要逃逸，以便于稍后调用。举例来说：
*/
var completionHandlers: [() -> Void] = [] //闭包可以逃逸的一种方法是被储存在定义于函数外的变量里
func someFunctionWithEscapingClosure(completionHandler: @escaping () -> Void) {
    completionHandlers.append(completionHandler)
}