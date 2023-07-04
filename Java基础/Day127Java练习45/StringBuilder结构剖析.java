package Day127Java练习45;

public class StringBuilder结构剖析 {
	public static void main(String[] args) {
		/*
		 * 1）一个可变的字符序列，此类提供一个与StringBuffer兼容的API，但不保证同步。
		 *    该类被设计用作StringBuffer的一个简易替换，用在字符串缓冲区被单个线程使用的时候。如果可能，建议优先采用该类
		 *    因为在大多数实现中，它比StringBuffer要快
		 * 2）在StringBuilder上的主要操作是append和insert方法，可重载这些方法， 以接收任意类型的数据
		 */
		
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.5));
	}
}
