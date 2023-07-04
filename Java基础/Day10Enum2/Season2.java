package Day10Enum2;

public class Season2 {
	
	private String name;
	private String desc;
	
	//定义了固定的四个对象。
	public static final Season2 SPRING = new Season2("春天","温暖");
	public static final Season2 SUMMER = new Season2("夏天","炎热");
	public static final Season2 AUTUMN = new Season2("秋天","凉爽");
	public static final Season2 WINTER = new Season2("冬天","寒冷");
	
	//1.将构造器私有化，防止直接new
	//2.去掉set相关的方法，防止成员属性被修改
	//3.在该类中直接创建固定的对象
	//4.可以再加入一个final修饰符，去进行优化，使得这四个季节对象可以不用在类加载之后才加载出来。
	private Season2(String name,String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
}
