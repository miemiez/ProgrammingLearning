package Day124Java练习42;

public class String测试题1 {
	public static void main(String[] args) {
		String a = "XYY";//a指向常量池的“XYY”
		String b = new String("XYY");//b指向堆中对象
		System.out.println(a.equals(b));//T
		System.out.println(a == b);//F
		System.out.println(a == b.intern());//T
		System.out.println(b == b.intern());//F
		/*
		 * 知识点intern()方法：
		 *     当调用intern方法时，如果池已经包含一个等于此String对象的字符串（用equals(Object)方法确定），则返回池中的字符串。
		 *     否则，将此String对象添加到池中，并返回此String对象的引用
		 *     
		 *     解读：b.intern()方法最终返回的是常量池的地址（对象）
		 */
	}
}
