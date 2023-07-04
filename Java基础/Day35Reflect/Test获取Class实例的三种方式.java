package Day35Reflect;

import java.util.Date;

public class Test获取Class实例的三种方式 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * 三种方式：
		 *     （1）Class c = Class.forName("完整类名，带包名");
		 *     （2）Class c = 引用.getClass();
		 *     （3）Class c = 类型.class();第三种方式，java语言中任何一种类型，包括基本数据类型，它都有.class属性
		 * 
		 * Class.forName();
		 *     1.静态方法；
		 *     2.方法的参数是一个字符串；
		 *     3.字符串需要的是一个完整类名；
		 *     4.完整类名必须带有包名，java.lang包也不能省略。
		 */
		
		//第一种创建方式：
		Class c1 = Class.forName("java.lang.String");//c1代表String.class文件，或者说c1代表String类型
		Class c2 = Class.forName("java.util.Date");//c2代表Date类型
		Class c3 = Class.forName("java.lang.Integer");//c3代表Integer类型
		Class c4 = Class.forName("java.lang.System");//c4代表System类型
		
		//第二种创建方式：
		String s = "abc";
		Class x = s.getClass();//x代表String.class字节码文件，x代表String类型
		System.out.println(c1 == x);//true("=="判断的是对象的内存地址)
		
		Date time = new Date();
		Class y = time.getClass();
		System.out.println(c2 == y);//true
		
		//第三种创建方式：
		Class z = String.class;//z代表String类型
		Class i = int.class;//i代表int类型
		Class d = double.class;//d代表double类型
	}
}
