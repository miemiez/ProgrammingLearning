package Day132Java练习50;

public class Practice01{ 
	public static void main(String[] args) {
		Practice01 p = new P02();
		//p.m2();//报错
		p.m1();//a
		p.m3();//c
	}
	
	public void m1(){
		System.out.println("a");
	}
	
	public void m3() {
		System.out.println("c");
	}
}

class P02 extends Practice01{
	public void m2() {
		System.out.println("b");
	}
}
