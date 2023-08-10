import UIKit
var a = 10

switch a
{
    case 10:
        print("情况1")
        fallthrough //还会继续往下执行
    case 20,30,40:  //多个里面只要有一个符合就可以执行
        print("情况2")
    default:
        print("没用匹配")
}

//结果为：情况1  情况2