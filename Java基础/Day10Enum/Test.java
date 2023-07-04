package Day10Enum;

public class Test {
	public static void main(String[] args) {
		System.out.print(Season.SPRING.getName());
		System.out.println(Season.SPRING.getDesc());
		
		System.out.print(Season.SUMMER.getName());
		System.out.println(Season.SUMMER.getDesc());
		
		System.out.print(Season.AUTUMN.getName());
		System.out.println(Season.AUTUMN.getDesc());
		
		System.out.print(Season.WINTER.getName());
		System.out.println(Season.WINTER.getDesc());
		
		Season.WHAT.whatMethod();
	}
}
