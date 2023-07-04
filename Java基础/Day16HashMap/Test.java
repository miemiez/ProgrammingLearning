package Day16HashMap;

public class Test {
	public static void main(String[] args) {
		String s = new String("a");
		String s1 = new String("a");
		System.out.println(s.equals(s1));
		
		
		Fa s2 = new Son();
		Fa s3 = new Son();
		Son s4 = new Son();
		Fa s5 = new Fa();
		System.out.println(s2.equals(s3));
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.getClass());
		System.out.println(s3.getClass());
		System.out.println(s4.getClass());
		method(s4);
		method(s5);
		
	}
	
	public static void method(Fa h) {
		System.out.println(h.getClass() + "可以调用该方法");
	}
}
