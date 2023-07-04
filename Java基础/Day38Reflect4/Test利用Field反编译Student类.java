package Day38Reflect4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test利用Field反编译Student类 {
	public static void main(String[] args) throws Exception{
		/*
		 * 通过反射机制，反编译一个类的属性Field
		 */
		StringBuilder sb = new StringBuilder();
		Class c = Class.forName("Day38Reflect4.Student");
		sb.append("public class Student {\n");
		Field[] fields = c.getDeclaredFields();
		for(Field fs:fields) {
			int i = fs.getModifiers();
			if(i == 0) {
				sb.append("\t" + fs.getType().getSimpleName() + " " + fs.getName() + ";\n");
			}else {
				String sm = Modifier.toString(i);
				sb.append("\t" + sm + " " + fs.getType().getSimpleName() + " " + fs.getName() + ";\n");
			}
		}
		sb.append("}");
		System.out.println(sb);
	}
}
