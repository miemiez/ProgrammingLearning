package Day0615.mycharstream1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        演示字符输入流，读取数据 (无参）
        第一步：创建对象
        public FileReader(File)              创建字符输入流，关联本地文件
        public FileReader(String pathname)   创建字符输入流，关联本地文件

        第二步：读取数据
        public int read( )                   读取数据，到末尾返回-1
        public int read(char[] buffer )      读取多个数据，到末尾返回-1

        第三步：释放资源
        public void close( )                 关流
         */

        //1.创建对象并关联本地文件
        FileReader fr = new FileReader("/Users/dreamtank131/Desktop/a.txt");

        //2.读取数据 read（ ）
        /*
        细节：默认一个字节一个字节的读取，如果遇见中文，GBK一次读2个字节，UTF-8一次读3个字节。
        IDEA默认 UTF-8一次读3个字节，读取之后会在底层解码并转成十进制返回，
        ！！因此想要输出汉字，需要把返回的十进制数字强转为汉字：即(char)
         */

        int ch;//接收遍历集合
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);//去掉ln不换行，read方法自带换行符
        }

        //3.释放资源
        fr.close();
    }
}
