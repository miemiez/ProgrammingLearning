package Day0615.mycharstream1;

import Day0601.file_.FileWriter_;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        第一步：创建对象
        public FileWrite(File file)                         创建字符输出流，关联本地文件
        public FileWrite(String pathname)                   创建字符输出流，关联本地文件
        public FileWrite(File file, boolean append)         创建字符输出流，关联本地文件，续写
        public FileWrite(String pathname, boolean append)   创建字符输出流，关联本地文件，续写

        第二步：读取数据
        void write(int c)                            写出一个字符
        void write(String str)                       写出一个字符串
        void write(String str, int off, int len)     写出一个字符串的一部分
        void write(char[] cbuff)                     写出一个字符数组
        void write(char[] cbuff, int off, int len)   写出一个字符数组的一部分

        第三步：释放资源
        public void close( );                       关流
         */

        FileWriter fw =
                new FileWriter("/Users/dreamtank131/Desktop/a.txt",true);//u续写

        char[] chars = {'a','b','c','我'};
        fw.write(chars);

        fw.close();
    }
}
