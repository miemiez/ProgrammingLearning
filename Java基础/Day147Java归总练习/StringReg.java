package Day0608;

import Day0509.转义字符课堂练习;

//字符串支持的 正则表达式
public class StringReg {
    public static void main(String[] args) {
        String content = "2000年5月，JDK1.3，JDK1.4和J2SE1.3相继发布。2001年9月24日，J2EE1.3" +
                "发布。2022年2月26日，J2SE1.4发布。自此Java的计算能力大幅提升。";

        //1.替换功能：content.matches
        // 使用正则表达式，将 JDK1.3 和 JDK1.4 替换成 JDK。
        String s = content.replaceAll("JDK1\\.3|JDK1\\.4", "JDK");
        System.out.println(s);

        //2.要求 验证一个 手机号，要求必须是138，139 开头的
        content = "13988889999";
        if (content.matches("1(38|39)\\d{8}")) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }

        //3.分割功能 content.split
        //要求：按照#或者-或者~或者数字 来分割
        content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s1 : split) {//快捷键 iter
            System.out.println(s1);
        }
        }
    }

