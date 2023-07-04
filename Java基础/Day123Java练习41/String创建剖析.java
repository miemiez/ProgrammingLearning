package Day123Java练习41;

public class String创建剖析 {
	public static void main(String[] args) {
		/*
		 * 方式一：直接赋值String s1 = "XYY";
		 * 方式二：调用构造器String s2 = new String("XYY");
		 * 
		 * 1.方式一：先从常量池查看是否有“XYY”数据空间，如果有，直接指向；如果没有则重新创建，然后指向。【s1最终指向的是常量池的空间地址】。
		 * 2.方式二：先在堆中创建空间，里面维护了value属性，指向常量池的“XYY”空间。
		 *          如果常量池没有“XYY”，重新创建，如果有，直接通过value指向。【s2最终指向的是堆中的空间地址】。
		 */
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		System.out.println(a.equals(b));//T
		System.out.println(a == b);//T
		System.out.println(a == c);//F
		System.out.println(a.equals(c));//T
	}
}
