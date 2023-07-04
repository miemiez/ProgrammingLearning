import java.util.Random;
public class TestDisruptOrder{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		Random r = new Random();
		for(int i = 0;i < arr1.length;i++) {
			int diso = r.nextInt(5);
			int temp = arr1[i];
			arr1[i] = arr1[diso];
			arr1[diso] = temp;
		}
		for(int i = 0; i < arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}