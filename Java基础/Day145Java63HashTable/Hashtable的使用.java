package Day145Java63HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hashtable的使用 {
	public static String str = "v";
	public String str1 = "cc";
	public static void main(String[] args) {
		/*
		 * 1.存放的元素是键值对：即K-V
		 * 2.Hashtable的键和值都不能为null，否则会抛出NullPointerException
		 * 3.Hashtable使用方法和HashMap一样
		 * 4.Hashtable是线程安全的，HashMap是线程不安全的
		 */
		Hashtable<Integer,String> hashtable = new Hashtable<>();
		//hashtable.put(null, null);
		for(int i = 0;i < 13;i++) {
			hashtable.put(i, "yeah");
		}
		Set<Map.Entry<Integer,String>> entrySet = hashtable.entrySet();
		for(Map.Entry<Integer, String> entry:entrySet) {
			System.out.println(entry);
		}
		A a = new Hashtable的使用().new A();
		a.mains();
	}
	
	class A{
		public static String str = "aaa";
		public String str1 = "bbbb";
		public String aaa;
		
		public void mains() {
			System.out.println("Hashtable的使用.str=" + Hashtable的使用.this.str1 + "A的str1=" + str1);
		}
	}
}
