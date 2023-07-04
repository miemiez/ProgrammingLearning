package Day90Java练习08;

public class Practice02 {
	public static void main(String[] args) {
		Test t = new Test();
		t.test(4);
	}
}

class Test{
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}
}
