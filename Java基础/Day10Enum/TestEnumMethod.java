package Day10Enum;

public class TestEnumMethod {
	public static void main(String[] args) {
		
		Season au = Season.AUTUMN;
		
		//输出枚举对象的名字
		System.out.println(au);//AUTUMN
		System.out.println(au.toString());//AUTUMN
		
		//ordinal()输出的是该枚举对象的编号，从0开始
		System.out.println(au.ordinal());//3
		
		//values()返回一个数组Season[]，数组中含有定义的所有枚举对象
		System.out.println(au.values());//数组地址
		Season[] values = Season.values();
		for(Season s : values) {
			System.out.println(s);//遍历数组中的每一个索引
		}
		
		//valueOf()是将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报错
		/*执行流程：
		 1.根据输入的“AUTUMN”到Season的枚举对象去查找
		 2.如果找到了就返回，如果没有找到就报错
		 */
		Season s = Season.valueOf("AUTUMN");
		System.out.println("AUTUMN1=" + s);
		System.out.println(s == au);//由于enum在创建对象的时候默认为static，所以这两个值相等
		
		//compareTo()比较两个枚举常量的编号
		//返回的值为：Season.AUTUMN.ordinal() - Season.WINTER.ordinal()
		System.out.println(Season.AUTUMN.compareTo(Season.WINTER));//3-4=-1
	}
}
