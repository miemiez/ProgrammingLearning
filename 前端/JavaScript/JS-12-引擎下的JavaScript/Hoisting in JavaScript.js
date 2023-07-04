/*
Hoisting（变量提升）是 JavaScript 中的一种行为，指的是在代码执行之前，变量和函数的声明会被提升到当前作用域的顶部。

在 JavaScript 中，变量和函数的声明会在代码实际执行之前进行处理。这意味着可以在声明之前使用变量或函数，而不会引发错误。
这是因为 JavaScript 引擎在执行代码之前会将变量和函数的声明提升到当前作用域的顶部。

具体来说，变量声明会被提升，但变量的赋值操作并不会提升。函数声明也会被提升，并且整个函数体都会被提升，
因此可以在函数声明之前调用函数。
*/

//示例：
console.log(x); // undefined
var x = 10;

console.log(y()); // "Hello"
function y() {
  return "Hello";
}