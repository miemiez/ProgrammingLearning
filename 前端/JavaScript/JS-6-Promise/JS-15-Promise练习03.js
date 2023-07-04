const arr = [10,99,45];

const handlePromise = (resolve,reject) => {
    if(arr[1] > arr[0]){
        resolve('success');
    }else{
        reject('fail');
    }
}

const checkPromise = (handlefunction) => {
    return new Promise(handlefunction);
}

const processPayment = (arg) => {
    return new Promise((resolve) => {
        resolve(arg);
    });
}

checkPromise(handlePromise)
.then((arg) => {
    console.log(arg);
    arg = arg + '10';
    return processPayment(arg)
    .then((arg) => {
        console.log(arg);
        return processPayment(handlePromise);
    })
});//循环地狱，很少会去用