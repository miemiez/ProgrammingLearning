const greet = (name) => {
    console.log('Hello' + name + '!');
}

const sayHello = (greet) => {
    greet('John');
}

sayHello(greet);