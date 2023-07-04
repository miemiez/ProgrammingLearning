package Day109Java练习27;

public class 单例设计模式的使用 {
	/*
	 * 1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只能提供一个取得其对象实例的方法
	 * 2.单例设计模式有两种方式：（1）饿汉式（2）懒汉式
	 * 
	 * 单例模式应用实例步骤：
	 *     1）构造器私有化
	 *     2）类的内部创建对象
	 *     3）向外暴露一个静态的公共方法
	 *     4）代码实现
	 */
	private static 单例设计模式的使用 instance = new 单例设计模式的使用();
	
	private 单例设计模式的使用() {
		
	}
	
	public static 单例设计模式的使用 getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		单例设计模式的使用 d = 单例设计模式的使用.getInstance();
		单例设计模式的使用 d2 = 单例设计模式的使用.getInstance();
		System.out.println(d == d2);//true
	}
}