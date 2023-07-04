package Day19HashMap04;

public class Test {
	public static void main(String[] args) {
		//通过hash表来实现Map集合
		//HashMap集合1.7版本是通过数组+链表实现
		//HashMap集合1.8版本是通过数组+链表+红黑树实现
		MyHashMap<String,String> myHashMap = new MyHashMap<>();
		myHashMap.put("abcd", "ABCD");
		System.out.println(myHashMap.get("abcd"));
		
		MyHashMap<Object,String> myHashMap1 = new MyHashMap<>();
		myHashMap1.put("a", "ABCD");
		myHashMap1.put(97, "ABC");
		System.out.println(myHashMap1.get("a"));
		System.out.println(myHashMap1.get(97));
	}
}
