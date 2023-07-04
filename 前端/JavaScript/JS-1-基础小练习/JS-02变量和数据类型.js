function primeFinder(n) {
    // Write your code here
   var arr = [];
   var judge = false;
   var z = 0;
   for(var i = 0;i < n;i++){
     judge = false;
     for(var j = 2;j < i;j++) {
                  if(i % j === 0) {
                      judge = true;
                      arr[z++] = i;
                      break;
                  }
          }
   }
   return arr;
  }
  // Leave this so we can test your code:
  module.exports = primeFinder(11);