class Customer {
    constructor(userId, first, last) {
        this.userId = userId;
        this.first = first;
        this.last = last;
        this.itemsPurchased = [];
        this.transactions = [
             { transactionId: 1, transactionTotal: 433 },
             { transactionId: 2, transactionTotal: 289 },
             { transactionId: 3, transactionTotal: 99 },
             { transactionId: 4, transactionTotal: 600 }
        ];
 }
    getTotal() {
         return this.transactions.reduce((a,b) => ({transactionTotal: a.transactionTotal + b.transactionTotal})).transactionTotal;
        // return this.transactions.reduce((a,b) => (
        //   console.log(a , b , `\n`)
        //  ));
          //return this.transactions.reduce((a,b) => (a + b.transactionTotal),0);
    }
       

 }
let bilbo = new Customer(1, "Bilbo", "Baggins");
console.log(bilbo.getTotal());

/*
我们想要重构上面的代码，以便Customer对象只负责直接与客户相关的信息，
例如客户 ID 以及名字和姓氏。新类型的类（例如事务、事务和产品）可以处理附加信息和方法。
*/