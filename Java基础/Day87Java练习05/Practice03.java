package Day87Java练习05;

public class Practice03 {
	public static void main(String[] args) {
		int[] arr = {4,-1,9,10,23};
		int max = 0;
		int maxIndex = 0;
		for(int i = 0;i < arr.length;i++) {
			if(i == 0) {
				max = arr[i];
				maxIndex = i;
			}else if(arr[i] > arr[i-1]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		/*
		 * 也可以这样写
		 */
		for(int i = 0;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		
		System.out.println(max + "索引的位置在" + maxIndex);
	}
}
