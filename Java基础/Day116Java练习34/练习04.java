package Day116Java练习34;

public class 练习04{
	public static void main(String[] args) {
		Cellphone c = new Cellphone();
		System.out.println(c.testWork((a,b) -> a + b,5,10));//15
		System.out.println(c.testWork((a,b) -> a * b,5,10));//50
	}
}

interface Calculate{
	int work(int a,int b);
}

class Cellphone{
	//利用该接口，可以灵活的实现work，完成不同的计算任务
	public int testWork(Calculate c,int a,int b) {
		return c.work(a,b);
	}
}