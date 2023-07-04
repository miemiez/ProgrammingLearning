package Day147Java归总练习;

public class Homework02 {
    public static void main(String[] args) {
        /*
        要求验证是不是整数或者小数
        要考虑正数和负数
        比如：123 -345 34.89 -87.9 -0.01 0.45等
         */

        String content = "-1.23";
        String regStr = "^[-+]?([1-9]\\d*|0)+(\\.\\d+)?$";

        if (content.matches(regStr)) {
            System.out.println("匹配成功 是整数或者小数或者正数或者负数");
        } else {
            System.out.println("匹配失败");
        }
    }
}
