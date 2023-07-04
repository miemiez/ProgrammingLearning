package Day104Java练习22;

public class Practice01 {
	public Practice01() {
		System.out.println("我是类Practice01");
	}
}

class B extends Practice01{
	public B() {
		//super();这个不写的话是隐藏的
		System.out.println("我是B类的无参构造器");
	}
	
	public B(String name) {
		//super();这个不写的话是隐藏的
		System.out.println(name + "我是B类的有参构造器");
	}
}

class C extends B{
	public C() {
		this("hello");
		System.out.println("我是C类的无参构造器");
	}

	public C(String name) {
		super("hahah");
		System.out.println("我是C类的有参构造器");
	}
}
