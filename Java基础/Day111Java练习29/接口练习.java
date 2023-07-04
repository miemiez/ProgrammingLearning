package Day111Java练习29;

public class 接口练习 extends B implements A{
	public void pX() {
		System.out.println(A.x);//A接口的x
		System.out.println(super.x);//B接口的x
	}
	
	public static void main(String[] args) {
		new 接口练习().pX();
	}
}

interface A {
	int x = 0;//静态常量
}

class B{
	int x = 1;//普通成员变量
}
