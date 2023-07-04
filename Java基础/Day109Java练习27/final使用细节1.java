package Day109Java练习27;

public class final使用细节1{
	/*
	 * 1.如果final修饰的属性不是静态的，则初始化的位置可以是：
	 *     （1）定义时赋值
	 *     （2）在构造器中赋值【静态属性不可以】
	 *     （3）在代码块中赋值【静态属性要在静态代码块中赋值】
	 *     
	 * 2.final修饰的类不能被继承【可以继承别的类】但是可以实例化对象
	 * 
	 * 3.如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承（即仍然遵守继承机制）
	 * 
	 * 4.如果一个类已经是final类（无法被其他类所继承），就没有必要再将方法修饰成final方法了【画蛇添足】
	 * 
	 * 5.final不能修饰构造方法
	 */
	public static void main(String[] args) {
		final使用细节1 a = new A();//final修饰的类不能被继承【可以继承别的类】但是可以实例化对象
	}
	
	public final double TAX_RATE1 = 0.08;//1.定义时赋值
	public final double TAX_RATE2;
	public final double TAX_RATE3;
	
	public final使用细节1() {//2.在构造器中赋值
		TAX_RATE2 = 0.1;
	}
	
	{
		TAX_RATE3 = 1.0;//3.在代码块中赋值
	}
}

final class A extends final使用细节1{
	public A() {
		
	}
}
