/*
在您最喜爱的社交媒体平台上，其他用户可以关注您的活动，并在您发布新内容时收到通知。
同样，使用观察者模式，对象可以具有“订阅”以查看另一个对象的更改的依赖关系。通知可以以一对多的关系流动，即一个变化的对象可以通知许多其他对象。
*/

/*
在该示例中，通知流的基本模型发生在Account对象之间，对象使用.addToFollowers()和.removeFromFollowers()方法将其他Account对象订阅其源活动。
在现实世界中，您更有可能在不同类型的对象之间使用观察者模式来跟踪状态变化，但该示例显示了如何将更新推送到其他对象。
*/

class Account {
    constructor() {
        this.followers = [];
        this.feed = [];
    }
    addToFollowers(follower) {
        this.followers.push(follower);
    }
    removeFromFollowers(follower) {
        this.followers.splice(this.followers.indexOf(follower), 1);
    }
    publish(post) {
        this.followers.forEach(follower => follower.update(post));
    }
    update(post) {
      this.feed.push(post);
    }
}
 
let a = new Account();
let b = new Account();
let c = new Account();
 
a.addToFollowers(b);
a.addToFollowers(c);
 
a.publish("Hello, world");
 
console.log(a);   
/* Output shows b and c objects listed in a's followers array:
[
  Account { followers: [], feed: [ 'Hello, world' ] },
  Account { followers: [], feed: [ 'Hello, world' ] }
] 
*/
 
console.log(b); 
// Account { followers: [], feed: [ 'Hello, world' ] }