package Day140Java58HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet全面说明 {
	public static void main(String[] args) {
		/*
		 * （1）HashSet实现了Set接口
		 * （2）HashSet实际上是HashMap
		 *        public HashSet(){
		 *            map = new HashMap<>();
		 *        }
		 * （3）可以存放null值，但是只能有一个null
		 * （4）HashSet不保证元素是有序的，取决于hash后，再确定索引的结果
		 * （5）不能有重复的元素/对象，在前面Set接口使用已经讲过
		 */
		
		/*
		 * 1.执行add方法后，返回一个boolean值
		 * 2.如果添加成功，返回true，否则，返回false
		 * 3.可以通过remove指定删除哪个对象
		 */
		Set<String> hashSet = new HashSet<>();
		System.out.println(hashSet.add("john"));//T
		System.out.println(hashSet.add("lucy"));//T
		System.out.println(hashSet.add("jack"));//T
		System.out.println(hashSet.add("john"));//F
		System.out.println(hashSet.add("Rose"));//T
		System.out.println(hashSet.add(null));//T
		
		HashSet<Dog> hashSetDog = new HashSet<>();
		System.out.println(hashSetDog.add(new Dog("Tom")));//T
		System.out.println(hashSetDog.add(new Dog("Tom")));//T
		
		hashSet.remove("jack");
		System.out.println("hashSet=" + hashSet);
		System.out.println("hashSet=" + hashSetDog);
	}
}

class Dog{
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
}
