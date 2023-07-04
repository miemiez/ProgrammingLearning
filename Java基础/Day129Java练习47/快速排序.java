package Day129Java练习47;

public class 快速排序 {
	public static void main(String[] args) {
		int[] arr = {4,2,6,4,7,9,1,5,50,4,3,5};
		快速排序.quicklySort(arr,0,arr.length-1);
		for(int i = 0;i < arr.length;i++) {
			if(i != arr.length - 1) {
				System.out.print(arr[i]);
				System.out.print(",");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
	
	public static void quicklySort(int[] arr,int start,int end) {
		if(start >= end) {
			return;
		}
		int i = start;
		int j = end;
		int baseNumber = arr[start];
		while(i < j) {
			while(i < j && arr[j] >= baseNumber) {
				j--;
			}
			if(i < j) {
				arr[i] = arr[j];
				//i++;可要可不要
			}
			while(i < j && arr[i] < baseNumber) {
				i++;
			}
			if(i < j) {
				arr[j] = arr[i];
				//j--;可要可不要
			}
		}
		arr[j] = baseNumber;//是i是j都可以
		quicklySort(arr,j+1,end);//是i是j都可以
		quicklySort(arr,start,j-1);//是i是j都可以
	}
}
