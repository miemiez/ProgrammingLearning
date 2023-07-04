function greet(message) {
    console.log(message + ' ' + this.name);
  }
  
  const person = {
    name: 'John'
  };
  
  greet('Hello'); // 直接调用函数
  greet.call(person, 'Hello'); // 使用 call() 方法调用函数并设置 this 值为 person 对象
  