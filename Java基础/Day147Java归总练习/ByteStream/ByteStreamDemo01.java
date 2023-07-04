package Day0615.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        演示：字节输入流 FileInputStream

        实现步骤
        1.创建对象
        2.读取数据
        3.释放资源
         */

        //设定文本内容为“abcde”，来读取数据。
        FileInputStream fis = new FileInputStream("/Users/dreamtank131/Desktop/a.txt");
        //读取数据
        //细节：
        //（1）一次赌一个字节，读出来的是ASCII上对应的数字
        //    可以通过转换得到对应的字符（char）
        //（2）读到文件末尾，如果没有数据，read（ ）方法会返回一个-1。
        //（3）末尾没有数据，但是有空格也会返回ASCII对应空格的数字。
        int b1 = fis.read();
        int b2 = fis.read();
        int b3 = fis.read();
        int b4 = fis.read();
        int b5 = fis.read();
        int b6 = fis.read();
        System.out.println(b1);//97,只会读取一个数据
        System.out.println(b2);//98,只会读取一个数据接着上一个
        System.out.println(b3);//99,只会读取一个数据接着上一个
        System.out.println(b4);//100,只会读取一个数据接着上一个
        System.out.println(b5);//101,只会读取一个数据接着上一个
        System.out.println(b6);//没有的情况，返回-1.

        //想读取字符需转换,即保留原来的char对应的数字
        System.out.println((char) b1);
        System.out.println((char) b2);
        System.out.println((char) b3);
        System.out.println((char) b4);
        System.out.println((char) b5);

        //释放资源
        fis.close();


    }
}
