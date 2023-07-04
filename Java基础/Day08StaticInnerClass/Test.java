package Day08StaticInnerClass;

public class Test {
	public static void main(String[] args) {
		/*
		 注意事项：
		 1.静态内部类也是成员内部类中的一种；
		 2.静态内部类只能访问外部类中的静态对象以及静态方法；
		 	如果想要访问非静态的则需要先创建对象。
		 	
		 创建静态内部类对象的格式：
		 	外部类名.内部类名 对象名 = new 外部类名.内部类名（）；
		 调用静态内部类中的静态方法的格式：
		 	外部类名.内部类名.方法名（）；
		 */
		
		OuterClass.StaticInnerClass.show2();
		
		OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();
		sic.show1();
		sic.show2();//也可以调用静态内部类中的静态方法，但最好还是写OuterClass.StaticInnerClass.show2();这个格式
	}
}
