package Day12Iterator;

import java.util.ArrayList;

public class ListIterator {
	public static void main(String[] args) {
		ArrayList<String> als = new ArrayList<>();
		als.add("A");
		als.add("B");
		als.add("C");
		als.add("D");
		
		java.util.ListIterator<String> lis = als.listIterator();
		//从前往后进行获取，正序
		while(lis.hasNext()) {
			System.out.println(lis.next());
		}
		//从后往前进行获取，倒序（在源码中本质是为count-=1）；如果不先进行next()方法，那么在源码中，count的数值就为0，0-1=-1没有-1的索引，所以就会报错。
		while(lis.hasPrevious()) {
			System.out.println(lis.previous());
		}
		
	}
}
