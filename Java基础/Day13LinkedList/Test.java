package Day13LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		/**
		 * LinkedList底层是基于链表实现的，在做数据增删的时候效率非常高，但是做查询效率非常低
		 * LinkedList底层是基于双向链表来实现的
		 */
		List<String> ls = new LinkedList<>();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		
		System.out.println(ls.size());
		
		linkedListIterator(ls);
		System.out.println(ls.get(0));
	}
	
	public static void linkedListIterator(List<String> linkedList) {
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
