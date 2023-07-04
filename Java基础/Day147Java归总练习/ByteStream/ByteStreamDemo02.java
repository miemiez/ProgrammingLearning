package Day0615.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*
    演示字节输入流循环读取
     */
        //创建对象
        FileInputStream fis =
                new FileInputStream("/Users/dreamtank131/Desktop/a.txt");

        //2.循环读取
        int b;//一定要创建一个变量来保存遍历数值
        while ((b = fis.read()) != -1) {//b接收read遍历数据，直到=-1，即到文件末尾，退出循环。
            System.out.print((char) b);//去掉ln，读取数据不换行方便观看
        }

        //释放资源
        fis.close();
    }
}
