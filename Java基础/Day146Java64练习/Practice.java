package Day146Java64练习;

public class Practice {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5,5},{23,34,53,2}};
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + ",");
			}
		}
	}
}
