package Day08MemberInnerClass;

public class Test {
	public static void main(String[] args) {
		/*
		 编写成员内部类的注意点：
		 	1.成员内部类可以被一些修饰符所修饰，比如：private，默认，protected，public，static等
		 	2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。
		 	
		 获取成员内部类对象的两种方式：
		 	方式一：外部类编写方法，对外提供内部类对象（只有当用private去修饰内部类的时候才会用）
		 	方式二：直接创建（一般是用第二种方式去获取内部类的对象）
		 	
		 	格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象；
		 	范例：OuterClass.InnerClass oi = new OuterClass().new InnerClass();
		 */
		
		OuterClass.InnerClass oi1 = new OuterClass().new InnerClass();
		System.out.println(oi1.age);
		
		OuterClass oi2 = new OuterClass();
		Object innerClass = oi2.getInstance();//利用多态，InnerClass1的父类创建去接收它对象的变量innerClass
		
		OuterClass.InnerClass2 oi3 = new OuterClass().new InnerClass2();
		oi3.show();
	}
}
