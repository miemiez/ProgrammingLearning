package Day0615.myobjectsstream;

import Day0516.Food;

import java.io.*;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
        利用序列化流/对象操作输出流，把一个对象写到本地文件中

        构造方法：
        public ObjectOutputStream(OutputStream out) 把基本流变成高级流

        成员方法：
        public final void writeObject(Object obj)  把对象序列化（写出）到文件中去

         */

        //1.创建对象
        Student stu = new Student("zhangsan", 23);

        //2.创建序列化流的对象
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("/Users/dreamtank131/Desktop/a.txt"));

        //3.写出数据
        oos.writeObject(stu);

        //4.关流
        oos.close();

    }
}
