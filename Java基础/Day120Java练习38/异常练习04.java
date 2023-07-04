package Day120Java练习38;

import java.util.Scanner;

public class 异常练习04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
			try{
				System.out.println("请输入一个整数：");
				num = Integer.parseInt(scan.next());//这个地方可能抛出异常
				System.out.println(num);
				break;
			}catch(NumberFormatException e) {
				System.out.println(e.getStackTrace());
				System.out.println("你输入的不是一个整数");
			}
		}
	}
}
