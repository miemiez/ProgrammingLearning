package Day113Java练习31;

public class Enum成员方法 {
	public static void main(String[] args) {
		枚举类 autumn = 枚举类.AUTUMN;
		//输出枚举对象的名字
		System.out.println(autumn.name());
		//ordinal()输出的是该枚举对象的次序/编号，从0开始编号
		//AUTUMN枚举对象是第三个，因此输出2
		System.out.println(autumn.ordinal());
		//values方法，返回为【枚举类[]】
		//含有定义的所有枚举对象
		枚举类[] values = 枚举类.values();
		for(int i = 0;i < values.length;i++) {
			if(i != values.length -1) {
				System.out.print(values[i] + ",");
			}else {
				System.out.println(values[i]);
			}
		}
		//valueOf：将字符串转换成枚举对象，要求字符串必须是枚举类中已有的常量名，否则会报错
		//如果找到了"AUTUMN"，就返回，如果没有找到，就报错
		枚举类 autumn2 = 枚举类.valueOf("AUTUMN");
		System.out.println("autumn2 = " + autumn2);
		//compareTo：比较两个枚举常量，比较的就是位置号
		System.out.println(枚举类.AUTUMN.compareTo(枚举类.SPRING));//【AUTUMN所在的位置号：】3-【SPRING所在的位置号：】1 = 2
	}
}
