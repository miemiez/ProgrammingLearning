//如果对于函数的形式参数不想使用实际参数标签的话，可以利用下划线（ _ ）来为这个形式参数代替显式的实际参数标签。
func someFunction(_ firstParameterName: Int, secondParameterName: Int) {
    // In the function body, firstParameterName and secondParameterName
    // refer to the argument values for the first and second parameters.
}
someFunction(1, secondParameterName: 2)

func plusFunction(_ a:Int,_ b:Int) -> Int{
    return a + b
}

func minusFunction(_ a:Int,b:Int) -> Int{
    return a - b
}

func printMathResult(_mathResult:(Int,Int)->Int,_ a:Int,_ b:Int){
    return "Result:\(plusFunction(a,b))"
}

var plusFunctionAlias: (Int,Int) -> Int = plusFunction //plusFunction(_:_:)

printMathResult(plusFunction,10,2) //Result:12

printMathResult(minusFunction(_:b:),10,2) //Result:8

//匿名函数
printMathResult({(a,b) -> Int in return a * b},10,2) //Result:20


//内嵌函数
func chooseStepFunction(backward:Bool) -> (Int) -> Int{
    func stepForward(input:Int) -> Int{return input + 1}
    func stepBackward(input:Int) -> Int{return input - 1}
    return backward ? stepBackward : stepForward
}
var currentValue = -4
let moveNearerToZero = chooseStepFunction(backward: currentValue > 0)
while currentValue != 0{
    print("\(currentValue)...")
    currentValue = moveNearerToZero(currentValue)
}
print("zero")

//-4...
//-3...
//-2...
//-1...
//zero!