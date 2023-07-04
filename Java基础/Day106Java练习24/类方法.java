package Day106Java练习24;

public class 类方法 {
	public static void main(String[] args) {
		Stu s1 = new Stu("Tom");
		s1.payFee(100);//等同于Stu.payFee(100);
		Stu s2 = new Stu("Jack");
		s2.payFee(200);//等同于Stu.payFee(100);
		Stu.showFee();
	}
}

class Stu{
	private String name;
	//定义一个静态变量，来累积学生的学费
	private static double fee = 0;
	
	public Stu(String name) {
		this.name = name;
	}
	
	//当方法使用了static修饰后，该方法就是静态方法
	//静态方法就可以访问静态属性/变量
	public static void payFee(double fee) {
		Stu.fee += fee;//累积到
	}
	
	public static void showFee() {
		System.out.println("总学费有：" + Stu.fee);
	}
}