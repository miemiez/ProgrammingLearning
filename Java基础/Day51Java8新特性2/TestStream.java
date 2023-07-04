package Day51Java8新特性2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		/*
		 * （一）流（Stream）：
		 *     是数据渠道，用于操作数据源（集合，数组等）所生成的元素序列。（集合讲的是数据，流讲的是计算！）
		 *     注意：
		 *         Stream自己不会存储元素；
		 *         Stream不会改变源对象，相反，他们会返回一个持有结果的新Stream；
		 *         Stream操作是延迟执行的，这意味着他们会等到需要结果的时候才执行
		 *         
		 *     
		 * （二）Stream操作的三个步骤：
		 *     创建Stream
		 *         一个数据源（如：集合，数组），获取一个流
		 *     中间操作
		 *         一个中间操作链，对数据源的数据进行处理
		 *     终止操作（终端操作）
		 *         一个终止操作，执行中间操作链，并产生结果
		 *         
		 * （三）中间操作：
		 *     筛选与切片：
		 *         filter--接收Lambda，从流中排除某些元素
		 *         limit--截断流，使其元素不超过给定数量
		 *         skip(n)--跳过元素，返回一个扔掉了前n个元素的流，若流中元素不足n个，则返回一个空流，与limit(n)互补
		 *         distinct--筛选，通过流所生成元素的hashCode()和equals()去除重复元素
		 */
		TestStream ts = new TestStream();
		ts.test1();
	}
	
	public void test1() {
		//1.通过Collectors系列集合提供的stream()或parallelStream()创建
		List<String> list = new ArrayList<>();
		Stream<String> stream1 = list.stream();
		
		//2.通过Arrays中的静态方法stream()获取数组流
		Employee[] emps = new Employee[10];
		Stream<Employee> stream2 = Arrays.stream(emps);
		
		//3.通过Stream类中的静态方法of()
		Stream<String> stream3 = Stream.of("aa","bb","cc");
		
		//4.创建无限流（迭代）
		Stream<Integer> stream4 = Stream.iterate(0,x->x+2);
		//终止操作，一次性执行全部内容，即“惰性求值”
		stream4.forEach(System.out::println);
		
		//生成
		Stream.generate(() -> Math.random())
		      .limit(5)
		      .forEach(System.out::println);
	}
}

class Employee {
	
}
