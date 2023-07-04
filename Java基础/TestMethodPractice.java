public class TestMethodPractice{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		traverse(arr);
		System.out.print("\n");
		System.out.println("数组中的最大值为：" + arrayMax(arr));
		System.out.println(isExist(arr,6));
	}
	
	public static void traverse(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			if(i == 0) {
				System.out.print("{" + arr[i] + ",");
			}else if(i == arr.length - 1) {
				System.out.print(arr[i] + "}");
			}else {
				System.out.print(arr[i] + ",");
			}
		}
	}
	
	public static int arrayMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static boolean isExist(int[] arr,int c) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == c) {
				return true;
			}
		}
		return false;
	}
}