package Day143Java61Map接口;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map六大遍历方式 {
	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"a");
		hashMap.put(2,"b");
		hashMap.put(3,"c");
		hashMap.put(4,"d");
		hashMap.put(5,"e");
		
		//(1)KeySet(增强for循环)
		Set<Integer> keySet = hashMap.keySet();
		for(Integer i:keySet) {
			System.out.println(i + "=" + hashMap.get(i));
		}
		System.out.println("-------------");
		
		//(2)KeySet(迭代器)
		Iterator<Integer> i1 = keySet.iterator();
		while(i1.hasNext()) {
			int i = i1.next();
			System.out.println(i + "=" + hashMap.get(i));
		}
		System.out.println("-------------");
		
		//(3)Values(增强for循环)
		Collection<String> values = hashMap.values();
		for(String str:values) {
			System.out.println(str);
		}
		System.out.println("-------------");
		
		//(4)Values(迭代器)
		Iterator<String> i2 = values.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("-------------");
		
		//(5)EntrySet(增强for循环)
		Set<Map.Entry<Integer,String>> entry = hashMap.entrySet();
		for(Map.Entry<Integer, String> node:entry) {
			System.out.println(node);
		}
		System.out.println("-------------");
		
		//(6)EntrySet(迭代器)
		Iterator<Map.Entry<Integer, String>> i3 = entry.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
	}
}