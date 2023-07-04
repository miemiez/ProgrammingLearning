package Day96Java练习14;

public class Practice01 extends A{
	public static void main(String[] args) {
		new Practice01();
		/*
		 * 输出结果：a name
		 *          b name
		 *          b
		 *          
		 * new Practice01();
		 * 先进入this("abc");
		 * 在Practice01(String name)中，先调用super(name)，所以最先输出结果a name
		 */
	}
	
	public Practice01() {
		this("abc");
		System.out.println("b");
	}
	
	public Practice01(String name) {
		super("hahah");
		System.out.println("b name");
	}
}

class A{
	public A(){
		System.out.println("a");
	}
	
	public A(String name) {
		System.out.println("a name");
	}
}
