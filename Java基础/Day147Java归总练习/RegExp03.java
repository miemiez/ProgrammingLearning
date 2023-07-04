package Day0608;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示 字符匹配符 的使用
public class RegExp03 {
    public static void main(String[] args) {
        String content = "a11c8ABC";
        String regStr1 = "[a-z]";//匹配 a-z之间任意字符
       // String regStr2 = "[A-Z]";//匹配 A-Z之间任意字符
       // String regStr3 = "abc";//匹配 abc字符串
       // String regStr4 = "(?i)abc"//表示 (?i) 后面的字母不区分大小写 。
        // String regStr4 = "[^a-z]"//表示除去 ^ 后续的，其他字符，\\D有同样的效果。
        Pattern pattern = Pattern.compile(regStr1);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
