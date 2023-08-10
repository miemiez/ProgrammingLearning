enum TestEnum{
    case name(String)
    case age(Int)
    case xy(Int,Int)
}

func play(params:TestEnum){
    switch params {
    case TestEnum.name("hello"):
        print("hello")
    case TestEnum.age(10):
        print(10)
    case TestEnum.xy(100,200):
        print(100,200)
    default:
        print("没用匹配")
    }
}

play(params: TestEnum.name("hello")) //hello
play(params: TestEnum.age(11)) //没用匹配


//枚举的遍历【要实现CaseIterable】
enum TestEnum2:CaseIterable
{
    case A
    case B
    case C
}

//方法一
for item in TestEnum2.allCases{
    print(item)
}

//方法二
for index in (0..<TestEnum2.count){
    print(TestEnum2.allCases[index])
}