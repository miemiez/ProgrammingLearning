package Day14Genericity2;

public class TestVariableParameter {
	public static void main(String[] args) {
		returnParameter(1,2,3);
		returnParameter(1,2,3,4,5,6);
		
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));
	}
	
	/*
	 * int... a 为可变参数 底层是基于数组实现的
	 * 传递的参数列表---可变，底层封装成数组的形式传递给我们的方法
	 */
	public static int returnParameter(int... a) {
		for(int i = 0;i < a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
		return 0;
	}
	
	public static int sum(int... a) {
		int sum = 0;
		for(int i = 0;i < a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
}
