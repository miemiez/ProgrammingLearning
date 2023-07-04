package Day88Java练习06;

public class Practice04 {
	public static void main(String[] args) {
		/*
		 * 随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值，求最大值和最大值的下标，并查找里面是否有8
		 */
		int[] arr = new int[10];
		int sum = 0;
		int max = 0;
		int maxIndex = 0;
		int eIndex = 0;
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) +1;
		}
		for(int i = 0;i < arr.length;i++) {
		    System.out.print(arr[i]+",");
		}
		System.out.println();
		for(int i = 9;i >= 0;i--) {
			System.out.print(arr[i] + ",");
		}
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println();
		int avg = sum / arr.length;
		System.out.println("平均值为" + avg);
		for(int i = 0;i < 10;i++) {
			if(max <= arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值为：" + max + "其下标是" + maxIndex);
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == 8) {
				eIndex = i;
			}
		}
		if(eIndex != -1) {
			System.out.println("数组中有8");
		}
	}
}
