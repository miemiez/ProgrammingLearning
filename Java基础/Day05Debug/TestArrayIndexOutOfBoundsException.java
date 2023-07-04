package Day05Debug;

public class TestArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:" + e.getMessage());
		}
	}
}
