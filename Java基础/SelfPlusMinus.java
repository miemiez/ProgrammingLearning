public class SelfPlusMinus{
	public static void main(String[] args) {
		int a = 3;
		int b = a++;//a = 4;b = 3;
		int c = b++;//b = 4;c = 3;
		int d = 3;
		int e = --d;//d = 2;e = 2;
		int f = --e;//e = 1;f = 1;
		System.out.println("The increased value is " + b);	
		System.out.println("The increased value is " + c);
		System.out.println("The decreased value is " + e);
		System.out.println("The decreased value is " + f);
	}
}