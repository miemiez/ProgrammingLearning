package Day38Reflect4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import Day37Reflect3.User2;

public class TestReflect {
	public static void main(String[] args) {
		Properties p = new Properties();
		String s = Thread.currentThread().getContextClassLoader().getResource("classinfo3.properties").getPath();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo3.properties");
		ResourceBundle rb = ResourceBundle.getBundle("classinfo3");
		
		String str2 = rb.getString("className");
		
		try {
			Class<User2> cl = (Class<User2>)Class.forName(str2);
			User2 u2 = null;
			try {
				u2 = cl.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			System.out.println(u2);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(s);
		try {
			p.load(is);
			is.close();
			String str = p.getProperty("className");
			try {
				Class<User2> c = (Class<User2>)Class.forName(str);
				try {
					User2 u = c.newInstance();
					System.out.println(u);
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
