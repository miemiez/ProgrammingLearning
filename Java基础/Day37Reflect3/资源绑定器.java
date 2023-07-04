package Day37Reflect3;

import java.util.ResourceBundle;

public class 资源绑定器 {
	/*
	 * java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
	 * 使用这种方式的时候，属性配置文件xxx.properties必须放到类路径下
	 */
	public static void main(String[] args) {
		/*
		 * 利用资源绑定器无需写IO以及Properties
		 * 资源绑定器，只能绑定xxx.properties文件，并且这个文件必须是在类路径下的，文件扩展名也必须是properties
		 * 并且在写路径的时候，路径后面的扩展名不能写
		 */
		ResourceBundle rb = ResourceBundle.getBundle("Day37Reflect3/classinfo2");
		String s = rb.getString("className");
		try {
			Class<User> cl = (Class<User>)Class.forName(s);
			try {
				User u = cl.newInstance();
				System.out.println(u);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
