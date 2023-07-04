import java.util.Scanner;

public class TestComprehensiveExercise{
	public static void main(String[] args) {
		TestComprehensiveExercise tce = new TestComprehensiveExercise();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入机票原价");
		int ticket = sc.nextInt();
		System.out.println("请输入月份");
		int  month = sc.nextInt();
		System.out.println("请输入当前购买的仓位（0代表头等舱，1代表经济舱）");
		int seat = sc.nextInt();
		
		if(month >= 5 && month <= 10) {
			tce.getPrice(ticket,seat,8.2,6.8);
		}else if((month < 5 && month > 0) || (month > 10 && month < 13)) {
			tce.getPrice(ticket,seat,7.2,6.2);
		}
	}
		
		
	public int getPrice(int ticket,int seat,double v1,double v2) {
		if(seat == 0) {
			ticket = (int)(ticket * v1 / 10);
			System.out.println(ticket);
		}else if(seat == 1) {
			ticket = (int)(ticket * v2 / 10);
			System.out.println(ticket);
		}else {
			System.out.println("您的输入有误！");
		}
		return ticket;
	}
}