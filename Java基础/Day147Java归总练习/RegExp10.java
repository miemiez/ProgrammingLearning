package Day0608;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//实例应用1:号码
public class RegExp10 {
    public static void main(String[] args) {
        String content = "韩顺平教育";
        //1.汉字
        //String regStr = "^[\u0391-\uffe5]+$";汉字范围需要查询

        //2.邮编:
        //要求：1-9开头的一个六位数，例如：123890
        //String regStr = "^[1-9]\\d{5}$";

        //3.qq号码
        //要求：以1-9开头的一个5-10位数，例如：12389，1345687，187695344
        //String regStr = "^[1-9]\\d{4,9}$";

        //4.手机号
        //要求：必须以13,14,15,18开头的11位数，例如：13588889999
        String regStr = "^1[3|4|5|8]\\d{9}$";


        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

    }
}
