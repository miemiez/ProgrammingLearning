package Day08MemberInnerClass;

public class OuterClass {
	
	String name;
	private int age = 30;
	
	public class InnerClass{
		int age = 10;
	}
	
	private class InnerClass1{
		
	}
	
	public InnerClass1 getInstance() {
		return new InnerClass1();
	}
	
	public class InnerClass2{
		private int age = 20;
		
		public void show() {
			int age = 10;
			System.out.println(age);//10
			System.out.println(this.age);//20
			System.out.println(OuterClass.this.age);//30,这里的OuterClass.this的意思是获取了外部类对象的地址值
		}
		
	}
}
