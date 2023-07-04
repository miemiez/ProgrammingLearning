package Day39Reflect5;

public class Test可变长度参数 {
	public static void main(String[] args) {
		/*
		 * 1.可变长参数要求的参数个数是0-N个；
		 * 2.可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有1个；
		 * 3.可变长度参数可以当作一个数组来看待
		 */
		System.out.println(m(1,3,5,7));
		System.out.println(s(3,"a","b","c"));
		System.out.println(s(5,new String[] {"我","是","L","H","Y"}));
		
	}
	
	public static int m(int... args) {
		int s = 0;
		for(int i = 0;i < args.length;i++) {
			s = s + args[i];
		}
		return s;
	}
	
	public static StringBuilder s(int i,String... args) {
		StringBuilder str = new StringBuilder();
		while(i > 0) {
			str.append(args[i-1]);
			i--;
		}
		return str.reverse();
	}
}
