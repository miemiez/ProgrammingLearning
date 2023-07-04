/*
React 根方法的一个特别之处render()是它只更新已更改的 DOM 元素。

这意味着如果您连续两次渲染完全相同的内容，则第二次渲染将不会执行任何操作：
*/

const hello = <h1>Hello world</h1>;
 
// This will add "Hello world" to the screen:
root.render(hello, document.getElementById('app'));
 
// This won't do anything at all:
root.render(hello, document.getElementById('app'));