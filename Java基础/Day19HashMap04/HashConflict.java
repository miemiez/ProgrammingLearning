package Day19HashMap04;

import java.util.HashMap;

public class HashConflict {
	public static void main(String[] args) {
		MyHashMap<Object,Object> hashMap = new MyHashMap<>();
		
		hashMap.put("a", "a");
		hashMap.put(97, 97);
		
		System.out.println(hashMap.get("a"));//97(存储的时候因为计算出的index相等，所以后面put的97就直接将a给覆盖了)
	}
}
