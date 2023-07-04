package Day0615.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo07 {
    public static void main(String[] args) {
        /*
        JDK7：IO流中捕获异常的写法
        注意：try小括号中的对象代码，只有实现了AutoCloseable接口的类，才能创建。
        try(创建对象1;创建对象2){
            xx;
           } catch(IOException e) {
            e.printStackTrace();
           }
         */

        try (FileInputStream fis = new FileInputStream("/Users/dreamtank131/Downloads/uta.mp4");
             FileOutputStream fos = new FileOutputStream("/Users/dreamtank131/Desktop/copy.uta.mp4")) {

            int len;
            //创建遍历数组
            byte[] bytes = new byte[1024 * 1024 * 5];//一次读取 5mb 的字节
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
