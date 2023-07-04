public class TestStaticMethod{
	public static void main(String[] args) {
		TestStaticMethod tsm = new TestStaticMethod();
		tsm.setA(1);
		tsm.setB(2);
		int c = tsm.getA();
		System.out.println(c);
		int d = tsm.getB();
		System.out.println(d);
	}
	
	private static int a = 10;
	private int b = 20;
	
	public void setA(int a) {
		TestStaticMethod.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
}