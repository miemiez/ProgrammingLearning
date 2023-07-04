package Day147Java归总练习;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo06 {
    public static void main(String[] args) {
        //利用try...catch...finally捕获拷贝文件中的异常


        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/Users/dreamtank131/Downloads/uta.mp4");

            fos = new FileOutputStream("/Users/dreamtank131/Desktop/copy.uta.mp4");

            //2.拷贝文件
            int len;
            //创建遍历数组
            byte[] bytes = new byte[1024 * 1024 * 5];//一次读取 5mb 的字节
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {//非空判断
                try {
                    fos.close();
                } catch (IOException e) {

                }
            }
            if (fis != null) {//非空判断
                try {
                    fis.close();
                } catch (IOException e) {
                }
            }
        }

    }
}
