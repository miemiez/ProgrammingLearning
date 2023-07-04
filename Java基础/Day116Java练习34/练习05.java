package Day116Java练习34;

public class 练习05 {
	public static void main(String[] args) {
		A a = new A();
		a.show();
	}
}

class A{
	private String name = "我是A类的name";
	
	public void show() {
		class B{
			private String name = "我是B类的name";
			
			public void show() {
				System.out.println(name);
				System.out.println(A.this.name);
			}
		}
		B b = new B();
		b.show();
	}
}
