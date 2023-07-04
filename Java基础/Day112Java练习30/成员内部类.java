package Day112Java练习30;

public class 成员内部类 {
	public static void main(String[] args) {
		/*
		 * 外部其他类，使用成员内部类的三种方式
		 *     方式一
		 *     方式二
		 *     方式三
		 */
		/*
		 * 方式一：外部类名.内部类名 i = 外部类对象引用.new 内部类对象;
		 */
		Outer01 outer01 = new Outer01();
		Outer01.Inner08 i08 = outer01.new Inner08();
		i08.say();
		/*
		 * 方式二：在外部类中编写一个方法，可以返回Inner08对象
		 */
		Outer01.Inner08 ii08 = outer01.getInner08Instance();
		i08.say();
		/*
		 * 方式三
		 */
		Outer01.Inner08 iii08 = new Outer01().new Inner08();
		i08.say();
	}
}

class Outer01{
	private static int n1 = 10;
	private int n2 = 11;
	public String name = "张三";
	
	/*
	 * 可以添加任意访问修饰符（public，protected，默认，private），因为它的地位就是一个成员
	 */
	public class Inner08{
		private int n1 = 12;
		private static int n2 = 13;
		public void say() {
			System.out.println("Outer01中的n1 = " + Outer01.n1 + ";Inner08中的n1 = " + n1 + ";Outer01中的n2 = " + Outer01.this.n2 + 
					";Inner08中的n2 = " + n2 + ";name = " + name);//可以直接访问外部类的所有成员，包含私有
		}
	}
	
	/*
	 * 方式二：在外部类中编写一个方法，可以返回Inner08对象
	 */
	
	public Inner08 getInner08Instance() {
		return new Inner08();
	}
}
