package Day37Reflect3;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test获取绝对路径创建IO流 {
	public static void main(String[] args) {
		/*
		 * getResource()中的参数填写的就是，相对路径，这种写法可以获取到不同操作系统中的绝对路径。
		 */
		
		//方法一（获取绝对路径后，利用绝对路径创建IO输入流）：
		String path = Thread.currentThread().getContextClassLoader().getResource("Day37Reflect3/classinfo2.properties").getPath();
		FileReader file = null;
		Properties p1 = null;
		try {
			file = new FileReader(path);
			p1 = new Properties();
			p1.load(file);
			file.close();
			String s= p1.getProperty("className");
			try {
				Class<User> cl= (Class<User>) Class.forName(s);
				try {
					User u1 = cl.newInstance();
					System.out.println(u1);
				} catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//方法二（通过getResourceAsStream()直接创建IO输入流）：
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo3.properties");
		Properties p2 = new Properties();
		try {
			p2.load(is);
			is.close();
			String s = p2.getProperty("className");
			try {
				Class<User2> cl2 = (Class<User2>)Class.forName(s);
				try {
					User2 u2 = cl2.newInstance();
					System.out.println(u2);
				} catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
