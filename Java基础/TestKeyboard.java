/*这是一个关于6的小游戏：
 键盘录入一个两位整数，如果两位数中的其中一个数字为6或者它们的和为6的倍数，则通关，否则请重新输入继续游戏。
*/
import java.util.Scanner;

public class TestKeyboard{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出一个两位整数");
		int i = sc.nextInt();
		while(i / 10 % 10 == 6 || i % 10 == 6 || (i / 10 % 10 + i % 10) % 6 == 0 == false) {
			System.out.println(false + "\t请继续输入:");
			i = sc.nextInt();
		}
		System.out.println(true + "\t恭喜通关！您最终输入的两位整数为： " + i);
	}
}