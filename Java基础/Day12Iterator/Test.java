package Day12Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Test {
	public static void main(String[] args) {
		//用for循环来迭代
		ArrayList<String> as = new ArrayList<>();
		as.add("a");
		as.add("b");
		as.add("c");
		as.add("d");
		for(int i = 0;i < as.size();i++) {
			String str = as.get(i);
			System.out.println(str);
		}
		
		//用Iterator迭代器来迭代
		Collection<String> cs = new ArrayList<>();
		cs.add("A");
		cs.add("B");
		cs.add("C");
		cs.add("D");
		Iterator<String> iterator = cs.iterator();
		System.out.println(iterator.next() + iterator.hasNext());
		System.out.println(iterator.next() + iterator.hasNext());
		System.out.println(iterator.next() + iterator.hasNext());
		System.out.println(iterator.next() + iterator.hasNext());
		try {
			System.out.println(iterator.next() + iterator.hasNext());
		}catch(NoSuchElementException nsee) {
			System.out.println(nsee.getMessage());
		}
		
		//循环，当iterator.hasNext()为false时，退出循环，以此来达到遍历的效果
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
