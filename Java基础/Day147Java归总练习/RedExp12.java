package Day147Java归总练习;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//反向引用：//加上组号
public class RedExp12 {
    public static void main(String[] args) {
        String content = "33333 hello jack tom11 j12321-333999111ack22 yyy xxx 4554 9086 00331221";

        //1.要求匹配两个连续相同的数字:(\\d)\\1
        //String regStr = "(\\d)\\1";//捕获一个（）内的数字，反向引用：组1:\\1

        //2.要求匹配五个连续相同的数字:(\\d)\\1{4}
        //String regStr = "(\\d)\\1{4}";

        //3.要匹配个位与千位相同，十位与百位相同的数， 5225，1551.即回文。(\\d)(\\d)\\2\\1
        //String regStr = "(\\d)(\\d)\\2\\1";

        /*
        请在字符串中检索商品编号，形式如：12321-333999111 这样的号码，
        要求满足前面是一个五位数，然后一个-号，然后是一个九位数名连续的每三位相同
         */
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }

    }
}
