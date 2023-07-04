package Day147Java归总练习;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo08 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        JDK9：IO流捕获异常写法。了解即可
        对象放外面
        抛出对象异常
        自动释放

        格式：
        创建对象流1;
        创建对象流2;
        try(名称1;名称2){
            xx;
           } catch(IOException e) {
            e.printStackTrace();
           }

         */


        FileInputStream fis =
                new FileInputStream("/Users/dreamtank131/Downloads/uta.mp4");

        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/copy.uta.mp4");

        try (fis;fos) {

            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];//一次读取 5mb 的字节
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);//0表示索引，len表示最多取到的长度。
            }
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
