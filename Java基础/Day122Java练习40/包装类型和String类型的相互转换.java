package Day122Java练习40;

public class 包装类型和String类型的相互转换 {
	public static void main(String[] args) {
		/*
		 * 包装类型->String类型
		 */
		Integer i = 10;
		//方式一：
		String s1 = i.toString();
		//方式二：
		String s2 = String.valueOf(i);
		//方式三：
		String s3 = i + "";
		System.out.println(s3);
		
		/*
		 * String->包装类
		 */
		//方式一：
		Integer j = new Integer(s1);
		//方式二：
		Integer j2 = Integer.valueOf(s2);
	}
}
