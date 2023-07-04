package Day89Java练习07;

public class Practice04 {
	public static void main(String[] args) {
		/*
		 * 冒泡排序：
		 *     要求从小到大
		 *     【有两层循环，第一层第一轮的排序是为了把最大的数拍到最后，之后依次将剩余数的最大值排到后面】
		 */
		int[] arr = {20,-1,89,2,890,7};
		int temp = 0;//用来进行数值交换的媒介
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr.length -1-i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
