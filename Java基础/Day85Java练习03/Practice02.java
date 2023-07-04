package Day85Java练习03;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int a = s.nextInt();
		System.out.println("请输入第二个整数");
		int b = s.nextInt();
		int c = a + b;
		if(c % 3 == 0 && c % 5 == 0) {
			System.out.println(c + "这个数能被3以及5整除");
		}else {
			System.out.println(c + "这个数不能被3以及5整除");
		}
		s.close();
	}
}
