package Day133Java练习51;

import java.util.Arrays;
import java.util.Comparator;

public class 定制排序 {
	public static void main(String[] args) {
		int[] iArr = {1,-1,8,0,20};
		bubble01(iArr);
		System.out.print("{");
		for(int i = 0;i < iArr.length;i++) {
			if(i != iArr.length - 1) {
				System.out.print(iArr[i] + ",");
			}else {
				System.out.print(iArr[i]);
			}
		}
		System.out.println("}");
		System.out.println(Arrays.toString(iArr));
		
		bubble02(iArr,(Integer a,Integer b) -> a - b);//从小到大
		System.out.println(Arrays.toString(iArr));
		bubble02(iArr,(Integer a,Integer b) -> b - a);//从大到小
		System.out.println(Arrays.toString(iArr));
	}
	
	public static void bubble01(int[] arr) {//从小到大排序
		int temp = 0;
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubble02(int[] arr,Comparator<Integer> c) {//从大到小排序或者从小到大排序
		int temp = 0;
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(c.compare(arr[j],arr[j+1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
