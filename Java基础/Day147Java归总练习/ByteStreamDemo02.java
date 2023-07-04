package Day0615.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*
        字节输出流细节；
        1.创建对象
        （1）参数是字符串表示的路径或是File对象均可。
        （2）如果文件不存在就会创建一个新的文件。
        （3）如果已存在，则会覆盖原文件内容。

        2.写数据
         （1）write方法的参数是整数，但实际上是ASCII表上对应的字符，如想输出'a',则传入97.
         （2）同理如想输出“97”，则输入对应字符57，55即可得到“97”。

         3.释放资源
          每次使用完流之后必须close（ ）;，避免占用。
         */

        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/a.txt");
        fos.write(57);
        fos.write(55);//此时上一次输出的'a'已被替换为“97”。
        fos.close();
    }
}
