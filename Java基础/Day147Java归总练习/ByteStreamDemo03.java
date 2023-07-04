package Day0615.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {
         /*
    写出多个字符的方法：
    1.void write(int b)                           一次写出一个字节数据。
    2.void write(byte[] b)                        一次写出一个字节数组数据。
    3.void write(byte[] b, int off, int len)       一次写出一个字节数组的部分数据。
      3-1参数1：数组
      3-2参数2：起始索引
      3-3参数3:起始索引开始写出的个数
     */

        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/a.txt");
        byte[] bytes = {97,98,99,100,101};//a.b.c.d.e
        fos.write(bytes);
        fos.write(bytes,1,2);//从数组索引1开始写2个数，即得到b，c
        fos.close();
    }



}
