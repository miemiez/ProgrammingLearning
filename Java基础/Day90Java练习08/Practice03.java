package Day90Java练习08;

public class Practice03 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		int result = t.factorial(5);
		System.out.println(result);
	}
}

class Test01{
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return factorial(n - 1) * n;
		}
	}
}
