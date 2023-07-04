import java.util.Scanner;

public class TestJudgement{
	public static void main(String[] args) {
	    int x = 10;
		if( x == 5 ){
			System.out.print("x = " + 5);
		}else if( x == 8 ){
			System.out.print("x = " + 8);
		}else if( x == 10 ){
			System.out.print("x = " + 10);
		}else{
			System.out.print("x无值");
		}
		System.out.println("\n");
		
		
		/*李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手
		机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
		为了更省钱，李雷要不要以旧换新？请在控制台输出。*/
		double nPhone = 7988;
		double oPhone = 1500;
		if(nPhone * 0.8 >= nPhone - oPhone) {
			System.out.println("李雷不要以旧换新。");
		}else {
			System.out.println("李雷需要以旧换新。");
		}
		System.out.println("\n");
		
		
		/*让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
		Scanner userIn = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int i01 = userIn.nextInt();
		System.out.println("请输入第二个整数：");
		int i02 = userIn.nextInt();
		System.out.println("请输入第三个整数：");
		int i03 = userIn.nextInt();
		if(i01 < i02 && i01 < i03) {
			System.out.println("最小值为：" + i01);
		}else if(i01 > i03 && i02 > i03){
			System.out.println("最小值为：" + i03);
		}else {
			System.out.println("最小值为：" + i02);
		}
		System.out.println("\n");
		
		
		/*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。
		  存款年利率表如下：

​	      存期		年利率（%）

​	      一年		2.25

​	      两年		2.7

​	      三年		3.25

​	      五年		3.6

          请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。*/
		Scanner userInput = new Scanner(System.in);
		System.out.println("请输入存入金额：");
		double mon = userInput.nextInt(); 
		System.out.println("请输入存入年数：");
		int userI = userInput.nextInt();
		if(mon < 1000) {
			System.out.print("存入金额低于1000");
		}else {
			if(userI == 1) {
				mon = mon + mon * userI * 0.0225;
				System.out.println("存入1年后本息总和为：" + mon);
			}else if(userI == 2) {
				mon = mon + mon * userI * 0.027;
				System.out.println("存入2年后本息总和为：" + mon);
			}else if(userI == 3 || userI ==4) {
				mon = mon + mon * userI * 0.0325;
				System.out.println("存入" + userI + "年后本息总和为：" + mon);
			}else if(userI >= 5) {
				mon = mon + mon * userI * 0.036;
				System.out.println("存入" + userI + "年后本息总和为：" + mon);
			}else {
				System.out.println("输入的年数有误");
			}
		}
		System.out.println("\n");
		
		
		/*2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除
		  三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。如果大于5000
		  元，那么大于5000元的部分按梯度交税，具体梯度比例如下：

​			0 ~ 3000元的部分，交税3%			

​			3000 ~ 12000元的部分，交税10%

​			12000 ~ 25000的部分 ， 交税20%		

​			25000 ~ 35000的部分，交税25%

​			35000 ~ 55000的部分，交税30%		

​			55000 ~ 80000的部分，交税35%

​			超过80000的部分，交税45%

		比如：小明入职一家企业后，税前工资是15000，则他每月该交个税的部分是
		15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。

		请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？*/
		Scanner salary = new Scanner(System.in);
		System.out.println("请输入您的工资：");
		double s = salary.nextInt();
		double s1 = s - s * 0.1 -5000;
		double tax = 0;
		if(s1 < 0) {
			System.out.println("您不需要纳税，实际到手工资为：" + (s1 + 5000));
		}else if(s1 >=0 && s1 <= 3000) {
			tax = s1 * 3 / 100; 
			System.out.println("您需要纳税的数额为：" + tax + "；税后工资为：" + (s1 - tax + 5000) + "。");
		}else if(s1 > 3000 && s1 <=12000){
            tax = 3000*0.03 + (tax-3000) * 0.1;
            System.out.println("您需要纳税的数额为：" + tax + "；税后工资为：" + (s1 - tax + 5000) + "。");
        }else if(s1 > 12000 && s1 <=25000){
            tax = 3000*0.03 + 9000*0.1 +  (s1-12000)*0.2;
            System.out.println("您需要纳税的数额为：" + tax + "；税后工资为：" + (s1 - tax + 5000) + "。");
        }else if(s1 > 25000 && s1 <=35000){
            tax = 3000*0.03 + 9000*0.1 + 13000*0.2 + (s1-25000)*0.25;
            System.out.println("您需要纳税的数额为：" + tax + "；税后工资为：" + (s1 - tax + 5000) + "。");
        }else if(s1 > 35000 && s1 <=55000){
            tax = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + (s1-35000)*0.3;
            System.out.println("您需要纳税的数额为：" + tax + "；税后工资为：" + (s1 - tax + 5000) + "。");
        }else if(s1 > 55000 && s1 <=80000){
            tax = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + (s1-55000)*0.35;
            System.out.println("您需要纳税的数额为：" + tax + "；税后工资为：" + (s1 - tax + 5000) + "。");
        }else{
            tax = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + 25000*0.35 + (s1-80000)*0.45;
            System.out.println("您需要纳税的数额为：" + tax + "；税后工资为：" + (s1 - tax + 5000) + "。");
        }
		
		userIn.close();
		userInput.close();
		salary.close();
	}
}