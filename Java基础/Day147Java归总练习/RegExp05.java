package Day0608;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示限定符的使用
public class RegExp05 {
    public static void main(String[] args) {
        String content = "1111111aaaahello";
        //a{3},1{4},(\\d){2}
      //  String regStr = "a{3}";//表示匹配aaa，由于原文本没有，就什么都不显示
        //String regStr = "1{4}";//表示匹配1111
      //  String regStr = "(\\d){2}";//表示匹配；两位的任意数字字符

        //{n,m}表示范围，最少出现n次，最多出现m次。
        //正则表达式 默认贪婪匹配，尽可能找多的。
       // String regStr = "a{3,4}";//表示匹配；aaa或者aaaa。优先级：aaaa
        //String regStr = "\\d{2,5}";//表示匹配；任意两位数到五位数。优先五位数，剩下再组

        //+ * ？
        //+：匹配一个或者多个，多个优先
        //String regStr = "1+";//表示匹配；一个1或多个1。优先最多的连续1
        String regStr = "\\d+";//表示匹配；一个1或多个数字。优先最多的连续数字

        //*:表示0个或者多个
        //String regStr = "1*";

        //?:表示0次或1次
        //String regStr = "1?";


        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
