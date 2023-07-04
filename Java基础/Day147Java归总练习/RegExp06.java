package Day147Java归总练习;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示定位符
public class RegExp06 {
    public static void main(String[] args) {
        /*

        ^:指定起始字符
        $:指定结束字符
        \\b:匹配字符串的边界
        \\B:匹配字符串的非边界

         */

        String content = "123abc";

        //String regStr = "^[1-9]+[a-z]*";//至少以1个数字开头，后接任意个小写字母的字符串
        String regStr = "^[1-9]+[a-z]+$";//至少以1个数字开头，后接至少1个小写字母的字符串
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
