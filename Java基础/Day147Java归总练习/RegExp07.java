package Day147Java归总练习;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//分组
public class RegExp07 {
    public static void main(String[] args) {
        String content = "hanshunping s7789 nn1189han";

        //未命名分组
        //String regStr = "(\\d\\d)(\\d\\d)";

        //命名分组：
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
            System.out.println("找到: " + matcher.group("g1"));
            System.out.println("找到: " + matcher.group("g2"));
        }
    }
}
