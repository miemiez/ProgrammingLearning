package Day96Java练习14;

public class Practice02 extends C {
	public static void main(String[] args) {
		new Practice02();
		/*
		 * 结果为：
		 *     我是B类
		 *     LYY我是C类的有参构造器
		 *     XYY我是P类的有参构造器
		 *     我是P类的无参构造器
		 */
	}
	
	public Practice02() {
		this("XYY");
		System.out.println("我是P类的无参构造器");
	}
	
	public Practice02(String name) {
		super("LYY");
		System.out.println(name + "我是P类的有参构造器");
	}
}

class C extends B{
	public C() {
		System.out.println("我是C类的无参构造器");
	}
	
	public C(String name) {
		System.out.println(name + "我是C类的有参构造器");
	}
}

class B{
	public B() {
		System.out.println("我是B类");
	}
}
