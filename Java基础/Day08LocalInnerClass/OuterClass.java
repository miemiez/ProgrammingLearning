package Day08LocalInnerClass;

public class OuterClass{
	int a = 1;
	public void show() {
		int b = 2;
		//局部内部类，和局部变量类似，能修饰局部变量的都能修饰局部内部类，不能修饰局部变量的，也不能修饰局部内部类
		class LocalInnerClass{
			
			int c = 3;
			
			public void method1() {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
				System.out.println("局部内部类中的method1方法");
			}
			
			public static void method2() {
				System.out.println("局部内部类中的静态method2方法");
			}
		}
		
		//创建局部内部类的对象；
		LocalInnerClass lic = new LocalInnerClass();
		System.out.println(lic.c);
		lic.method1();
		LocalInnerClass.method2();
	}
}
