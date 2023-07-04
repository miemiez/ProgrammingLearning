package Day01This;

public class This{
	String name;
	int age;
	static String teacherName;
	
	public void show(This this)//This this 为非静态方法的隐藏参数，无法传参，当该方法被调用时，由虚拟机把调用者地址值赋值给它；
	{
		System.out.println("this:" + this);//this 打印的值为当前方法（show()）调用者的地址值；
		System.out.println(this.name + "," + this.age + "," + teacherName);
		
		this.show2();
		This.show3();//this.show3();/show3();也可以
	}
	
	public void show2(This this) {
		System.out.println("this:" + this);
		System.out.println("show2被调用");
	}
	
	public static void show3() //静态方法是没有this关键字的；
	{
		System.out.println("static method");
	}
}