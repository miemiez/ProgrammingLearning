package Day39Reflect5;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test反射Method {
	public static void main(String[] args) throws Exception{
		StringBuilder sb = new StringBuilder();
		Class<UserService> us = (Class<UserService>)Class.forName("Day39Reflect5.UserService");
		Method[] methods = us.getDeclaredMethods();//获取一个Class字节码文件重有多少Method方法
		System.out.println(methods.length);//2
		for(Method m:methods) {
			sb.append(Modifier.toString(m.getModifiers()) + " ");
			sb.append(m.getReturnType().getSimpleName() + " ");
			sb.append(m.getName() + " (");
			@SuppressWarnings("unchecked")
			Class[] pts = m.getParameterTypes();
			if(pts.length > 0) {
				for(Class pt:pts) {
					sb.append(pt.getSimpleName() + ",");
				}
				sb.deleteCharAt(sb.length()-1);
			}
			sb.append("){\n}\n");
		}
		System.out.println(sb);
	}
}
