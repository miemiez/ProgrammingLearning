/*
工厂模式是一种创建对象的设计模式，它通过定义一个公共接口来创建对象，而不暴露对象的具体实现细节。
这种模式可以隐藏对象的创建逻辑，使代码更加灵活和可维护。

在工厂模式中，通常有一个工厂函数，该函数根据传入的参数或条件来创建并返回相应类型的对象。这样，
客户端代码可以通过调用工厂函数来获取所需的对象，而无需直接与对象的构造函数或类进行交互。
*/

// 定义汽车工厂函数
function carFactory(type) {
    if (type === "sedan") {
      return new SedanCar();
    } else if (type === "suv") {
      return new SuvCar();
    } else if (type === "sports") {
      return new SportsCar();
    } else {
      throw new Error("Invalid car type!");
    }
  }
  
  // SedanCar 类
  function SedanCar() {
    this.type = "sedan";
    this.engine = "V6";
    this.price = 30000;
  }
  
  // SuvCar 类
  function SuvCar() {
    this.type = "suv";
    this.engine = "V8";
    this.price = 40000;
  }
  
  // SportsCar 类
  function SportsCar() {
    this.type = "sports";
    this.engine = "V12";
    this.price = 50000;
  }
  
  // 使用工厂函数创建汽车对象
  const sedan = carFactory("sedan");
  const suv = carFactory("suv");
  const sports = carFactory("sports");
  
  console.log(sedan); // 输出：SedanCar { type: 'sedan', engine: 'V6', price: 30000 }
  console.log(suv); // 输出：SuvCar { type: 'suv', engine: 'V8', price: 40000 }
  console.log(sports); // 输出：SportsCar { type: 'sports', engine: 'V12', price: 50000 }
  