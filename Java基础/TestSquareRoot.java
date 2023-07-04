import java.util.Scanner;
public class TestSquareRoot{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("请输入一个整数：" );
		int number = sr.nextInt();
		for(int i = 0;i<= number;i++) {
			if(i * i == number) {
				System.out.println(number + "的平方根为：" + i);
				break;
			}else if(i * i > number) {
				System.out.println(number + "平方根的整数部分为：" + (i-1));
				break;
			}
		}
	}
}