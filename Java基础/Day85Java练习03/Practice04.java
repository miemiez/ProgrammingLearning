package Day85Java练习03;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		/*
		 * switch语句里的条件只能是：byte,short,int,char,enum,String
		 */
		
		/*
		 * 练习一：判断成绩是否及格
		 */
		double score = 88.5;
		switch((int)(score/60)) {
			case 1:
				System.out.println(score + "这个分数及格");
				break;
			case 0:
				System.out.println(score + "这个分数不及格");
				break;
		}
		
		/*
		 * 练习二：通过月份判断季节【使用穿透】
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = s.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("这是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("这是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("这是秋季");
				break;
			case 12:
			case 13:
			case 14:
				System.out.println("这是冬季");
				break;
			default :
				System.out.println("你输入的月份不对（1-12）");
		};
	}
}
