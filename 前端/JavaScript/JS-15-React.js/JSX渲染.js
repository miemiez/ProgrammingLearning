/*
React 依赖于两件事来渲染：
    (1)渲染什么内容
    (2)将内容放置在哪里。
*/
import React from 'react';
import { createRoot } from 'react-dom/client';

const container = document.getElementById('app');
const root = createRoot(container);/*使用 react-dom/client 库中的createRoot()方法，
                                    它创建一个React root，这可用于渲染JSX表达式，（）内是React 渲染的“放置内容的位置”。*/
root.render(<h1>Hello world</h1>);
//使用render()方法来root呈现作为参数传入的内容。这里我们传递一个<h1>元素，它显示Hello world。这是 React 渲染的“渲染什么内容”部分。