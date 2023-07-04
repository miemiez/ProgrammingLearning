package Day32Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JAVAIO\\File01\\Serializable.txt"));
		//开始反序列化，读取
		Object o = ois.readObject();
		//反序列化回来的是一个学生对象，所以会调用学生对象的toString方法
		System.out.println(o);
		ois.close();
	}
}
