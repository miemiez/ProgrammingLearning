let stu = {
    name:"小花",
    friends:["小白","小黑","小明"],
    play:function(){
        this.friends.forEach((e1,e2,e3) => console.log(this.name + "与" + e1 + "在玩耍" + e2 + e3),stu2);
    }
}
let stu2 = {
    name: "aaa",
    arr : ['a','b','c']
}

console.log(typeof true);
stu.play();