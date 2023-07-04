package Day86Java练习04;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 判断一个整数是否为水仙花数：一个三位数，其各个位上数字立方和等于其本身
		 * 例如：153 = 1*1*1 + 3*3*3 + 5*5*5
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int i = s.nextInt();
		int bw = i / 100;
		int sw = (i % 100) / 10;
		int gw = i % 10;
		if(bw*bw*bw + sw*sw*sw + gw*gw*gw == i) {
			System.out.println(i + "是水仙花数");
		}else{
			System.out.println(i + "不是水仙花数");
		};
		s.close();
	}
}
