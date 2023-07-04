package Day40Reflect6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test反射Constructor {
	public static void main(String[] args) throws Exception{
		StringBuilder sb = new StringBuilder();
		Class<Vip> vipClass = (Class<Vip>) Class.forName("Day40Reflect6.Vip");
		sb.append(Modifier.toString(vipClass.getModifiers()));
		sb.append(" ");
		sb.append("class");
		sb.append(" ");
		sb.append(vipClass.getSimpleName());
		sb.append(" {\n");
		
		Field[] fields = vipClass.getDeclaredFields();
		for(Field f:fields) {
			sb.append("\t");
			if(f.getModifiers() != 0) {
				sb.append(Modifier.toString(f.getModifiers()));
				sb.append(" ");
			}
			sb.append(f.getType().getSimpleName());
			sb.append(" ");
			sb.append(f.getName());
			sb.append(";\n");
		}
		sb.append("\n");
		
		Constructor[] constructors = vipClass.getDeclaredConstructors();
		for(Constructor c:constructors) {
			sb.append("\t");
			sb.append(Modifier.toString(c.getModifiers()));
			sb.append(" ");
			sb.append(vipClass.getSimpleName() + "(");
			Class[] parameterTypes = c.getParameterTypes();
			if(parameterTypes.length > 0) {
				for(Class p:parameterTypes) {
					sb.append(p.getSimpleName());
					sb.append(",");
				}
				sb.deleteCharAt(sb.length() - 1);
				sb.append(") {\n");
				sb.append("\t}\n\n");
			}else {
				sb.append("){\n");
				sb.append("\t}");
			}
			
		}
		
		
		System.out.println(sb);
	}
}
