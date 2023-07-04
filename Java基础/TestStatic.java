public class TestStatic{
	private static int v1 = 10;
	private int v2 = 5;
	public TestStatic() {
		v1 += 1;
		v2 += 2;
	}
	public void set(int v) {
		v2 = v;
	}	
	
	public int get() {
		System.out.println(v2);
		return v2;
	}
	
	public static void main(String[] args) {
		TestStatic ts1 = new TestStatic();
		ts1.set(10);
		ts1.get();//10
		System.out.println(TestStatic.v1);//11
		System.out.println(ts1.v2);//10
		
		TestStatic ts2 = new TestStatic();
		ts2.set(15);
		ts2.get();//15
		System.out.println(TestStatic.v1);//12
		System.out.println(ts1.v2);//10
		System.out.println(ts2.v2);//15
	}
}