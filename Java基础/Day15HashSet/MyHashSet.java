package Day15HashSet;

import java.util.HashMap;

public class MyHashSet<E> {
	private HashMap<E,Object> map;
	private static final Object PRESENT = new Object();
	
	public MyHashSet(){
		map = new HashMap<>();
	}
	
	public void myAdd(E e) {
		map.put(e,PRESENT);
	}
	
	@Override
	public String toString() {
		return "[" + map + "]";
	}
}
