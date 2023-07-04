package Day14Genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericityWildcardCharacter {
	public static void main(String[] args) {
		List<String> als = new ArrayList<>();
		List<Integer> ali = new ArrayList<>();
		als.add("1");
		als.add("2");
		als.add("3");
		ali.add(1);
		ali.add(2);
		printList(als);
		printList(ali);
	}
	
	//List<?>只能用于删除和查询，可以接收所有的泛型类型，但是不能够用于添加和修改
	public static void printList(List<?> arrayList) {
		arrayList.remove(0);
		System.out.println(arrayList.get(0));
	    System.out.println(arrayList.size() + "\n");
	    //arrayList.add("a");这个就会报错；
	    //arrayList.set(0, "1");这个也会报错；
	}
}
