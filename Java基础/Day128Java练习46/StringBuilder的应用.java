package Day128Java练习46;

public class StringBuilder的应用 {
	public static void main(String[] args) {
		/*
		 * String,StringBuffer和StringBuilder的比较
		 * 1）StringBuilder和StringBuffer非常类似，均代表可变的字符序列，而且方法也一样
		 * 2）String：不可变字符序列，效率低，但是【复用率高】，创建在常量池内的字符串，就算被重新指向，也依旧保留在常量池内，可以被复用。
		 * 3）StringBuffer：可变字符序列，效率较高（增删），线程安全
		 * 4）StringBuilder：可变字符序列，效率最高，线程不安全
		 * 5）String使用注意说明：
		 *      String s = "a";//创建了一个字符串
		 *      s += "b";/*
		 *                *实际上原来的"a"字符串对象已经丢弃了，现在又产生了一个字符串s + "b"（也就是"ab"）。
		 *                *如果多次执行这些改变串内容的操作，会导致大量副本字符串对象留存在内存中，降低效率。
		 *                *如果这样的操作放到循环中，会极大影响程序的性能
		 *                *【结论】如果我们要对String做大量修改，不要使用String
		 *                *
		 */
	}
}
