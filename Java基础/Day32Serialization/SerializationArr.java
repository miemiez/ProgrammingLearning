package Day32Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationArr {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * 可以一次性序列化多个对象（序列化集合）：
		 * 注意：参与序列化的ArrayList集合以及集合中的元素都需要实现java.io.Serialiable接口；
		 */
		ArrayList<User类同时用来说明transient关键字> arr = new ArrayList<>();
		arr.add(new User类同时用来说明transient关键字(01,"LHY"));
		arr.add(new User类同时用来说明transient关键字(02,"QYH"));
		arr.add(new User类同时用来说明transient关键字(03,"ZJH"));
		arr.add(new User类同时用来说明transient关键字(04,"TYS"));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JAVAIO\\File01\\SerialiableArr.txt"));
		oos.writeObject(arr);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JAVAIO\\File01\\SerialiableArr.txt"));
		Object o = ois.readObject();
		ois.close();
		
		@SuppressWarnings("unchecked")
		//把读取到的Object强转为集合；
		ArrayList<User类同时用来说明transient关键字> users = (ArrayList<User类同时用来说明transient关键字>)o;
		for(User类同时用来说明transient关键字 u:users) {
			System.out.println(u);
		}
	}
}
