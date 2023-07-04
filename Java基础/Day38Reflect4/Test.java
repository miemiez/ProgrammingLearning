package Day38Reflect4;

import java.util.ResourceBundle;
import Day37Reflect3.User;
import Day37Reflect3.User2;

public class Test {
	public static void main(String[] args) {
		String s = Thread.currentThread().getContextClassLoader().getResource("classinfo3.properties").getPath();
		
		ResourceBundle r = ResourceBundle.getBundle("Day37Reflect3/classinfo2");
		String str = r.getString("className");
		try {
			Class<User> cl = (Class<User>)Class.forName(str);
			try {
				User u = cl.newInstance();
				User u2 = cl.newInstance();
				User u3 = cl.newInstance();
				u.setS("a");
				try {
					u2 = u.clone();
					u3 = u;
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
				u2.setS("b");
				System.out.println(u.getS());//a
				System.out.println(u2.getS());//b
				u3.setS("c");
				System.out.println(u.getS());//c
				System.out.println(u3.getS());//c
				System.out.println(u);
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String s1 = new String("1");
		String s2 = new String("1");
		s2 = s1;
		s2 = "2";
		System.out.println(s1);//1
		System.out.println(s2);//2
	}
}
