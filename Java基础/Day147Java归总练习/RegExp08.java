package Day147Java归总练习;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示非捕获分组，语法比较奇怪
public class RegExp08 {
    public static void main(String[] args) {

        String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";

        //1.找到 韩顺平教育，韩顺平老师，韩顺平同学

        //String regStr = "韩顺平教育|韩顺平老师|韩顺平同学";
        //上面的写法可以等价于非捕获分组：如下
        //String regStr = "韩顺平(?:教育|老师|同学)";//非捕获分组不能matcher.group(1)

        //2.找到 韩顺平 关键字，但是要求只查找 韩顺平教育 和 韩顺平老师 中的韩顺平。
        //String regStr = "韩顺平(?=教育|老师)";//非捕获分组不能matcher.group(1)

        //3.找到 韩顺平 关键字，但是要求只查找 不包含韩顺平教育和韩顺平老师 的其他韩顺平
        String regStr = "韩顺平(?!教育|老师)";//非捕获分组不能matcher.group(1)

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }


    }
}
