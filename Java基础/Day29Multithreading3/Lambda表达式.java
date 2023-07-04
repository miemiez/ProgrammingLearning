package Day29Multithreading3;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda表达式 {
	public static void main(String[] args) {
		/*
		 * 函数式编程：这是一种思想特点，忽略面向对象的复杂语法，强调做什么，而不是谁去做（更加关注方法体中的逻辑，而不是创建出来的对象）。
		 * 区别于面向对象（先找对象，让对象做事情）
		 * lambda表达式就是函数式编程的思想体现（jdk8才开始出现的一种新语法形式）
		 * lambda的标准格式：
		 *     () -> {
		 *     
		 *     }
		 *     
		 *     1.()：对应着方法的形参
		 *     2.->：固定格式
		 *     3.{}：方法的方法体
		 *     
		 * lambda表达式的注意点：
		 *     1.lambda表达式可以用来简化匿名内部类的书写
		 *     2.lambda表达式只能简化函数式接口的匿名内部类的写法（必须是只有一个抽象方法的接口！！！）
		 *         （函数式接口：有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解）
		 */
		
		Integer[] arr = {1,2,3,4,5};

		
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return b-a;
			}
		});
		
		//用lambda表达式进行简化
		
		Arrays.sort(arr,(Integer a,Integer b) -> {return b-a;});
		
		System.out.println(Arrays.toString(arr));
		
		/*
		 * ----------------------------------
		 */
		
		method(() -> {System.out.println("玩家1号正在玩游戏");});//调用method()方法，用lambda表达式进行传参的简划
		
		/*
		 * ----------------------------------
		 */
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
			}
			
		},"Thread-A").start();	
		
		//用lambda表达式进行简化
		
		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
		
	}
	
	public static void method(Player p) {//传参为Player接口实现类的对象p
		p.playing();
	}
}

interface Player{
	/*
	 * ***如果要改写成lambda表达式必须要是接口，且有且仅有一个方法***
	 */
	public abstract void playing();
}
