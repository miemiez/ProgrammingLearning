package Day101Java练习19;

public class Grand {
	String name = "AA";
	static String job = "player";
	private int age = 100;
	
	public void g1() {
		
	}
	
	public static void g2() {
		
	}
}

class Father extends Grand{
	String id = "001";
	private double score;
	
	public void f1() {
		//super可以访问的成员：
		String str1 = super.name;
		super.g1();
		super.g2();
		//this可以访问的成员
		String str2 = this.id;
		double d = this.score;
		this.f1();
	}
}

class Son extends Father{
	String name = "BB";
	public void g1() {
		
	}
	
	private void show() {
		//super可以访问哪些成员
		String str1 = super.name;
		String str2 = super.id;
		super.f1();
		super.g1();
		//this可以访问的成员
		String str3 = this.name;
		String str4 = this.id;
		String str5 = this.job;
		this.g1();
		this.g2();
		this.g1();
		this.f1();
	}
}
