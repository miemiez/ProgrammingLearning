package Day0615.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo04 {
    public static void main(String[] args) throws IOException {
        /*
        续写和换行

        1.换行
        在需要换行的两段字符中间写一个换行符
        windows：\r\n (可以只写其中一个，java会自动补全，但不建议省略）
        mac:    \r

　　　　 2.续写
        打开续写开关。
        开关位置：创建对象的第二个参数，默认false
        手动传入true，此时创建对象不会清空文件，会接着续写。
         */

        //创建对象
        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/a.txt"
                        ,true);//续写开关
        //写出数据
        String str = "kankelaoyezuishuai";//重要！！write不能直接调用字符串，需要将其转换为数组。
        byte[] bytes1 = str.getBytes();//字符串转换数组方法：".getBytes()"
        fos.write(bytes1);//写出数组，即写出字符串。

        //写出换行符
        String wrap = "\r";//同样需要转换为数组再输出！！
        byte[] bytes2 = wrap.getBytes();//转换
        fos.write(bytes2);//写出换行符

        //写出第二行数据
        String str2 = "66666666";
        byte[] bytes3 = str2.getBytes();//转换成数组
        fos.write(bytes3);

        //释放资源
        fos.close();
    }
}
