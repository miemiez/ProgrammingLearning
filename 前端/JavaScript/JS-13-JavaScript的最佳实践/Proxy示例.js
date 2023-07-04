let handler = {
    get:function(target,property){
        // console.log("target",target);
        // console.log("property",property);
        if(target.hasOwnProperty(property)){
            return `property的值为${target[property]}`;
        }else{
            console.log("没有找到你要的属性：")
            return;
        }
    }
}
/*
get: function(target, property) { ... } 是一个在 handler 对象中定义的拦截器方法。【这个方法会在访问代理对象的属性时被调用】。

target：表示被代理的目标对象，即通过 new Proxy() 创建的代理对象。在该拦截器方法中，我们可以通过 target 参数来访问和操作目标对象的属性。
property：表示被访问的属性名。当我们通过代理对象访问属性时，property 参数会接收被访问的属性名。
*/

var p = new Proxy({},handler);

p.a = 1;
p.b = 2;
p.c = 4;

console.log(p.a);
console.log(p.b);
console.log(p.c);
console.log(p.d);