package Day19HashMap04;

import java.awt.image.Kernel;

public class MyHashMap2<K,V> {
	private Entry[] entry = new Entry[1000];
	
	public class Entry<K,V>{
		K k;
		V v;
		int hash;
		Entry<K,V> next;
		
		public Entry(K k,V v,int hash) {
			this.k = k;
			this.v = v;
			this.hash = hash;
		}
	}
	
	public void put(K k,V v) {
		int hash = k.hashCode();
		int index = k.hashCode()%entry.length;
		if(entry[index] == null) {
			entry[index] = new Entry<>(k,v,hash);
		}else {
			entry[index].next = new Entry<>(k,v,hash);
		}
		
	}
	
	public V get(K k) {
		int h = k.hashCode();
		int index = k.hashCode()%entry.length;
		for(Entry<K,V> e = entry[index];e != null;e = e.next ) {
			if(e.hash == h && (e.k == k || e.k.equals(k))) {
				return e.v;
			}
		}
		return null;
	}
}
