const {checkInventory, processPayment, shipOrder,check} = require('./JS-15-Promise练习02.js');

const order = {
  items: [['sunglasses', 1], ['bags', 2]],
  giftcardBalance: 79.82
};

check(order)
.then((resolvedValueArray) => {
    console.log(resolvedValueArray);
    return resolvedValueArray + 100;
})
.then((resolvedValueArray) => {
    console.log(resolvedValueArray);
})

checkInventory(order)
.then((resolvedValueArray) => {
  // Write the correct return statement here:
  return processPayment(resolvedValueArray);
})
.then((resolvedValueArray) => {
  // Write the correct return statement here:
  return shipOrder(resolvedValueArray);
})
.then((successMessage) => {
  console.log(successMessage);
})
.catch((errorMessage) => {
  console.log(errorMessage);
});