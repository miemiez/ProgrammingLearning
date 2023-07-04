package Day36Reflect2;

public class TestforName与静态代码块的执行 {
	public static void main(String[] args) {
		/*
		 * Class.forName();这个方法的执行会导致类加载，类加载时静态代码块执行（JDBC技术会用到）
		 * 如果只想让一个类的静态代码块执行的时候就可以这么写
		 */
		try {
			Class.forName("Day36Reflect2.MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class MyClass{
	//静态代码块在类加载的时候执行，并且只执行一次。
	static {
		System.out.println("MyClass类的静态代码块执行了！");
	}
}
