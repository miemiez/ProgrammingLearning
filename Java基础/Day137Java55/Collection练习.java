package Day137Java55;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection练习 {
	public static void main(String[] args) {
		Dog d1 = new Dog("婕斯",3);
		Dog d2 = new Dog("杰森",2);
		Dog d3 = new Dog("杰瑞",3);
		List<Dog> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		Iterator<Dog> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------");
		for(Dog d : list) {
			System.out.println(d);
		}
	}
	
}
