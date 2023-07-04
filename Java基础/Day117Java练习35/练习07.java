package Day117Java练习35;

public class 练习07 extends A{
	public static void main(String[] args) {
		m();
	}
	
	public static void m() {
		A.main(new String[4]);
	}
}

class A{
	public static void main(String[] args) {
		m();
	}
	
	public static void m() {
		System.out.println("A");
	}
}
