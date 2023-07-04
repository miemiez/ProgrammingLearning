package Day124Java练习42;

public class String测试题3 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "XYY";//在常量池中创建XYY，并指向（常量池中的XYY）
		Person p2 = new Person();
		p2.name = "XYY";//指向常量池中的XYY
		
		System.out.println(p1.name.equals(p2.name));//T
		System.out.println(p1.name == p2.name);//T
		System.out.println(p1.name == "XYY");//T
		
		String s1 = new String("bcde");//指向堆中的char[] value（在常量池中创建“bcde”，value指向常量池中的“bcde”）
		String s2 = new String("bcde");//指向堆中的另一个char[] value（value指向常量池中的“bcde”）
		System.out.println(s1 == s2);//F（s1和s2是两个在堆中的不同对象）
	}
}

class Person{
	public String name;
}