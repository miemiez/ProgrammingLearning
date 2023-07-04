/*异步（Promise）：
    1.Pending(还没有运行)
    2.Fulfilled(运行结束)
    3.Rejected(运行失败，这样的结果通常是因为产生Error了)
    */

//要构建一个承诺，要创建一个新的Promise对象，我们可以使用new关键字和Promise构造函数方法。
const executorFunction = (resolve,reject) => {
    if(someCodition){
        resolve('I resolved!');
    }else{
        reject('I rejected!');
    }
};
const myFirstPromise = new Promise(executorFunction);