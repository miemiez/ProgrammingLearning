var str = "ABCDEF"

str.startIndex
str.endIndex

print(str[str.startIndex]) //A
print(str[str.index(before: str.endIndex)]) //F
print(str[str.index(str.startIndex,offsetBy:3)]) //D

var a = str.index(str.startIndex,offsetBy: 2)
var b = str.index(str.startIndex,offsetBy: 4)
print(str[a...b])//CDE
print(str.prefix(4))//ABCD

var c = str.firstIndex(of: "E") ?? str.endIndex
print(str[str.startIndex...c]) //ABCDE