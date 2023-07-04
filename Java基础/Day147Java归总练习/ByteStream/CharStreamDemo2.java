package Day0615.mycharstream1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        演示字符输入流，读取数据 (有参）【数组】
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

        //2.读取数据
        //读取数组就要创建数组,注意：字符流数组是char[],  字节流数字是byte[].
        char[] chars = new  char[2];//长度为2的数组
        int len;//接收长度
        while ((len = fr.read(chars)) != -1) {//read( )记得传参！！chars
            //read(chars):读取数据，解码，强转三合一，将强转之后的字符放入数组中
            //传参的read(chars) = 空参的read( ) + 强转
            System.out.print(new String(chars,0,len));//记得输出转换成字符串！去掉ln。
        }

        //3.释放资源
        fr.close();
    }
}
