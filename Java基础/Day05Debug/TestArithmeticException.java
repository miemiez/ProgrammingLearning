package Day05Debug;

public class TestArithmeticException {
	public static void main(String[] args) {
		/*
		 语法结构：
		 try{
		 	//可能会有异常的代码
		 }catch(异常对象){
		    //出现异常之后执行的代码
		 }
		 */
		int a = 0;
		int b = 10;
		try {
			System.out.println("现在是出现异常之前");
			int result = b / a;
			System.out.println("现在是出现异常之后");//因为上面的语句报错了，所以这里并不会被运行到；
		}catch(ArithmeticException e) {
			System.err.println("ArithmeticException:" + e.getMessage());
			e.printStackTrace();//打印出异常的详细信息
		}finally {
			System.out.println("无论是否有异常都执行");
			//通常写关闭数据库的代码，或者关闭相关的资源
		}
		System.out.println("捕捉异常后，还是会继续执行");
	}
}