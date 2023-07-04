public class TestStatic1{
	public static void cala(int num1, int num2) {
		int result =  num1 + num2;
		System.out.println(result);
	}
	
	public void cala2(int num1,int num2) {
		int result = num1 / num2;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		TestStatic1.cala(2,3);
		TestStatic1 ts = new TestStatic1();
		ts.cala2(4,5);
	}
}