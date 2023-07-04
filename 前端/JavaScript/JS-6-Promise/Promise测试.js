const test = () => {
    return new Promise((resolve,reject) => {
        resolve(method(5,5));
    })
}

const method = (x,y) =>{
    return x * y;
}

test().then(r => {const c = new Promise((resolve,reject) => {
    resolve(r*2);
});
    console.log(c);
    return c;
}).then(r => console.log(r));

console.log(10);

//10
//Promise{50}
//50