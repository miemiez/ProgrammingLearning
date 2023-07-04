package Day10Enum;

public enum Season {
	
	//使用enum来实现枚举类
	//1.使用关键字enum替代class
	//2.public static final Season SPRING = new Season("春天","温暖")
	//  SPRING("春天","温暖");解读 常量名(实参列表)
	//3.如果又多个常量(对象),使用","号间隔即可
	//4.如果使用enum来实现枚举，要求将定义常量对象，写在最前面
	//5.如果我们使用的是无参构造器，创建常量对象，则可以省略()；
	WHAT,SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
	
	private String name;
	private String desc;
	
	private Season() {
		
	}
	
	private Season(String name,String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void whatMethod() {
		System.out.println("what？");
	}
}
