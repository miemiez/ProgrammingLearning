package Day108Java练习26;

public class 代码块 {
	public static void main(String[] args) {
		代码块 dmk1 = new 代码块();//大家好!
		代码块 dmk2 = new 代码块("XYY",12);//大家好!
	}
	
	private String name;
	private int age;
	
	{
		System.out.println("大家好!");
	}
	
	public 代码块() {
		
	}
	
	public 代码块(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
