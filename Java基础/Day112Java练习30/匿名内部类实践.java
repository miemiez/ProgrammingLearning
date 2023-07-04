package Day112Java练习30;

public class 匿名内部类实践 {
	public static void main(String[] args) {
		show(() -> System.out.println("cry方法重写成功"));
	}
	
	public static void show(AA a) {
		a.cry();
	}
}

interface AA{
	public void cry();
}
