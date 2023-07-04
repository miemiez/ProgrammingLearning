const inventory = {
    sunglasses: 1900,
    pants: 1088,
    bags: 1344
  };
  
  // Write your code below:
  const myExecutor = (resolve,reject) => {
    if(inventory.sunglasses > 0){
      setTimeout(() => resolve('Sunglasses order processed.'),2000);
    }else{
      reject('That item is sold out.');
    }
  }
  
  const orderSunglasses = () => {
    return new Promise(myExecutor);
  }
  
  const orderPromise = orderSunglasses();
  
  console.log(orderPromise);
  console.log(orderPromise.then((result) => console.log('Promise resolved:' , result)).then((result) => console.log('Promise resolved:' , result , '!!!')) );