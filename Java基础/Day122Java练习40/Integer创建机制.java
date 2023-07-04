package Day122Java练习40;

public class Integer创建机制 {
	public static void main(String[] args) {
		Integer创建机制 i = new Integer创建机制();
		i.method1();
	}
	
	public void method1() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false，判断的是不是同一个对象
		
		Integer m = 1;//底层Integer.valueOf(1);【阅读源码】
		Integer n = 1;//底层Integer.valueOf(1);
		System.out.println(m == n);//true
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false
	}
}
