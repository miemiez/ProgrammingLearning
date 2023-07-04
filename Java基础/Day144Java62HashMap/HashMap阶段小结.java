package Day144Java62HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap阶段小结 {
	public static void main(String[] args) {
		/*
		 * 1.Map接口的常用实现类：HashMap，Hashtable和Properties
		 * 2.HashMap是Map接口使用频率最高的实现类
		 * 3.HashMap是以key-val对的方式来存储数据
		 * 4.key不能重复，但是val可以重复，允许使用null键和null值
		 * 5.如果添加相同的key，则会覆盖原来的key-val，等同于修改（key不会替换，val会替换）
		 * 6.与HashSet一样，不保证映射的顺序，因为底层是以hash表的方式来存储的
		 * 7.HashMap没有实现同步，因此线程不安全
		 */
		Map<Object,String> hashMap = new HashMap<>();
		hashMap.put(97, "Tom");
		hashMap.put('a',"Jack");
		hashMap.put('a',"Jerry");
		Set<Map.Entry<Object,String>> entry = hashMap.entrySet();
		for(Map.Entry<Object,String> node:entry) {
			System.out.println(node);
		}
		Character c = 97;
	}
}