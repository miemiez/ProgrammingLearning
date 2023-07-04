const method01 = (num) =>{
    return new Promise((resolve,reject) => {
        if(num > 10){
            resolve("aaa");
        }else{
            reject("bbb");
        }
    })
}

method01(11)
.then(value => {
    if(value > 20){
        console.log(value + "14");
    }
    throw new Error("Request failed!");
},failedError => console.log(failedError + "17"));