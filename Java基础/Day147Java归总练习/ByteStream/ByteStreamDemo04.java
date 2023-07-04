package Day147Java归总练习;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo04 {
    public static void main(String[] args) throws IOException {
        /*
    由于一次读取一个字符效率太低，
    演示一次读取一个数组的数据
         */

        //1.创建对象
        FileInputStream fis =
                new FileInputStream("/Users/dreamtank131/Desktop/a.txt");

        //2.读取数据
        //要读取数组就要先创建数组
        byte[] bytes = new byte[2];//长度为2的数组，一次可以读取2个字符
        //一次读取多少个字节数据，跟数组的长度有关。每次读取会尽可能的装满数组。
        //读取数组会有返回值：本次读取到了多少个字节数据。
        //可以定义一个变量 len 接收每次读取字节个数。
        int len1 = fis.read(bytes);
        System.out.println(len1);

        //创建一个str 字符串转换接收遍历的数组。
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);

        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);
        String str3 = new String(bytes,0,len3);
        System.out.println(str3);

        //指定索引和长度，就不会出现遗留上一次读取数字的问题。
        //具体方法（数组,0,len）0表示第一个索引，len表示剩余的长度。


        //3.释放资源
        fis.close();


    }
}
