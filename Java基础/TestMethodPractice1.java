public class TestMethodPractice1{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		copyOfRange(arr,6,7);
	}
	
	public static int[] copyOfRange(int[] arr,int from,int to) {
		int[] newArr = new int[to - from];
		System.out.print("{");
		for(int i = from; i < to;i++) {
			if(i >= from && i < to - 1) {
				newArr[i - from] = arr[i];
				System.out.print(arr[i] + ",");
			}else{
				newArr[i - from] = arr[i];
				System.out.print(arr[i] + "}");
			}
		}
		return newArr;
	}
}