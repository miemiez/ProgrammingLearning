package Day111Java练习29;

public class 内部类 {
	/*
	 * 一.一个类的内部又完整的嵌套了另外一个类的结构，被嵌套的类称为内部类，嵌套其他类的类为外部类，是我们类的第五大成员；
	 * 二.类的五大成员：
	 *     属性，方法，构造器，代码块，内部类
	 *     
	 * 三.内部类的最大特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系
	 * 
	 * 四.内部类的分类：
	 *     定义在外部类局部位置上（比如方法内）；
	 *         （1）局部内部类（有类名）
	 *         （2）匿名内部类（没有类名，【重点！！！！】）
	 *     定义在外部类的成员位置上：
	 *         （1）成员内部类（没有static修饰）
	 *         （2）静态内部类（使用static修饰）
	 *     
	 * 
	 */
	public static void main(String[] args) {
		内部类 n = new 内部类();
		n.m(2,new S(){
			public int m1() {
				return super.m1()+2;
			}
		});
	}
	
	public void m(int b,S s) {
		System.out.println(b + s.m1());
	}
}

class S{
	private int a = 10;
	
	public int m1() {
		return a;
	}
}
