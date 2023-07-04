package Day124Java练习42;

public class 字符串的特性2 {
	public static void main(String[] args) {
		String s1 = "XYY";//s1指向池中的“XYY”
		String s2 = "java";//s2指向池中的“java”
		String s5 = "XYYjava";//s5指向池中的“XYYjava”
		String s6 = (s1 + s2).intern();//s6指向池中的“XYYjava”
		System.out.println(s5 == s6);//T
		System.out.println(s5.equals(s6));//T
	}
}
