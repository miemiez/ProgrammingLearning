package Day41Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectAnnotation {
	public static void main(String[] args) throws Exception{
		/*
		 * 首先！！！在“MyAnnotation属性value”的源代码，上是否有"@Retention(RetentionPolicy.RUNTIME)"这个注解，如果没有则无法被反射到
		 * c.isMyAnnotationPresent(注解名.class)方法，判断类上是否有该注解
		 * 注解类名 对象 = （注解类名）c.getAnnotation(MyAnnotation.class);
		 */
		
		Class c= Class.forName("Day41Annotation.TestMyAnnotation属性value");
		//判断“TestMyAnnotation属性value”类上是否有"@MyAnnotation属性value"这个注解
		System.out.println(c.isAnnotationPresent(MyAnnotation属性value.class));//true
		MyAnnotation属性value mav = (MyAnnotation属性value)c.getAnnotation(MyAnnotation属性value.class);
		System.out.println("类上面的注解对象为" + mav);
		String value = mav.value();//获取value属性的属性值
		System.out.println(value);
		
		//判断“TestMyAnnotation属性value”类中的“method”方法上，是否有"@MyAnnotation属性value"这个注解
		Method method = c.getDeclaredMethod("method");
		System.out.println(method.isAnnotationPresent(MyAnnotation属性value.class));//true
		
		//判断“TestMyAnnotation属性value”类中的“name”属性上，是否有"@MyAnnotation属性value"这个注解
		Field fieldName = c.getDeclaredField("name");
		System.out.println(fieldName.isAnnotationPresent(MyAnnotation属性value.class));//false
	}
}
