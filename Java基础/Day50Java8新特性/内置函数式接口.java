package Day50Java8新特性;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 内置函数式接口 {
	public static void main(String[] args) {
		/*
		 * Java8 内置的四大核心函数式接口
		 *     Consumer<T>:消费型接口
		 *         void accept（T t);
		 *     Supplier<T>:供给型接口
		 *         T get();
		 *     Function<T,R>:函数型接口
		 *         R apply(T t);
		 *     Predicate<T>:断言型接口
		 *         boolean test(T t);
		 */
		内置函数式接口 n = new 内置函数式接口();
		n.test1();
		n.test2();
		n.test3();
		n.test4();
	}
	
	//Consumer<T>消费型接口：
	public void test1() {
		happy(10000,m -> System.out.println("消费型接口，消费了" + m + "圆"));
	}
	
	public void happy(double money,Consumer<Double> con) {
		con.accept(money);
	}
	
	//Supplier<T>供给型接口
	public void test2() {
		List<Integer> list = supply(10,() -> (int)(Math.random()*100));
		System.out.println(list);
	}
	
	//需求：产生指定个数的整数，并放入集合中
	public List<Integer> supply(int num,Supplier<Integer> supplier) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i < num;i++) {
			Integer n = supplier.get();
			list.add(n);
		}
		return list;
	}
	
	//Function<T,R>函数型接口
	public void test3() {
		String s = strHandler("\t\t我是内容部分",(str) -> str.trim());
		System.out.println(s);
	}
	
	//需求：用于处理字符串
	public String strHandler(String str,Function<String,String> fun) {
		return fun.apply(str);
	}
	
	//Predicate<T>断言型接口
	public void test4() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("bb");
		list.add("ccc");
		list.add("dddd");
		List<String> newList = filterStr(list,(str) -> str.length() < 3);
		System.out.println(newList);
	}
	
	//需求：将满足条件的字符串，放入集合中
	public List<String> filterStr(List<String> list,Predicate<String> pre){
		List<String> newList = new ArrayList<>();
		for(String str:list) {
			if(pre.test(str)) {
				newList.add(str);
			}
		}
		return newList;
	}
}