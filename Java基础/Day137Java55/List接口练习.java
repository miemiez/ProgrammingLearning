package Day137Java55;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List接口练习 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");
		list1.add("j");
		list1.add(2, "HSPedu");
		System.out.println(list1.get(4));
		System.out.println(list1.remove(5));
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
