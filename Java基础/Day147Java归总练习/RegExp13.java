package Day0608;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//经典的结巴程序
public class RegExp13 {
    public static void main(String[] args) {
        String content = "我...我要...学学学学...编程java！";

        //1.去掉所有的...
        Pattern pattern = Pattern.compile("\\.");//创建对象
        Matcher matcher = pattern.matcher(content);//拿对象去比原句
        content = matcher.replaceAll("");//删除.后，覆盖原来的句子

        System.out.println(content);

        //2.去掉重复的字
        /*
        （1）使用 (.)\\1+ 来捕获句子中所有连续重复的字
         注意：因为pattern被重置，matcher 也要被重新比较，不然无法返回上一句捕获的结果。
         (2)使用反向引用$1 来替换匹配到的内容

         */

//        pattern = Pattern.compile("(.)\\1+");
//        matcher = pattern.matcher(content);
//        while (matcher.find()) {
//            System.out.println(matcher.group(0));
//        }
//
//        //使用反向引用$1 来替换匹配到的内容
//        content = matcher.replaceAll("$1");
//        System.out.println("================");
//        System.out.println(content);

        //3.可以使用一条语句简化上方内容
        String s = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println("=================");
        System.out.println(s);
    }
}
