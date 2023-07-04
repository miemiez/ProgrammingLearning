package Day106Java练习24;

public class 类变量 {
	/*
	 * 静态变量被对象共享，因此不影响静态变量的使用
	 * 静态类变量，在类加载的时候就生成了
	 */
	private String name;
	//定义一个变量count，是一个类变量（静态变量）static静态
	//该变量最大的特点就是会被该类的所有对象共享
	public static int count = 0;
	
	public 类变量(String name) {
		this.name = name;
	}
	
	public void join() {
		System.out.println(name + "加入了游戏...");
	}
}
