package Day98Java练习16;

public class Practice03动态绑定机制 {
	public static void main(String[] args) {
		/*
		 * java的动态绑定机制：
		 *     （1）当调用对象方法的时候，【该方法会和该对象的运行类型（内存地址）】绑定
		 *     （2）当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用【A类型的对象a，调用a.i时，值为10】
		 */
		A a = new B();//【a的编译类型为A，运行类型为B】
		System.out.println(a.sum());//20+200【如果把B类的sum()方法给注销，则结果为20+10】
		System.out.println(a.sum1());//20+100
	}
}

class A{
	public int i = 10;
	
	public int sum() {
		return getI() + 10;
	}
	
	public int sum1() {
		return i + 10;
	}
	
	public int getI() {
		return i;
	}
}

class B extends A{
	public int i = 20;
	
//	public int sum() {
//		return i + 200;
//	}
	
	public int getI() {
		return i;
	}
	
	public int sum1() {
		return i + 100;
	}
}