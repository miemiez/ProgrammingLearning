package Spring001网络如何运作;

import java.util.Comparator;

public class LambdaSort {
	public static void main(String[] args) {
		int[] arr = {12,34,5,6,2,7,10,8,4,9,23,56,84,32};
		bubble(arr,(a,b) -> a - b);//从小到大
		bubble(arr,(a,b) -> b - a);
		bubble(arr,(Integer a, Integer b) -> {return a - b;});
		for(int i = 0;i < arr.length;i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ",");
			}
		}
	}
	
	public static void bubble(int[] arr,Comparator<Integer> c) {
		int temp = 0;
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - j;j++) {
				if(c.compare(arr[j],arr[j+1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}


