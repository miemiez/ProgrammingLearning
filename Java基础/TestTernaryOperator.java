public class TestTernaryOperator{
	public static void main(String[] args) {
		int n01 = 1;
		int n02 = 2;
		int n03 = 3;
		
		int max01 = n01 > n02 ? n01 : n02;
		int max02 = max01 > n03 ? max01 : n03;
		System.out.println(max02);
	}
}