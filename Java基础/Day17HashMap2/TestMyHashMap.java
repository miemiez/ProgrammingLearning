package Day17HashMap2;

import java.util.HashMap;

public class TestMyHashMap {
	public static void main(String[] args) {
		/*
		 * 1.HashMap的key是可以为自定义的对象的
		 * 2.HashMap存储的数据是无序的
		 * 3.HashMap的key是可以存放null值的，存放在数组中的第一个，也就是index=0（HashTable的key是不允许存放null的）
		 * 4.HashMap集合中键值对的封装方法：是利用Map接口封装Entry对象，再交给子类实现
		 */
		MyHashMap myHashMap = new MyHashMap();
		HashMap<MyHashMap,String> hashMap = new HashMap<>();
		MyHashMap2<Integer,String> myHashMap2 = new MyHashMap2<>();
		
		hashMap.put(myHashMap, "自定义对象可以作为HashMap集合的key");
		hashMap.put(null, "null");
		
		HashMap<Integer,String> hashMap2 = new HashMap<>();
		for(int i = 0;i < 100;i++) {
			hashMap2.put(i,"value值为"+i);
		}
		
		myHashMap2.put(01, "a");
		myHashMap2.put(02, "b");
		myHashMap2.put(03, "c");
		
		System.out.println(hashMap);
		System.out.println(hashMap2);
		System.out.println(myHashMap2.get(01));
	}
}
