package Day144Java62HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMap底层机制 {
	public static void main(String[] args) {
		/*
		 * 1.HashMap底层维护了Node类型的数组table，默认为null
		 * 2.当创建对象时，将加载因子（loadfactor）初始化为0.75
		 * 3.当添加key-val时，通过key的哈希值得到在table的索引，然后判断该索引处是否有元素，如果没有元素直接添加。
		 *   如果该索引处有元素，继续判断该元素的key是否和准备加入的key相等，如果相等，则直接替换val；如果不相等，
		 *   则需要判断是树结构还是链表结构，做出相应处理。如果添加时发现容量不够，则需要扩容。
		 * 4.第一次添加，则需要扩容table容量为16，临界值为12.
		 * 5.以后再扩容，则需要扩容table容量为原来的2倍，临界值为原来的2倍，即24，依此类推。
		 * 6.在Java8中，如果一条链表的元素个数超过TREEIFY_THRESHOLD（默认是8），并且table的大小 >= MIN_TREEIFY_CAPACITY（默认是64）
		 *   就会进行树化（红黑树）
		 */
		Map<A,String> hashMap = new HashMap<>();
		System.out.println("开始添加内容");
		for(int i = 0;i < 13;i++) {
			hashMap.put(new A(i), "yeah");
		}
		Map<Integer,String> hm = new HashMap<>();
		hm.put(null, "a");
		hm.put(0, "b");
		hm.put(1, "c");
		Set<Map.Entry<Integer,String>> set = hm.entrySet();
		for(Map.Entry<Integer, String> entry:set) {
			System.out.println(entry);
		}
	}
}

class A{
	private String name;
	private int age;
	@Override
	public int hashCode() {
		return 100;
	}
	
	public A(int age){
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
