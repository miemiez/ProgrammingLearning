package Day147Java归总练习;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示转义字符的使用
public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(abc(123(";
        //匹配(
        String regStr = "\\(";//演示匹配转义符：\\
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }

    }
}
