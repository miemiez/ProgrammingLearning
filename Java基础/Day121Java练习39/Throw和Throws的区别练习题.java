package Day121Java练习39;

public class Throw和Throws的区别练习题 {
	public static void main(String[] args) {
		try {
			Throw和Throws的区别练习题.methodA();//进入方法A  用A方法的finally
		}catch(Exception e) {
			System.out.println(e.getMessage());//制造异常
		}
		Throw和Throws的区别练习题.methodB();//进入方法B  调用B方法的finally
	}
	
	static void methodA() {
		try {
			System.out.println("进入方法A");
			throw new RuntimeException("制造异常");
		}finally {
			System.out.println("用A方法的finally");
		}
	}
	
	static void methodB() {
		try {
			System.out.println("进入方法B");
			return;
		}finally{
			System.out.println("调用B方法的finally");
		}
	}
}
