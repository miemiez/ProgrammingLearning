package Day05Debug;

public class TestMultipleCatch {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[2]);
			System.exit(0);//终止当前正在运行的JVM，所以finally代码执行不到了
			System.out.println(nums[6]);
		}catch(ArithmeticException e1) {
			System.out.println("ArithmeticException:" + e1.getMessage());
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("ArrayIndexOutOfBoundsException:" + e2.getMessage());
		}finally {
			System.out.println("无论是否异常都会执行");
		}
		
		System.out.println("看看在System.exit(0);之后这个还能不能执行得到");//执行不到
	}
}