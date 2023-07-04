package Day29Multithreading3;

import java.util.Arrays;

public class Lambda表达式的省略 {
	public static void main(String[] args) {
		/*
		 * lambda的省略规则：
		 *     1.参数类型可以省略不写
		 *     2.如果只有一个参数，参数类型可以省略，同时()也可以省略；
		 *     3.如果lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略；
		 */
		Integer[] arr = {1,2,3,4,5};
		
		Arrays.sort(arr,(a,b) -> b-a);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(method(a -> a-10,5));
		
		System.out.println(method(10,5,(a,b) -> a+b));
	}
	
	public static Object method(Players p,int a) {
		return p.playing(a);
	}
	
	public static Object method(int a,int b,NetPlayers np) {
		return np.netPlaying(a,b);
	}
}

interface Players {
	public abstract int playing(int a);
}

interface NetPlayers{
	public abstract int netPlaying(int a,int b);
}