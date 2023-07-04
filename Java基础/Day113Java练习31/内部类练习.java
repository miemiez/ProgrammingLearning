package Day113Java练习31;

public class 内部类练习 {
	public static void main(String[] args) {
		Test t = new Test();
		Test.Inner i = t.new Inner();//5
		System.out.println(i.a);//5
	}
}

class Test{
	public Test() {
		Inner s1 = new Inner();
		s1.a = 10;
		Inner s2 = new Inner();
		System.out.println(s2.a);
	}
	
	class Inner{//成员内部类
		public int a = 5;
	}
}


