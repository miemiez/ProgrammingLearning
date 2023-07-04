package Day50Java8新特性;

import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class 方法引用与构造器引用 {
	public static void main(String[] args) {
		/*
		 * 一：方法引用：若Lambda体中的内容方法已经实现了，我们可以使用“方法引用”
		 *     （可以理解为方法引用是Lambda表达式的另外一种表现形式）
		 * 
		 *     主要有三种语法格式：
		 *         对象::实例方法名
		 *         类::静态方法名
		 *         类::实例方法名
		 *     
		 *     注意：
		 *         （1）Lambda体中调用方法的【参数列表】与【返回值类型】，要与函数式接口中抽象方法的【参数列表】以及【返回值类型】保持完全一致才行
		 *         （2）若Lambda参数列表中的第一参数是实例方法的调用者，而第二个参数是实例方法的参数时，可以使用ClassName::method【具体可见68行和69行代码】
		 *         
		 *         
		 * 二：构造器引用：
		 *     格式：
		 *         ClassName::new
		 *     注意：需要调用的【构造器的参数列表】要与【函数式接口中抽象方法的参数列表】保持一致！
		 *     
		 * 三：数组引用：
		 *     格式：
		 *         Type[]::new
		 */
		方法引用与构造器引用 m = new 方法引用与构造器引用();
		m.test1();
		m.test2();
		m.test3();
		m.test4();
		m.test5();
		m.test6();
		m.test7();
	}
	
	//对象::实例方法名
	public void test1() {
		//写法一：
		PrintStream ps = System.out;
		Consumer<String> con = ps::println;
		con.accept("abcdef");
		
		/*
		 * 写法二：
		 * PrintStream ps2 = System.out;
		 * Consumer<String> con2 = (x) -> ps2.println(x);
		 */
	}
	
	//类::静态方法名
	public void test2() {
		Comparator<Integer> com1 = Integer::compare;
		Integer b = com1.compare(10, 1);
		System.out.println(b);
	}
	
	//类::实例方法名
	public void test3() {
		BiPredicate<String,String> bp0 = (x,y) -> x.equals(y);
		BiPredicate<String,String> bp = String::equals;
		boolean b = bp.test("a","b");
		System.out.println(b);
	}
	
	//构造器引用(一)：无参构造
	public void test4() {
		Supplier<C> sup = C::new;
		C c = sup.get();
		System.out.println(c);
	}
	
	//构造器引用（二）：单参数构造
	public void test5() {
		Function<String,C> fun = C::new;
		C c = fun.apply("LHY");
		System.out.println(c + "  name is:" + c.name);
	}
	
	//构造器引用（三）：双参数构造
	public void test6() {
		BiFunction<String,Integer,C> fun = C::new;
		C c = fun.apply("LHY",22);
		System.out.println(c + "  name is:" + c.name + ";age is:" + c.age);
	}
	
	//数组引用Type::new
	public void test7() {
		Function<Integer,String[]> fun = String[]::new;
		String[] strs = fun.apply(6);
		System.out.println(strs + "  数组长度为：" + strs.length);
	}
}

interface Comparator<T> {
	T compare(Integer a,Integer b);
}

class C {
	public String name;
	public int age;
	
	public C(){
		
	}
	
	public C(String name) {
		this.name = name;
	}
	
	public C(String name,int age) {
		this.name = name;
		this.age = age;
	}
}