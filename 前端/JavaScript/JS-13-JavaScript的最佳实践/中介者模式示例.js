/*
如果您曾经使用过乘车共享应用程序乘车回家，您可能还记得您通过该应用程序发送请求，
然后该应用程序“调解”并指派司机来接您。您不是直接打电话给司机来接您。从同样的意义上讲，
代码中的中介模式充当中央接口，封装代码库的不同部分如何相互通信。

此模式有助于防止不同类或组件之间存在太多直接关系，并帮助不同的组件了解应用程序状态的更改。
作为一个好处，它还使您的代码更可重用并且更容易修改，因为类不是紧密耦合的。
*/


/*
在下面的例子中，Passenger对象可以通过对象发送请求RideshareApp，对象充当Driver对象与Passenger对象之间的中介者。
Passenger和对象的接口Driver比您在现实场景中看到的更简单，并且不处理这两种类型的对象之间通信的复杂性。
事实上，在我们的示例中，这两种类型的对象不需要知道存在哪些实例。
*/
class Passenger {
    constructor(name) {
      this.name = name;
    }
    sendRequest(rideshareapp) {
      rideshareapp.receiveRequest(this.name);
    }
}
 
class Driver {
    constructor(name) {
        this.name = name;
    }
    goOnline(rideshareapp) {
        rideshareapp.addDriver(this.name);
    }
}
 
class RideshareApp {
    constructor() {
      this.drivers = [];
      this.riders = [];
    }
    addDriver(name) {
        this.drivers.push(name);
    }
    updateDriverArray(name) {
        this.drivers.splice(this.drivers.indexOf(name), 1);
    }
    assignDriver() {
        // We will assume there are always more drivers than riders
        return this.drivers[Math.floor(Math.random(this.drivers.length))].name;
    }
    receiveRequest(passenger) {
        const driver = this.assignDriver();
        console.log(driver);
        this.sendNotification(passenger, driver);
        this.updateDriverArray(driver);
    }
    sendNotification(passenger, driver) {
        console.log(`${driver} is assigned to ${passenger}.`)
    }
}
 
const rideshareapp = new RideshareApp();
 
const james = new Passenger("James");
const sarah = new Driver("Sarah");
 
rideshareapp.addDriver(sarah);
james.sendRequest(rideshareapp);