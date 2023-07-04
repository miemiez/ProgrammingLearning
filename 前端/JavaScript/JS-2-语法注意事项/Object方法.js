const person = {
    "name" : "mmz",
    sayHello() {
        console.log(`My name is ${this.name}.`);
    }
}

const student = Object.create(person);//创建student对象，并将其原型设置为person
console.log(student.name);//mmz
student.sayHello();//My name is mmz.

const arr = Object.values(person);//创建以person对象属性值为元素的数组
arr.forEach(() => {
        console.log(arr);
});