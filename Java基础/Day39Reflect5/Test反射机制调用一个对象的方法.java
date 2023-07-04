package Day39Reflect5;

import java.lang.reflect.Method;

public class Test反射机制调用一个对象的方法 {
	public static void main(String[] args) throws Exception{
		//不使用反射机制调用方法：
		UserService userService = new UserService();
		Boolean b = userService.login("LHY", "123456");
		System.out.println(b?"登录成功":"登录失败");
		
		/*
		 * 使用反射机制调用方法：
		 * 要素分析：
		 *     1.对象"us"
		 *     2."login"方法名
		 *     3.实参列表"a","1"
		 *     4.返回值"result"
		 */
		@SuppressWarnings("unchecked")
		Class<UserService> c = (Class<UserService>) Class.forName("Day39Reflect5.UserService");
		UserService us = c.newInstance();
		Method mLogin = c.getDeclaredMethod("login",String.class,String.class);
		//反射机制重最最重要的一个方法m.invoke(Object object,Object... args);
		Object result = mLogin.invoke(us, "a","1");
		System.out.println((boolean) result?"登录成功":"登录失败");
	}
}
