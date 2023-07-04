package Day39Reflect5;

import java.lang.reflect.Field;

import Day38Reflect4.Student;

public class Test通过反射机制访问对象属性 {
	public static void main(String[] args) throws Exception{
		Class<Student> c = (Class<Student>)Class.forName("Day38Reflect4.Student");
		Student s = c.newInstance();//s就是Student对象。（底曾调用无参构造方法）
		
		//获取no属性（根据属性的名称来获取Field）
		Field fieldNo = c.getDeclaredField("no");
		/*
		 * 反射机制让代码复杂了，但同时可以利用属性配置文件让代码变得更加灵活，这是值得的
		 */
		fieldNo.set(s, 100);//给s对象的no属性复制100
		System.out.println(fieldNo.get(s));//读取s对象的no属性值
		
		//反射机制的缺点：打破封装，可能会给不法分子留下机会！！！！
		//这样设置完之后，在外部也可以访问private的
		Field fieldName = c.getDeclaredField("name");
		fieldName.setAccessible(true);//利用fieldName.setAccessible(true);可以打破封装，对private修饰的属性也可以进行操作
		fieldName.set(s, "八重");
		System.out.println(fieldName.get(s));
		System.out.println(fieldNo.getType().getSimpleName());
	}
}
