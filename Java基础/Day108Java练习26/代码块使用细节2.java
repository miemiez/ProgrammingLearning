package Day108Java练习26;

public class 代码块使用细节2 {
	/*
	 *  4.创建一个对象时，在一个类调用顺序是：
	 *   （1）调用静态代码块和静态属性初始化
	 *         （注意：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义顺序调用）
	 *   （2）调用普通代码块和普通属性的初始化
	 *         （注意：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义顺序调用）
	 *   （3）调用构造方法
	 */
	
	public static void main(String[] args) {
		//AA aa1 = new AA();//（1）getN1被调用（2）AA静态代码块  【静态代码块在n1下面】
		//AA aa2 = new AA();//（1）AA静态代码块（2）getN1被调用 【静态代码块在n1上面】
		AA aa3 = new AA(2);//（1）getN1被调用（2）AA静态代码块（3）getN2被调用（4）AA普通代码块" + "\rn2的值为200
		System.out.println("n2的值为" + aa3.getn2());//（5）n2的值为2【最后执行构造器】
	}
}

class AA{
	private int n2 = getN2();
	
	{//普通代码块
		System.out.println("AA普通代码块" + "\rn2的值为" + n2);
	}
	
	private static int n1 = getN1();
	
	static {
		System.out.println("AA静态代码块");
	}
	
	public static int getN1() {
		System.out.println("getN1被调用");
		return 100;
	}
	
	public int getN2() {
		System.out.println("getN2被调用");
		return 200;
	}
	
	public int getn2() {
		return n2;
	}
	
	public AA() {
	}
	
	public AA(int n2) {
		this.n2 = n2;
	}
}