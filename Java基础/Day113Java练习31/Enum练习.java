package Day113Java练习31;

public class Enum练习 {
	public static void main(String[] args) {
		Week[] days = Week.values();
		System.out.println("===所有星期的信息如下===");
		for(int i = 0;i < days.length;i++) {
			System.out.println(days[i]);
		}
	}
}

enum Week{
	MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
	
	private String name;
	
	private Week(String name){
		this.name = name;
	}
}
