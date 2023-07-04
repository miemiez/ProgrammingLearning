package Day16HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		/*
		 * 1.映射键值对的形式key和value key简称为k value v；
		 * 2.Map集合中 key是不允许重复的，但是value值是可以重复的，如果key存在，则直接修改value值；
		 * 3.Map集合是散列存放数据
		 */
		Map<Integer,String> his = new HashMap<>();
		his.put(1,"LHY");
		his.put(3, "QYH");
		his.put(2, "ZJH");
		his.put(4, "ZYY");
		
		System.out.println(his + "\n");
		
		his.put(2, "WB");//Map集合是不允许重复的，如果重复了，就修改value值
		System.out.println(his);
		System.out.println(his.get(1));
		System.out.println(his.get(5));//null
		String str = his.getOrDefault(5, "默认值");//当找不到key时，返回“默认值”；
		System.out.println(str + "\n");
		
		Set<Integer> si = his.keySet();//获取所有键的集合
		for(Integer s:si) {
			System.out.println(s);
		}
		System.out.println();
		
		Collection<String> cs = his.values();//获取所有值的集合
		for(String s:cs) {
			System.out.println(s);
		}
		System.out.println();
		
		Set<Map.Entry<Integer, String>> smis =  his.entrySet();//获取所有键值对的集合
		for(Map.Entry<Integer, String> s : smis) {
			System.out.println(s);
		}
		System.out.println();
		
		his.remove(1);//删除该对应的键值对；
		System.out.println(his + "\n");
		
		System.out.println(his.containsKey(1));//判断集合中是否包含指定的键；
		System.out.println(his.containsKey(2) + "\n");
		
		System.out.println(his.containsValue("LHY"));//判断集合中是否包含指定的值；
		System.out.println(his.containsValue("WB") + "\n");
		
		his.clear();//清空HashMap中的全部键值对；
		System.out.println(his + "\n");
		
		System.out.println(his.size());
		System.out.println(his.isEmpty());//判断集合是否为空；
	}
}
