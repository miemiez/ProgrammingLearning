package Day113Java练习31;

public enum 枚举类 {
	/*
	 * 1.只有几个固定的对象的类
	 * 2.使用关键字enum替代class
	 * 3.public static final 枚举类1 SPRING = new SPRING("春天","温暖");直接使用
	 *   SPRING("春天","温暖")解读，常量名(实参列表)
	 * 4.如果使用enum来实现枚举，要求将定义常量对象，并且要写在最前面
	 */
	SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
	
	private String name;
	private String desc;
	
	private 枚举类(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
}
