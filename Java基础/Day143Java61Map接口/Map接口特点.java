package Day143Java61Map接口;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map接口特点 {
	public static void main(String[] args) {
		/*
		 * 1.Map用于保存具有映射关系的数据（K-V）
		 * 2.Map中的key和value可以是任何引用类型的数据，会封装到HashMap$Node对象中
		 * 3.Map中的key不允许重复，原因和HashSet一样
		 * 4.Map中的value可以重复
		 * 5.Map的key可以为null，value也可以为null，注意key为null，只能有一个，value为null，可以多个
		 * 6.常用String类作为Map的key
		 * 7.key和value之间存在单向一对一关系，即通过指定的key总能找到对应的value
		 * 8.Map存放数据的key-value，一对k-v是放在一个HashMap$Node中的，又因为Node实现了Entry接口，有些书上也说一对k-v就是一个Entry
		 * 
		 * 
		 * 1.k-v最后是HashMap$Node node = new Node(hash,key,value,null);
		 * 2.k-v为了方便程序员遍历，还会创建EntrySet集合，该集合存放的元素的类型为Entry，而一个Entry对象就有
		 *   k，v  EntrySet<Entry<k,v>>即：transient Set<Map.Entry<K,V>> entrySet
		 * 3.entrySet中，定义的类型是Map.Entry，但实际上存放的还是HashMap$Node
		 *   这是因为static class HashMap$Node implements Map.Entry
		 * 4.这样当把 HashMap$Node 对象存放到entrySet就方便我们的遍历，因为Map.Entry提供了两个重要的方法：
		 *   K getKey(); V getValue();
		 */
		
		/*
		 * Map中存放EntrySet，EntrySet中存放Entry，Entry中包含k-v键值对
		 */
		Map map = new HashMap<>();
		map.put("no1","XYY");
		map.put("no2","LYY");
		Set<Map.Entry> set = map.entrySet();
		System.out.println(set.getClass());//HashMap$EntrySet
		for(Object entry:set) {
			System.out.println(entry.getClass());//HashMap$Node
			Map.Entry e = (Map.Entry)entry;
			System.out.println(e.getKey());
		}
	}
}