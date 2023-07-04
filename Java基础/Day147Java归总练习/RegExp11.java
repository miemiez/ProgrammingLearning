package Day0608;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//实例应用2:地址
public class RegExp11 {
    public static void main(String[] args) {

        String content = "https://www.bilibili.com/video/BV1fh411y7R8?p=894&spm_id_from=pageDriver&vd_source=18cf74d43919b8892c064f8389710cc4";

        /*
        思路
        1.先确定 url 的开始部分 https:// 还是 http://
        2.然后通过 ([\w-]+\.)+[\w-]+ 来匹配 www.bilibili.com
        3. /video/BV1fh411y7R8?p=894&spm... 匹配 (\/[\w-?=/&%.#]*)?$
         */
        String regStr = "^((http|https);//)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=/&%.#]*)?$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

    }
}
