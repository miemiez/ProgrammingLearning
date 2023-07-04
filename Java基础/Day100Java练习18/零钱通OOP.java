package Day100Java练习18;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 零钱通OOP {
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
		
	//先完成显示菜单，并可以选择
	public void mainMenu() {
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
					this.detail();
					break;
				case "2":
					this.income();
					break;
				case "3":
					this.pay();
					break;
				case "4":
					this.exit();
					break;
				default:
					System.out.println("选择有误，请重新选择");
			}
		}while(loop);
		System.out.println("========退出了零钱通项目========");
	}
	
	//完成零钱通明细
	public void detail() {
		System.out.println(details);
	}
	
	//完成收益入账
	public void income() {
		System.out.println("收益入账金额：");
		money = scanner.nextDouble();
		if(money <= 0) {
			System.out.println("收益入账金需要大于0");
			return;
		}
		balance += money;
		//拼接收益入账信息
		date = new Date();
		details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
	}
	
	//完成消费
	public void pay() {
		System.out.println("消费金额：");
		money = scanner.nextDouble();
		if(money <= 0) {
			System.out.println("消费金额需要大于0");
			return;
		}else if(money > balance) {
			System.out.println("余额不足!");
			return;
		}
		balance -= money;
		System.out.println("消费说明：");
		note = scanner.next();
		//拼接消费信息
		date = new Date();
		details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
	}
	
	public void exit() {
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
	}
}
