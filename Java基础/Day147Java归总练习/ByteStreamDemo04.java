package Day147Java归总练习;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo04 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos =
                new FileOutputStream("/Users/dreamtank131/Desktop/a.txt"
                        ,true);//续写开关
        //写出数据
        String str = "kankelaoyezuishuai";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);

        //写出换行符
        String wrap = "\r";//同样需要转换为数组再输出！！
        byte[] bytes2 = wrap.getBytes();//转换
        fos.write(bytes2);//写出换行符

        //写出第二行数据
        String str2 = "66666666";
        byte[] bytes3 = str2.getBytes();//转换成数组
        fos.write(bytes3);

        //释放资源
        fos.close();
    }
}
