package Day118Java练习36;

public class 异常处理 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		/*
		 * num1 / num2 => 10 / 0
		 * 当执行到num1 / num2 因为num2 = 0，程序就会出现（抛出）异常ArithmeticException
		 * 当抛出异常后，程序就会退出，崩溃了，下面的代码就不会再执行
		 * 【这样的程序好吗？】
		 *     【不好，将来做的项目，会比较庞大，不应该出现了一个不算致命的问题，就导致整个系统崩溃】
		 *     
		 * java设计者，提供了一个叫异常处理机制来解决该问题：
		 *     如果程序员，认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决，从而保证程序的健壮性
		 *     
		 * 如果进行异常处理，那么即使出现了异常，程序也可以继续执行
		 */
		try {
			int res = num1 / num2;//【运行时异常】
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("程序继续运行");
	}
}
