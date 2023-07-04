import java.util.Random;
import java.util.Scanner;

public class TestGuess{
	public static void main(String[] args) {
		Random r = new Random();
		int number1 = r.nextInt(100);//0~99;
		int number2 = r.nextInt(100) + 1;//1~100;
		
		Scanner sc = new Scanner(System.in);
		int i = 0;//记录猜了多少次；
		while(true) {
			System.out.println("请输入一个整数：");
			int ug = sc.nextInt();
			if(i == 6) {
				System.out.println("猜中了（您已经成功保底）");
				break;
			}
			if(ug > number2) {
				System.out.println("大于该数");
				i++;
			}else if(ug < number2) {
				System.out.println("小于该数");
				i++;
			}else {
				System.out.println("猜中了");
				i++;
				System.out.println("您一共猜了" + i + "次");
				break;
			}
		}
	}
}