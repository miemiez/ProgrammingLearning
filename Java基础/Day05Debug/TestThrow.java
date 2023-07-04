package Day05Debug;

public class TestThrow {
	public static void main(String[] args) {
		try {
			printAge(-23);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		printAge1(23);
	}
	
	public static void printAge(int age) throws Exception //如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。
	{
		if(age < 0 || age > 150) {
			throw new Exception("年龄不在正确的范围");//通过throw关键字来申明一个异常对象
		}else {
			System.out.println("这个人的年龄为："  + age);
		}
	}
	
	public static void printAge1(int age) //如果不是检查性异常则无需用throws来在方法末尾进行申明
	{
		if(age < 0 || age > 150) {
			throw new RuntimeException("年龄不在正确的范围");//通过throw关键字来申明一个异常对象
		}else {
			System.out.println("这个人的年龄为："  + age);
		}
	}
}
