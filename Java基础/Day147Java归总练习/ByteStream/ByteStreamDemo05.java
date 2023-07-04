package Day0615.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo05 {
    public static void main(String[] args) throws IOException {
        /*
        练习：
        利用读取数组 快速拷贝大文件 （31.3mb）
      把/Users/dreamtank131/Downloads/uta.mp4 拷贝到桌面
      /Users/dreamtank131/Desktop/copy.uta.mp4
         */

        //想知道用多长时间：可以用System.currentTimeMillis实现

        long start = System.currentTimeMillis();
        //1.创建对象
        FileInputStream fis =
                new FileInputStream("/Users/dreamtank131/Downloads/uta.mp4");

        FileOutputStream fos = new
                FileOutputStream("/Users/dreamtank131/Desktop/copy.uta.mp4");

        //2.拷贝文件
        int len;
        //创建遍历数组
        byte[] bytes = new byte[1024 * 1024 * 5];//一次读取 5mb 的字节
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);//0表示索引，len表示最多取到的长度。
        }

        //3.释放
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);//输出的是毫秒，想看秒除以1000即可。


    }
}
