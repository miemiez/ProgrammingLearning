async function fivePromise() {
    let r = await c;
    console.log(r);//在这个练习中，是最后打印的
    return r;
}

let c = new Promise((resolve,reject) => {
    if(true){
        resolve("aaa");
    }else{
        reject("bbb");
    }
});

console.log(fivePromise());
console.log(c);