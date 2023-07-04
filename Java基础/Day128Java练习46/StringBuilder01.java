package Day128Java练习46;

public class StringBuilder01 {
	public static void main(String[] args) {
		/*
		 * 1.StringBuilder继承AbstractStringBuilder类
		 * 2.实现了Serializable，说明StringBuilder对象是可以串行化（对象可以网络传输，可以保存到文件）
		 * 3.StringBuilder是final类，不能被继承
		 * 4.StringBuilder对象的字符序列仍然是存放在其父类AbstractStringBuilder的char[] value中
		 *   因此，字符序列是在堆中
		 * 5.StringBuilder的方法，没有做互斥的处理，即没有synchronized关键字，因此在单线程的情况下使用StringBuilder
		 */
		StringBuilder sb = new StringBuilder();
	}
}
