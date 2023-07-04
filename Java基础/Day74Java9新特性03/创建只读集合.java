package Day74Java9新特性03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 创建只读集合 {
	/*
	 * 要创建一个只读，不可改变的集合，必须构造和分配它，然后添加元素，最后包装成一个不可修改的集合
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("Jerry");
		list.add("Lilei");
		list.add("HanMeimei");
		
		//调用Collections中的方法，将List变成只读的
		List<String> newList = Collections.unmodifiableList(list);
		//newlist.add("Tim");这条添加语句就不能执行了
		newList.forEach(System.out::println);
		
		test();
		testJDK9();
	}
	
	public static void test() {
		//List:
		List<Integer> list = Collections.unmodifiableList(Arrays.asList(1,2,3));
		//list.add(4);这条语句就无法执行
		
		//Set
		Set<Integer> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1,2,3)));
		set.forEach(System.out::println);
		
		//Map
		Map<Integer,String> map = Collections.unmodifiableMap(new HashMap<>() {
			{
				put(1,"Time");
				put(2,"Jerry");
				put(3,"Tom");
			}//HashMap的匿名子类，那么就可以在其中加入一个代码块
		});
		//map.put(1, "a");这条语句就无法执行
		map.forEach((k,y) -> System.out.println(k + ":" + y));
	}
	
	/*
	 * JDK9的方式创建一个只读集合
	 */
	public static void testJDK9() {
		//List
		List<String> list = List.of("a","b","c");//此时创建的list集合就是一个只读集合
		list.forEach(System.out::println);
		
		//Set
		Set<String> set = Set.of("D","E","Fs");
		set.forEach(System.out::println);
		
		//Map创建只读集合的方式一：
		Map<Integer,String> map = Map.of(4,"Hellon",5,"Jack",6,"Mary");
		map.forEach((k,v) -> System.out.println(k+":"+v));
		
		//Map创建只读集合的方式二：
		Map<Integer,String> map2 = Map.ofEntries(Map.entry(7,"Tim"),Map.entry(8, "Jacy"));
		map.forEach((k,v) -> System.out.println(k+":"+v));
	}
}
