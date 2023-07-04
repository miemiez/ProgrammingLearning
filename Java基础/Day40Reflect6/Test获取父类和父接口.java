package Day40Reflect6;

public class Test获取父类和父接口 {
	public static void main(String[] args) throws Exception{
		Class stringClass = Class.forName("java.lang.String");
		//获取String的父类
		Class superClass = stringClass.getSuperclass();
		System.out.println(superClass.getName());
		
		//获取String类实现的所有接口
		Class[] interfaces = stringClass.getInterfaces();
		for(Class i:interfaces) {
			System.out.println(i.getName());
		}
	}
}
