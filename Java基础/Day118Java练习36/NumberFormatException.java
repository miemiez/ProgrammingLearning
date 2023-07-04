package Day118Java练习36;

public class NumberFormatException {
	public static void main(String[] args) {
		/*
		 * 数字格式不正确异常
		 *     当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常 => 使用异常我们可以确保输入是满足条件数字
		 */
		String name = "一二三四";
		String name2 = "1234";
		//将String转成int
		int num2 = Integer.parseInt(name2);
		System.out.println(num2);//1234
		int num = Integer.parseInt(name);//抛出NumberFormatException
		System.out.println(num);
	}
}
