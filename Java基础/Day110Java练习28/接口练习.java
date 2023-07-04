package Day110Java练习28;

public class 接口练习 implements A {
	public static void main(String[] args) {
		接口练习 b = new 接口练习();
		System.out.println(b.a);//23
		System.out.println(A.a);//23
		System.out.println(接口练习.a);//23
	}
}

interface A {
	int a = 23;//等同于 pubilc static final int a = 23;
}