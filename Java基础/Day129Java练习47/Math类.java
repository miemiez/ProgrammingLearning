package Day129Java练习47;

public class Math类 {
	public static void main(String[] args) {
		//abs绝对值
		int abs = Math.abs(-9);
		System.out.println(abs);//9
		
		//pow求幂
		double pow = Math.pow(-3.5,4);
		System.out.println(pow);//150.0625
		
		//ceil向上取整，返回>=该参数的最小整数
		double ceil = Math.ceil(-3.0001);
		System.out.println(ceil);//-3.0
		
		//floor向下取整，返回<=该参数的最大整数
		double floor = Math.floor(-4.999);
		System.out.println(floor);//-5.0
		
		//round四舍五入 Math.floor(该参数+0.5)
		long round = Math.round(-5.001);
		System.out.println(round);//-5
		
		//sqrt求开方
		double sqrt = Math.sqrt(-9.0);
		System.out.println(sqrt);//NaN【Not a number】(负数无开方)
		
		//max，min返回最大值和最小值
		int min = Math.min(1, 9);
		int max = Math.max(45,90);
		System.out.println(min);//1
		System.out.println(max);//90
		
		//random返回随机数[0,1)
		double random = Math.random();
		System.out.println(random);
		
		//获取一个2-7之间的一个随机整数
		int i = (int)(Math.random() * (7 - 2 + 1) + 2);
		System.out.println(i);
	}
}
