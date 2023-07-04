package Day19HashMapStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		/*
		 * HashMap键值key可以存放自定义的对象
		 * 但是key存放自定义的对象时，需要重写equals以及hashCode方法
		 */
		
		HashMap<Student,String> hashMap = new HashMap<>();
		HashMap<Student,String> hashMap1 = new HashMap<>();
		ArrayList<HashMap<Student,String>> arrayList = new ArrayList<>();
		
		hashMap.put(new Student("LHY",22), "112");
		hashMap.put(new Student("QYH",22), "119");
		hashMap.put(new Student("ZJH",23), "120");
		hashMap.put(new Student("LHY",22), "110");
		
		hashMap1.put(new Student("TYS",22), "138");
		
		arrayList.add(hashMap);
		arrayList.add(hashMap1);
		
		System.out.println(arrayList);
		
		Set<Map.Entry<Student,String>> entry = hashMap.entrySet();
		for(Map.Entry<Student, String> e:entry) {
			System.out.println(e.getKey().getName() + "今年" + e.getKey().getAge() + "岁，手机号码是：" + e.getValue());
		}
	}
}
