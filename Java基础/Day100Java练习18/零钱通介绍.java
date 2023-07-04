package Day100Java练习18;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 零钱通介绍 {
	/*
	 * 使用Java开发零钱通项目，可以完成收益入账，消费，查看明细，退出系统等功能。
	 * 
	 * 项目界面：
	 * 【化繁为简】
	 * 1.先完成显示菜单，并可以选择菜单，给出对应提示
	 * 2.完成零钱通明细
	 */
	
	public static void main(String[] args) {
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		String key = "";
		
		//完成零钱通明细
		//思路：（1）可以把收益入账和消费保存到数组（2）可以使用对象（3）简单的话可以使用String拼接
		String details = "----------零钱通明细----------";
		
		//完成收益入账【完成功能驱动程序员增加新的变化和代码】
		//思路：定义新的变量
		double money = 0;//收入金额/消费金额
		double balance = 0;//总金额
		String note = "";//消费说明
		String choice = "";//确认退出
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = null;
		
		do {
			System.out.println("==========零钱通菜单==========");
			System.out.println("\t1 零钱通明细");
			System.out.println("\t2 收益入账");
			System.out.println("\t3 消费");
			System.out.println("\t4 退出");
			
			System.out.println("请选择(1-4):");
			key = scanner.next();
			
			switch(key) {
				case "1":
					System.out.println(details);
					break;
				case "2":
					System.out.println("收益入账金额：");
					money = scanner.nextDouble();
					if(money <= 0) {
						System.out.println("收益入账金需要大于0");
						break;
					}
					balance += money;
					//拼接收益入账信息
					date = new Date();
					details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
					break;
				case "3":
					System.out.println("消费金额：");
					money = scanner.nextDouble();
					if(money <= 0) {
						System.out.println("消费金额需要大于0");
						break;
					}else if(money > balance) {
						System.out.println("余额不足!");
						break;
					}
					balance -= money;
					System.out.println("消费说明：");
					note = scanner.next();
					//拼接消费信息
					date = new Date();
					details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
					break;
				case "4":
					while(true) {
						System.out.println("你确定要退出吗？Y/N");
						choice = scanner.next();
						if("Y".equals(choice)) {
							loop = false;
							break;
						}else if("N".equals(choice)){
							break;
						}else {
							System.out.println("输入有误，请重新输入!");
						}
					}
					break;
				default:
					System.out.println("选择有误，请重新选择");
			}
		}while(loop);
		System.out.println("========退出了零钱通项目========");
	}
}
