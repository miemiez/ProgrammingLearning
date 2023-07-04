public class TestBitOperation{
	public static void main(String[] args) {
		int a = 15;//24个0 0000 1111;
		int b = 13;//24个0 0000 1101;
		int z = -13;//24个1 1111 0011;
		int c = a & b;
		int d = a | b;
		int e = a ^ b;
		int f = ~a;
		int g = a << 2;//左移（向左移动，低位补0）
		int h = b >> 2;//右移2（向右移动2，高位补0）
		int j = z >> 2;//右移2（向右移动2，高位补1）
		int i = a >>> 2;//无符号右移（向右移动，高位补0）
		int k = z >>> 4;//无符号右移（向右移动，高位补0）
		System.out.println("a & b = " + c);//24个0 0000 1101;
		System.out.println("a | b = " + d);//24个0 0000 1111;
		System.out.println("a ^ b = " + e);//24个0 0000 0010;
		System.out.println("~a = " + f);//24个1 1111 0000;
		System.out.println("a << 2 = " + g);//24个0 0011 1100;左移一次*2，左移两次*4。。。
		System.out.println("b >> 2 = " + h);//24个0 0000 0011;
		System.out.println("z >> 2 = " + j);//24个1 1111 1100;
		System.out.println("a >>> 2 = " + i);//24个0 0000 0011;
		System.out.println("z >>> 4 = " + k);//0000 20个1 1111 1100;
	}
}