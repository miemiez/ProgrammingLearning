package Day140Java58HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set接口方法 {
	public static void main(String[] args) {
		/*
		 * Set接口基本介绍
		 *     （1）无序（添加和取出的顺序不一致），没有索引
		 *     （2）不允许重复元素，所以最多包含一个null
		 *     （3）JDK API中Set接口的实现类有：
		 *                 HashSet，TreeSet，EnumSet等等
		 *     （4）注意：取出的顺序虽然不是添加的顺序，但是它是固定的
		 */
		
		/*
		 * Set接口的常用方法：
		 *     和List接口一样，Set接口也是Collection的子接口，因此，常用方法和Collection接口一样
		 */
		
		/*
		 * Set接口的遍历方式
		 *     同Collection的遍历方式一样，因为Set接口是Collection接口的子接口
		 *     1.可以使用迭代器
		 *     2.增强for
		 *     3.不能使用索引的方式来获取
		 */
		Set<String> set = new HashSet<>(10);
		set.add("afdsaf");
		set.add("bergr");
		set.add("cerhbs");
		set.add("dfasfa");
		set.add("egarhg");
		set.add(null);
		set.add(null);//重复元素不会再添加
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());//无序的
		}
	}
}
