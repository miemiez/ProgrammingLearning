package Day05Debug;

public class TestSystemExit {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[0]);
			System.exit(0);//终止当前正在运行的JVM，所以finally代码执行不到了
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:" + e.getMessage());
		}finally {
			System.out.println("无论是否异常都会执行");
		}
		
		System.out.println("看看在System.exit(0);之后这个还能不能执行得到");//执行不到
	}
}
