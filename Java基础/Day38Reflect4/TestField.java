package Day38Reflect4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestField {
	public static void main(String[] args) {
		/*
		 * 反射Student类当中的所有Field
		 */
		try {
			Class<Student> c = (Class<Student>)Class.forName("Day38Reflect4.Student");
			System.out.println(c);
			System.out.println(c.getName());//完整类名
			System.out.println(c.getSimpleName());//简类名
			
			//getFields()方法是获取类中所有的public修饰的Field
			Field[] fields = c.getFields();
			System.out.println(fields.length);//1
			Field f = fields[0];
			String str = f.getName();//获取属性的名字
			System.out.println(str);//no
			
			//getDeclaredFields()
			Field[] fields2 = c.getDeclaredFields();
			System.out.println(fields2.length);
			for(Field fs:fields2) {
				/*
				 * 获取属性的修饰符
				 */
				
				int i = fs.getModifiers();
				System.out.println("属性的修饰符代号（的和）为：" + i);//返回的是int类型的值，每个数字是修饰符的代号（的和）！！！
				String modifiersStr = Modifier.toString(i);//将i作为参数传给Modifier的toString()方法，可以得到修饰符
				System.out.println("属性的修饰符为：" + modifiersStr);
				
				/*
				 * 获取属性的类型
				 * Class fieldType = fs.getType();
				 */
				Class fieldType = fs.getType();//获取属性类型
				String ftName = fieldType.getName();//获取属性类型的名称
				String ftSName = fieldType.getSimpleName();//获取属性类型的简化名称
				System.out.println("属性的类型为：" + ftName);
				System.out.println("属性的类型的简化名为：" + ftSName);
				
				/*
				 * 获取属性的名字
				 * String fieldName = fs.getName();
				 */
				System.out.println("属性的姓名为：" + fs.getName());
				
				
				System.out.println("\n");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
