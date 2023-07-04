package Day0615.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
    演示拷贝文件
    把/Users/dreamtank131/Downloads/uta.mp4 拷贝到桌面
      /Users/dreamtank131/Desktop/copy.uta.mp4
     */

        //1.创建，注意同时有读取和写出动作
        FileInputStream fis =
                new FileInputStream("/Users/dreamtank131/Downloads/uta.mp4");
        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/copy.uta.mp4");

        //2.拷贝
        int b ;//接收遍历
        while ((b = fis.read()) != -1) {//读一次
            fos.write(b);//记录一次，直到 b =-1，出循环。
        }

        //3.释放资源，先进后出，先关后，再关前
        fos.close();
        fis.close();


    }
}
