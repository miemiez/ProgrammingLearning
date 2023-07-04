package Day137Java55;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
		//void add(int index,Object ele)：在index位置插入ele元素
		//boolean addAll(int index,Collection eles)：从index位置开始将eles中的元素挨个插入
		List<String> list1 = new ArrayList<>();
		list1.add("张三疯");
		list1.add("假宝玉");
		list1.add(1,"凹凸曼");
		list1.add("tom");
		System.out.println("list1=" + list1);
		List<String> list2 = new ArrayList<>();
		list2.add("jack");
		list2.add("tom");
		list1.addAll(1,list2);
		System.out.println("list1=" + list1);
		
		//Object get(int index)：获取指定index位置的元素
		System.out.println(list1.get(1));//jack
		
		//int indexOf(Object obj)：返回obj在集合中首次出现的位置，如果没找到就返回-1
		System.out.println(list1.indexOf("tom"));//2
		
		//int lastIndexOf(Object obj)：返回obj在当前集合中末次出现的位置
		System.out.println(list1.lastIndexOf("tom"));//5
		
		//Object remove(int index)：移除指定index位置的元素，并返回此元素
		System.out.println(list2.remove(1));//tom
		
		//Object set(int index,Object ele)：设置指定index位置的元素为ele，相等于是替换
		list1.set(3, "超级凹凸曼");
		System.out.println(list1);
		
		//List subList(int fromIndex,int toIndex)：返回从fromIndex到toIndex位置的子集合
		List listTranscript = list1.subList(1, 4);
		System.out.println(listTranscript);
	}
}
