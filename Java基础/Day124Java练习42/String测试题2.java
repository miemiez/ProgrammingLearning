package Day124Java练习42;

public class String测试题2 {
	public static void main(String[] args) {
		String s1 = "XYY";
		String s2 = "java";
		String s4 = "java";
		String s3 = new String("java");
		System.out.println(s2 == s3);//F
		System.out.println(s2 == s4);//T
		System.out.println(s2.equals(s3));//T
		System.out.println(s1 == s2);//F
	}
}
