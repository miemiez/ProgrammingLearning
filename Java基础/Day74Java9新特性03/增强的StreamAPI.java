package Day74Java9新特性03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 增强的StreamAPI {
	/*
	 * Java的Stream API是Java标准库最好的改进之一，让开发者能够快速运算，从而能够有效的利用数据并行计算，
	 * 并且从内存层面对集合和数组中的数据进行过滤，排序，规约，映射等一系列的操作
	 * 除了对Stream本身的扩展，Optional和Stream之间的结合也得到了改进，
	 * 现在可以通过Optional的新方法stream()将一个Optional对象转换为一个（可能是空的）Stream对象
	 */
	
	public static void main(String[] args) {
		增强的StreamAPI s = new 增强的StreamAPI();
		s.test1();
		s.test2();
		s.test3();
		s.test4();
	}
	
	/*
	 * jdk9中对于Stream新添加的4个方法：
	 *     1.takeWhile()
	 */
	public void test1() {
		List<Integer> list = Arrays.asList(11,22,33,44,55,66,77,88);
		List<Integer> list2 = Arrays.asList(11,44,20,30,40);
		
		Stream<Integer> listStream = list.stream();
		Stream<Integer> listStream2 = list2.stream().filter(x -> x < 40);
		Stream<Integer> listStream3 = list2.stream().takeWhile(x -> x < 40);
		
		listStream.takeWhile(x -> x < 50).forEach(System.out::println);
		System.out.println("-------");
		listStream2.forEach(System.out::println);//filter方法，区别于takeWhile方法，是筛选出全部的小于40的数
		System.out.println("-------");
		listStream3.forEach(System.out::println);//当集合中有值小于40时，就会被取出，一旦判断出有值大于等于40，就不会再取后面的值了
		System.out.println("-------");
	}
	
	/*
	 *     2.dropWhile()
	 *         与takeWhile()相反（互补），dropWhile()是返回剩余元素
	 */
	public void test2() {
		List<Integer> list = Arrays.asList(32,45,65,2,34);
		List<Integer> list2 = Arrays.asList(23,44,55,66,77,88);
		
		int[] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		IntStream stream = Arrays.stream(i);
		
		Stream<Integer> listStream = list.stream().dropWhile(x -> x < 60);
		Stream<Integer> listStream2 = list2.stream().dropWhile(x -> x < 60);
		
		listStream.forEach(System.out::println);
		System.out.println("-------");
		listStream2.forEach(System.out::println);
		System.out.println("-------");
		i[2] = 4;
		stream.forEach(System.out::println);
	}
	
	/*
	 *     3.ofNullable()
	 *         java8中Stream不能完全为null，否则会报空指针异常，
	 *         而Java9中的ofNullable方法允许我们创建一个单元素Stream，可以包含一个非空元素，也可以创建一个空的Stream
	 */
	public void test3() {
		Stream<Integer> stream1 = Stream.of(1,2,3,null);//【Java8的of()方法】
		stream1.forEach(System.out::println);
		System.out.println("-------");
		
		//Stream<Object> stream2 = Stream.of(null);【如果只有单个元素，则此元素不能为null，否则报NullPointerException】
		
		Stream<Object> stream2 = Stream.ofNullable(null);
		System.out.println(stream2.count());//0
		
		Stream<String> stream3 = Stream.ofNullable("TOM");//只能存储单元素
		System.out.println(stream3.count());//1
	}
	
	/*
	 *     4.Iterator()
	 *         重载的使用
	 */
	public void test4() {
		/*
		 * Stream的实例化方法：
		 *     1.通过集合的stream()方法
		 *     2.通过数组工具类：Arrays
		 *     3.Stream中的静态方法of()
		 *     4.iterator()/generator()
		 */
		//原来的控制终止方式：
		Stream.iterate(0,x -> x+1).limit(10).forEach(System.out::println);
		//现在的终止方式：
		Stream.iterate(0 ,x -> x < 10 ,x -> x + 1).forEach(System.out::println);
	}
}
