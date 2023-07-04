package Day05Debug;

public class TestExceptionReturn {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[0]);
			return;//finally代码依然执行
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:" + e.getMessage());
	
		}finally {
			System.out.println("无论是否异常都会执行");
		}
		
		System.out.println("看看在try里return之后这个还能不能执行得到");//执行不到
	}
}
