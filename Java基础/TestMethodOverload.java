public class TestMethodOverload{
	public static void main(String[] args) {
		System.out.println(compare(10.2,10.2));
	}
	
	public static String compare(int a,int b) {
		if(a == b) {
			String str1 = "两个整数相同";
		    return str1;
		}else {
			String str2 = "两个整数不相同";
			return str2;
		}
	}
	
	public static String compare(double a,double b) {
		if(a == b) {
			String str1 = "两个小数相同";
		    return str1;
		}else {
			String str2 = "两个小数不相同";
		    return str2;
		}
	}
	
	public static String compare(short a,short b) {
		if(a == b) {
			String str1 = "两个整数相同";
		    return str1;
		}else {
			String str2 = "两个整数不相同";
		    return str2;
		}
	}
	
	public static String compare(long a,long b) {
		if(a == b) {
			String str1 = "两个整数相同";
		    return str1;
		}else {
			String str2 = "两个整数不相同";
		    return str2;
		}
	}
}