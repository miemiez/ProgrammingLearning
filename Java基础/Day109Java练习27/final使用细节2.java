package Day109Java练习27;

public class final使用细节2 {
	/*
	 * 6.final和static往往搭配使用，效率更高，底层编译器做了优化处理【只调用这两个修饰的属性的时候，不会导致类的加载】
	 * 
	 * 7.包装类（Integer,Double,Float,Boolean等都是final类），String也是final类
	 */
	public static void main(String[] args) {
		System.out.println(F.i);//16【只调用static final修饰的属性的时候，不会导致类的加载】
		F.m();//static final修饰的方法被调用的时候，还是会加载类的
	}
}

class F{
	public static final int i = 16;
	static {
		System.out.println("F这个类被加载。。。");
	}
	public static final void m() {
		System.out.println("方法被调用");
	}
}
