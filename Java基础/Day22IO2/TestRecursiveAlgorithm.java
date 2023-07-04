package Day22IO2;

public class TestRecursiveAlgorithm {
	public static void main(String[] args) {
		/*
		 * 递归算法（recursive algorithm）：就是自己一直在调用自己
		 * 栈空间是有深度限制的----（如果没有限制就会发生“栈溢出”）
		 * 递归算法求阶乘
		 * 
		 * 递归算法注意事项：限制递归调用的深度，避免栈空间溢出
		 * 即通过一些条件限制
		 */
		System.out.println(factorial(5));
		
	}
	
	public static int factorial(int i) {
		if(i == 1) {
			return 1;
		}else {
			return i*factorial(i-1);
		}
	}
}
