package Day52Java8新特性3;

import java.util.Optional;
import java.util.function.Supplier;

public class TestOptional {
	/*
	 * Optional容器类的常用方法：
	 *     Optional.of(T t):创建一个Optional实例
	 *     Optional.empty():创建一个空的Optional实例
	 *     Optional.ofNullable(T t):若t不为null，创建Optional实例，否则创建空实例
	 *     isPresent():判断是否包含值
	 *     orElse(T t):如果调用对象包含值，返回该值，否则返回t
	 *     orElseGet(Supplier s):如果调用对象包含值，返回该值，否则返回s获取的值
	 *     map(Function f):如果有值对其处理，并返回处理后的Optional，否则返回Optional.empty()
	 *     flatMap(Function mapper):与map类似，要求返回值必须是Optional
	 */
	public static void main(String[] args) {
		TestOptional t = new TestOptional();
		t.test1();
		//t.test2();
		t.test3();
	}
	
	public void test1() {
		Optional<Employee> op = Optional.of(new Employee());//如果传入null会报空指针异常
		System.out.println(op.get());
	}
	
	public void test2() {
		Optional<Employee> op = Optional.empty();//创建一个空实例
		System.out.println(op.get());
	}
	
	public void test3() {
		Optional<Employee> op = Optional.ofNullable(null);//既可以创建一个对象实例，也可以创建空实例（并显示没有值，而不会报错）
		if(op.isPresent()) {//判断Optional容器内是否有值，有值则打印
			System.out.println(op.get());
		}
		Employee emp1 = op.orElse(new Employee("张三"));
		System.out.println(emp1.getName());//如果调用对象包含值，返回该值，否则返回"new Employee("张三")"这个对象
		
		Employee emp2 = op.orElseGet(() -> new Employee("李四"));//如果调用对象包含值，返回该值，否则返回"new Employee("李四")"这个对象
		System.out.println(emp2.getName());
		
		Optional<Employee> op2 = Optional.ofNullable(new Employee("王五"));
		
		Optional<String> str = op2.map((e) -> e.getName());
		System.out.println(str.get());//王五（如果op2中无值，则会显示没有值）
		
		Optional<String> str2 = op2.flatMap((e) -> Optional.of(e.getName()));//与map方法的区别是，要求实现Function接口时，apply方法返回的值为Optianal类型
		System.out.println(str2.get());
	}
}

class Employee {
	 private String name;
	 
	 public Employee() {
		 
	 }
	 
	 public Employee(String name) {
		 this.name = name;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
