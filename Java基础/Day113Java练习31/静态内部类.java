package Day113Java练习31;

public class 静态内部类 {
	public static void main(String[] args) {
		/*
		 * 外部其他类，使用静态内部类的两种方式
		 *     方式一
		 *     方式二
		 */
		/*
		 * 方式一：静态内部类，是可以通过类名直接访问的
		 */
		Outer02.Inner09 i09 = new Outer02.Inner09();
		i09.say();
		/*
		 * 方式二：编写一个方法，可以返回静态内部类的对象实例
		 */
		Outer02 o = new Outer02();
		Outer02.Inner09 ii09 = o.getInner09Instance();
		ii09.say();
		/*
		 * 
		 */
	}
}

class Outer02{
	private int n1 = 10;
	private static String name = "张三";
	private static void cry() {
		System.out.println("静态方法cry被调用");
	}
	
	public static class Inner09{
		public void say() {
			System.out.println("name = " + name);//非静态成员的n1不能调用
			cry();
		}
	}
	
	public Inner09 getInner09Instance() {
		return new Inner09();
	}
}
