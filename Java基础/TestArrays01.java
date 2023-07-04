public class TestArrays01{
	//数组作为函数的参数
	public static void printArrays(int[] array) {
		for(int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for(int i = 0,j = array.length-1;i < array.length;i++,j--) {
			result[i] = array[j];
		}
		return result;
	}
	
	public static void main(String[] args) {
		/*int[] ay = {1,2,3,4};
		  printArrays(ay);*/
		printArrays(new int[] {1,2,3,4});
		
		reverse(new int[] {5,6,7,8});
	}
}