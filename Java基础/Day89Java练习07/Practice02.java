package Day89Java练习07;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 已知有一个升序的数组，要求插入一个元素，该数组顺序依然是升序
		 */
		int[] arr = {10,12,45,90};
		int[] arr2 = new int[arr.length+1];
		int insertNum = 23;
		int indexInt = -1;
		for(int i = 0;i < arr.length;i++) {
			if(insertNum <= arr[i]) {
				indexInt = i;
				break;
			}
		}
		
		if(indexInt == -1) {
			indexInt = arr.length;
		}
		
		for(int i = 0,j = 0;i < arr2.length;i++) {
			if(i == indexInt) {
				arr2[i] = insertNum;
			}else {
				arr2[i] = arr[j];
				j++;
			}
		}
		
		for(int i = 0;i < arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
