package Day147Java归总练习;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        演示：字节输出流 FileOutputStream
        实现需求：写出一段文字到本地文件中

        步骤：
        1.创建对象
        2.写出数据
        3.释放资源
         */

        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/a.txt");
        fos.write(97);
        fos.close();
    }
}
