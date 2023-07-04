package Day18HashMap3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer,Student> hashMap = new HashMap<>();
		hashMap.put(01,new Student("LHY",22));
		hashMap.put(02, new Student("QYH",22));
		hashMap.put(03, new Student("ZJH",23));
		hashMap.put(04, new Student("TYS",22));
		
		Set<Integer> stu = hashMap.keySet();
		for(Integer s:stu) {
			System.out.println(hashMap.get(s).getName() + "今年" + hashMap.get(s).getAge() + "岁");
		}
		/*
		Set<Map.Entry<Integer, Student>> stu1 = hashMap.entrySet();
		for(Map.Entry<Integer, Student> m:stu1) {
			System.out.println(m.getValue().getName() + "今年" + m.getValue().getAge() + "岁");
		}
		
		Iterator<Map.Entry<Integer,Student>> iterator = stu1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getValue().getName() + "今年" + iterator.next().getValue().getAge() + "岁");
		}
		*/
	}
}
