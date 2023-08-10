var a:Int? = nil //表示a可能有值，也可能无值

var b:Int? = 10

let value = b

print(a) //nil
print(b) //Optional(10)
print(b!) //10
print(value) //Optional(10)