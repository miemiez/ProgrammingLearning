package Day15HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		/*
		 * 1.HashSet集合实现了Set接口；
		 * 2.HashSet基于HashMap来实现的，是一个不允许有重复元素的集合；
		 * 3.HashSet允许有null值；
		 * 4.HashSet是无序的，即不会记录插入的顺序；
		 * 5.HashSet没有Get方法（底层是基于HashMap实现的，存放key，是散列的，所以无法用index去访问元素），所以不能使用普通for循环遍历。
		 */
		HashSet<String> hss = new HashSet<>();
		hss.add("A");
		hss.add("A");//这个是存不进去的
		hss.add("B");
		hss.add("C");
		hss.add("D");
		hss.add("E");
		
		Iterator<String> is = hss.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		for(String s:hss) {
			System.out.println(s);
		}
	}
}
