//curried_add()是一个被Currying转换过的函数，它可以接收多个参数，并返回一个新的函数，以支持部分应用。


//示例1：
function curried_add(x) {
return function(y) {
    if (typeof y !== 'undefined') {
        return curried_add(x + y);
    } else {
        return x;
    }
    }
}

const add = curried_add(0);
console.log(add(2)(3)(4)()); // 输出 9

/*在上面的示例中，curried_add()函数接收一个参数x，并返回一个新的函数。
这个新函数可以继续接收下一个参数y，并返回另一个新函数。如果调用这个新函数时不传递参数，那么它会返回当前的累积值x。

通过调用curried_add(0)，我们创建了一个新的函数add，它用于累加数字。通过连续调用add(2)(3)(4)()，
我们可以依次传递参数，并得到最终的累加结果9。
*/


//示例2：
function changeColor(color) {
    return function(obj) {
        obj.color = color;
    }
 }
    
    // 用箭头函数重写changeColor
    const changeColorArrow = color => obj => {
    obj.color = color;
    }