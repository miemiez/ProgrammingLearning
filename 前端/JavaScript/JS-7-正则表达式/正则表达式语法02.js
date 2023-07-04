/*
    + ：匹配 1 位或多位，同{1,}
        {x,y} {5,8}：
            只能 5~8 位之间。
        {1，} = +：
            表示 1 到多位。
*/
let str01 = "sfsdff";
let reg01 = /^[a-z]+$/;
let result01 = reg01.test(str01);
console.log(result01);//true;

/*
    ? ：0 位或 1 位，同{0,1}
        ?代表 0 位或 1 位 ， ? = {0,1}
*/
let str02 = 'sf';
let reg02 = /^([a-z]?)([f]?)(\d?)$/;
let result02 = reg02.test(str02);
console.log(result02);//true

/*
    * ：匹配零个或多个连续的字符
        例如：/a*b/ 匹配零个或多个连续的 "a" 后面跟着一个 "b"。
*/

/*
    . ：匹配所有
        . 匹配所有 随便写什么都行别留空就行。
*/
let str03 = "";
let reg03 = /^.$/;
let result03 = reg03.test(str03);
console.log(result03);//false;

/*
    \ ：转义
        \转义符 要想匹配得到就要转义【"\"这个在字符串里也是转移】
*/
let str04 = "1+";
let reg04 = /^1\+$/;
let result04 = reg04.test(str04);
console.log(result04);//true

/*
    \d ：数字
        [0-9] = \d

    \w ：数字、字母、下划线
        [a-z 0-9 A-Z _] = \w
        [a-z 0-9 A-Z _]：只能输入 0~9 的数字、a~z 小写字母、A~Z 大写字母或者下划线
    
    \s ：空格或换行
*/

/*
    g ：全局匹配，找到所有能匹配到的内容。
*/
let str05 = "123abc456def789";
let reg05 = /[a-zA-Z]+/g;//全局匹配 找到所有能匹配到的内容
str05 = str05.replace(reg05,",");
console.log(str05);//123,456,789

/*
    reg.exec() ：
        显示匹配的内容。reg.exec()返回值是匹配的内容。
*/
let str06 = "1s23";
let reg06 = /[a-z]/;
let result05 = reg06.exec(str06);
console.log(result05);//[ 's', index: 1, input: '1s23', groups: undefined ]