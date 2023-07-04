package Day0615.myobjectsstream;

import java.io.*;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        演示反序列化流，把文件中的对象读取到程序中

        构造方法：把基本流变成高级流
        public ObjectInputStream(InputStream out)

        成员方法：把序列化到本地的文件对象，读取到程序中
        public Object readObject( )

         */

        //1.创建反序列化流对象
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("/Users/dreamtank131/Desktop/a.txt"));

        //2.读取数据
        Student o = (Student) ois.readObject();

        //3.打印对象
        System.out.println(o);

        //4.释放资源
        ois.close();
    }
}
