package Day73Java9新特性02;

public class String底层存储结构的变化 {
	/*
	 * JDK8以及之前：
	 *     String：底层使用char[]存储
	 *     StringBuffer：底层使用char[]存储
	 *     StringBuilder：底层使用char[]存储
	 *     
	 * JDK9：
	 *     String：底层使用byte[]（encode）
	 *     StringBuffer：底层使用byte[]（encode）存储
	 *     StringBuilder：底层使用byte[]（encode）存储
	 * 
	 * StringBuffer：为可变的字符序列，线程安全，但执行效率低
	 * StringBuilder：为可变的字符序列，线程不安全，但是执行效率高
	 * String为不可变字符序列
	 */
}
