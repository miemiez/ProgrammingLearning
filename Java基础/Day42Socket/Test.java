package Day42Socket;

public class Test {
	public static void main(String[] args) {
		Integer i = new Integer(1);
		Integer i2 = new Integer(2);
		i2 = i;
		i = 3;
		System.out.println(i==i2);
		System.out.println(i);
		System.out.println(i2);
		
		String str = new String("1");
		String str2 = new String("2");
		str2 = str;
		str = "3";
		System.out.println(str == str2);
		System.out.println(str);
		System.out.println(str2);
		
		C c = new C();
		C c2 = new C();
		c.age = 1;
		c2.age = 2;
		c2 = c;
		c.age = 3;
		System.out.println(c2 == c);
		System.out.println(c.age);
		System.out.println(c2.age);
	}
}
