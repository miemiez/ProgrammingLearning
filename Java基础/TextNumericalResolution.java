public class TextNumericalResolution{
	public static void main(String[] args) {
		int int01 = 3497;
		int ge = int01 % 10;
		int shi = int01 /10 % 10;
		int bai = int01 / 10 % 10;
		int qian = int01 / 10 % 10;
		System.out.println(ge);
		System.out.println(shi);
		System.out.println(bai);
		System.out.println(qian);
	}
}