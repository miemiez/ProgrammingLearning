import java.util.Scanner;
public class TestPrimeNumber{
	public static void main(String[] args) {
		Scanner pn = new Scanner(System.in);
		System.out.println("请输入一个不为1的正整数：");
		int num = pn.nextInt();
		boolean ifpn = true;
		for(int i = 2;i < num;i++) {
			if(num % i == 0) {
				ifpn = false;
				break;
			}
		}
		if(ifpn == true) {
			System.out.println(num + "是一个质数");
		}else {
			System.out.println(num + "不是一个质数");
		}
	}
}