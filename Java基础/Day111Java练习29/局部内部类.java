package Day111Java练习29;

public class 局部内部类 {
	/*
	 * 记住：
	 * （1）局部内部类定义在方法块中/代码块
	 * （2）作用域在方法体或者代码块中
	 * （3）本质仍然是一个类
	 */
	public static void main(String[] args){
		局部内部类 jbnbl = new 局部内部类();
		jbnbl.m1();
	}
	
	{
		class Inner2{//代码块中也可以定义局部内部类
			
		}
	}
	private int n1 = 100;
	
	private void m2() {
		System.out.println("这是私有方法");
	}
	
	public void m1() {
		//局部内部类是定义在外部类的局部位置，通常是在方法
		//不能添加访问修饰符，因为局部变量本身就不能添加访问修饰符，但是可以使用final修饰
		//作用域：仅仅在定义它的方法或代码块中
		final class Inner1{//局部内部类本质仍然是一个类，可以加final修饰，不让其他内部类继承
			private int n1 = 800;
			//可以之间访问外部类的所有成员，包含私有的
			public void f1() {
				System.out.println("Inner1这个类中的n1的值为：" + n1);//800
				//如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，使用【外部类名.this.成员】去访问
				System.out.println("局部内部类这个类中的n1的值为：" + 局部内部类.this.n1);//100
				m2();
			}
		}
		//外部类在方法中，可以创建Inner1对象，然后调用
		Inner1 i1 = new Inner1();
		i1.f1();
	}
}
