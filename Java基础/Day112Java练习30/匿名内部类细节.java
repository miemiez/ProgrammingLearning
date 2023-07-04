package Day112Java练习30;

public class 匿名内部类细节 {
	/*
	 * 匿名内部类的语法比较奇特，因为匿名内部类既是一个类的定义，同时它本身也是一个对象，
	 * 因此从语法上看，它既有定义类的特征，也有创建对象的特征
	 */
}

class Outer05{
	private int n1 = 99;
	public void f1() {
		new Person(){
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了hi方法");
			}
		}.hi();
		//等同于
		Person p = new Person(){
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了hi方法");
			}
		};
		p.hi();
	}
}

class Person{
	public void hi() {
		System.out.println("Person hi()");
	}
}
