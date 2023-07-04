package Day123Java练习41;

public class String结构剖析 {
	public static String s;
	public static void main(String[] args) {
		/*
		 * 1）String对象用于保存字符串，也就是一组字符序列
		 * 2）字符串常量对象是用双引号括起的字符序列。例如：“你好”，“12.97”，“boy”等等
		 * 3）字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字节。
		 * 4）String类常用的构造器
		 *         String s1 = new String();
		 *         String s2 = new String(String original);
		 *         String s3 = new String(char[] a);
		 *         String s4 = new String(char[] a,int startIndex,int count)
		 * 5）String 类实现了接口，Serializable【String 可以串行化：可以在网络传输】
		 *                  接口 Comparable【String对象可以比较大小】
		 * 6）String是final类，不能被其他的类继承
		 * 7）String有属性private final char value[];用于存放字符串内容
		 * 8）一定要注意：value是一个final类型，赋值后，不可修改【即：value不能指向新的地址，但是单个字符内容是可以修改的；final修饰的对象，不可以修改引用，但是可以修改内容】
		 */
		
		//4
		char[] a = {'a','b','c'};
		String s1 = new String();
		String s2 = new String("original");
		String s3 = new String(a);
		String s4 = new String(a,0,1);
		String s5 = "original";
		System.out.println(s);
		System.out.println(s1 + "\r" + s2 + "\r" + s3 + "\r" + s4);
		System.out.println(s2 == s5);//false
		
		//7,8
		final char[] value = {'a','b','c'};
		char[] v2 = {'t','o','m'};
		//value = v2;这条语句不能执行成功【不可以修改value地址】
		value[0] = 'A';
	}
}