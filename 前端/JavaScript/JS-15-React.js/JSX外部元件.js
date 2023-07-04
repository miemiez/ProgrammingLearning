//有一条规则：JSX 表达式必须恰好有一个最外层元素。
//换句话说，以下这段代码将起作用：
const paragraphs01 = (
    <div id="i-am-the-outermost-element">
      <p>I am a paragraph.</p>
      <p>I, too, am a paragraph.</p>
    </div>
  );

//以下这段代码将不起作用：
/* const paragraphs02 = (
      <p>I am a paragraph.</p> 
      <p>I, too, am a paragraph.</p>
   );
*/

/*
【！！!】
JSX 表达式的第一个开始标记和最后一个结束标记必须属于同一个 JSX 元素！
*/ 
