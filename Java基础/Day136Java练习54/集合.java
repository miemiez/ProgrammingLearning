package Day136Java练习54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 集合 {
	public static void main(String[] args) {
		/*
		 * 集合体系图
		 *                                      Iterable
		 *                                     Collection
		 *               [List]                                       [Set]     
		 *  [ArrayList   LinkedList   Vector]                  [HashSet     TreeSet]
		 *                                     
		 *                                     
		 *                                     Map
		 *                 [HashMap]        [TreeMap]         [Hashtable]
		 *               [LinkedHashMap]                     [Properties]
		 */
		/*
		 * Collection接口常用方法
		 *     （1）add：添加单个元素
		 *     （2）remove：删除指定元素
		 *     （3）contains：查找元素是否存在
		 *     （4）size：获取元素个数
		 *     （5）isEmpty：判断是否为空
		 *     （6）clear：清空
		 *     （7）addAll：添加多个元素，传入的参数是实现了Collection接口的类
		 *     （8）containsAll：查找多个元素是否都存在
		 *     （9）removeAll：删除多个元素，传入的参数是实现了Collection接口的类
		 */
		/*
		 * 迭代器执行原理：
		 *    Iterator iterator = coll.iterator();//得到一个集合的迭代器
		 *    hasNext()：判断是否还有下一个元素
		 *    while(iterator.hasNext()){
		 *        //next()作用：1.下移 2.将下移以后集合位置上的元素返回
		 *        System.out.println(iterator.next());
		 *    }
		 *    
		 *    当退出while循环后，这时iterator迭代器，指向最后的元素
		 *        iterator.next();//NoSuchElementException
		 *    如果希望再次遍历，需要重置迭代器
		 */
		List<Integer> al1 = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(11);
		al2.add(9);
		al2.add(10);
		al1.removeAll(al2);
		System.out.println(al1);
		System.out.println(al1.get(0));
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");
		hm.put((int)'a', "LHY");
		hm.put(97,"lll");
		Set<Map.Entry<Integer,String>> ms = hm.entrySet();
		System.out.println(hm.get(999999999));//null
		System.out.println("-------------------------");
		Iterator<Map.Entry<Integer,String>> iterator = ms.iterator();
		while(iterator.hasNext()) {//迭代方法一：
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------");
		iterator = ms.iterator();//重置迭代器
		while(iterator.hasNext()) {//迭代方法一（如果再次使用迭代器迭代这个Set数组，则需要重置迭代器）：
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------");
		for(Map.Entry<Integer, String> m : ms) {//迭代方法二（增强for循环，就是简化版的iterator，本质一样）：
			System.out.println(m.getKey() + "=" + m.getValue());
		}
		
	}
}
