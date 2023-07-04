package Day17HashMap2;

import java.util.ArrayList;

public class MyHashMap2<K,V> {
	/*
	 * 利用ArrayList实现HashMap的优缺点：
	 * ******缺点：get方法用的是循环查找，而不是index查询，效率低
	 * 优点：可以保证键值对有序存放
	 */
	private ArrayList<Entry<K,V>> arrayList = new ArrayList<>();
	
	public class Entry<K,V>{//Entry对象是用来存放键值对的
		K k;
		V v;
		
		public Entry(K k,V v){
			this.k = k;
			this.v = v;
		}
	}
	
	public void put(K k,V v) {
		arrayList.add(new Entry<>(k,v));
	}
	
	public V get(K k) {
		for(Entry<K,V> entry:arrayList) {
			if(entry.k.equals(k)) {
				return entry.v;
			}
		}
		return null;
	}
}
