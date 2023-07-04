package Day147Java归总练习;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示选择匹配符 |
public class RegExp04 {
    public static void main(String[] args) {
        String content ="han 韩 寒冷";
        String regStr = "han|韩|寒";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
