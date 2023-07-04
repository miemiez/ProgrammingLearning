//可以将 JSX 元素嵌套在其他 JSX 元素中，就像在 HTML 中一样。
<a href="https://www.example.com">
    <h1>
        Click me!
    </h1>
</a>

//如果一个 JSX 表达式占用多行，则必须将多行 JSX 表达式括在括号中。乍一看这看起来很奇怪，但会习惯的：
const theExample = (
    <a href="https://www.example.com">
      <h1>
        Click me!
      </h1>
    </a>
  );