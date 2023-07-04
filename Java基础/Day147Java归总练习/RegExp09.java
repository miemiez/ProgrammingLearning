package Day0608;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//非贪婪匹配：修饰符后加？：例如+？，*？......
public class RegExp09 {
    public static void main(String[] args) {
        String content = "hello111111 ok";
        //String regStr = "\\d+";//默认贪婪匹配//111111

        //非贪婪匹配
        String regStr = "\\d+?";//非贪婪匹配，尽量找最少的//结果就是6个1



        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
