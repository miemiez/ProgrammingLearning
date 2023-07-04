package Day32Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization序列化和反序列化的说明 {
	public static void main(String[] args) throws IOException {
		/*
		 * 一：什么是序列化，反序列化：
		 *     序列化：Serialize        将java对象存储到硬盘文件中，将java对象的状态保存下来的过程。（使用到的是ObjectOutputStream类）
		 *     反序列化：DeSerialize    将硬盘上的数据重新恢复到内存当中，恢复成java对象。（使用到的是ObjectInputStream类）
		 * 
		 * 二：进行序列化，反序列化必要的事项：
		 *     参与序列化与反序列化的对象，必须实现Serializable这个接口（Serializable只是一个标志接口）
		 * 
		 * 三：Serializable接口：
		 *     public interface Serializable{
		 *     }
		 *     这个接口当中什么代码也没有，它起到标识的作用，标志的作用，java虚拟机看到这个类实现这个接口，就会对这个类进行特出处理。
		 *     特出处理：Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成一个序列化版本号。
		 * 
		 * 四：序列化版本号作用：
		 * 	   序列化版本号可以区分类
		 * 	   如果后续需要升级源代码，建议将实现Serializable接口的类都自己手写一个固定不变的序列化版本号（最好是全球唯一的）；
		 *     结合Student类以及DeSerialization理解
		 *     
		 *     java语言采用什么机制来区分类的：
		 *         1.首先通过类命进行比对，如果类命不一样，则肯定不是同一个类；
		 *         2.如果类名一样，再通过序列化版本号进行区分。
		 *     
		 *     自动生成序列化版本号的好处（可以区分类）：
		 *     假如：程序员A编写了一个类：com.bjpowernode.java.bean.Student implements Serializable
		 *     		 程序员B编写了一个类：com.bjpowernode.java.bean.Student implements Serializable
		 *           这两个类名字一模一样，但是确实不是同一个类，这个时候序列化版本号就起到作用了
		 *           对于java虚拟机来说，java虚拟机是可以区分开这两个类的，因为这两个类都实现了Serializable接口，
		 *           都有默认的序列化版本号，他们的序列化版本号不一样，所以可以区分开。
		 *     
		 *     自动生成序列化版本号的坏处（一旦自动生成序列化版本号就不能修改实现类的源代码）：
		 *     		自动生成的序列号要求不能改写实现Serializable接口的类，因为一旦改写，必然会重新编译，此时就会生成全新的序列化版本号，
		 *          这时java虚拟机就会把这个类当作一个全新的类，那么之前序列化的数据都无法反序列化
		 *          
		 *     ！！！最终结论：！！！
		 *         凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号，
		 *         这样即使以后这个类的源代码修改了，但是版本号不变，java虚拟机就会把它认作是同一个类
		 */
		
		Student s = new Student("LHY",22);
		FileOutputStream f = new FileOutputStream("E:\\JAVAIO\\File01\\Serializable.txt");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(f);
			oos.writeObject(s);
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				oos.flush();
				oos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
