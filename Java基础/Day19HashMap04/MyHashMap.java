package Day19HashMap04;

public class MyHashMap<K,V> {
	private Entry[] entry = new Entry[10000];
	public class Entry<K,V>{
		K k;
		V v;
		int hash;
		
		public Entry(K k,V v) {
			this.k = k;
			this.v = v;
		}
	}
	
	public void put(K k,V v) {
		int index = k.hashCode()%entry.length;
		entry[index] = new Entry<>(k,v);
	}
	
	public V get(K k) {
		int index = k.hashCode()%entry.length;
		return (V)entry[index].v;
	}
}
