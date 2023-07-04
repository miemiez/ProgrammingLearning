package Day40Reflect6;

import java.lang.reflect.Constructor;

public class 反射机制调用构造方法 {
	public static void main(String[] args) throws Exception{
		Class<Vip> vipClass = (Class<Vip>)Class.forName("Day40Reflect6.Vip");
		//调用无参数构造方法
		Vip v = vipClass.newInstance();
		
		Constructor c1 = vipClass.getDeclaredConstructor();
		Object v1 = c1.newInstance();
		/*
		 * 调用有参数构造方法：
		 */
		Constructor c2 = vipClass.getDeclaredConstructor(int.class,String.class);
		Object v2 = c2.newInstance(007,"LHY");
		System.out.println(v);//反射调用的无参构造方法（方法一）得到的对象
		System.out.println(v1);//反射调用的无参构造方法（方法二）得到的对象
		System.out.println(v2);//反射调用的有参构造方法得到的对象
	}
}
