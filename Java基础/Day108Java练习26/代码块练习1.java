package Day108Java练习26;

public class 代码块练习1 {
	public static void main(String[] args) {
		System.out.println("total = " + Person.total);//（1）"in static block!"（2）total = 100
		System.out.println("total = " + Person.total);//total = 100
	}
}

class Person{
	public static int total;
	
	static {
		//System.out.println(total);
		total = 100;
		System.out.println("in static block!");
	}
	
}
