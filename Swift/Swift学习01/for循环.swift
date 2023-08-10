for index in stride(from: -4,through: 10,by: 3).reverse()
{
    print(index)
}

for index in (0...5){
    print(index)
}

//如果你不需要序列的每一个值，你可以使用下划线来取代遍历名以忽略值
let base = 3
let power = 10
var answer = 1
for _ in 1...power{
    answer *= base
}

print("\(base) to the power of \(power) is \(answer)")