package Day88Java练习06;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 杨辉三角：
		 *     1.第一行有1个元素，第n行有n个元素
		 *     2.每一行的第一个元素和最后一个元素都是1
		 *     3.从第三行开始，对于非第一个元素和最后一个元素的元素的值
		 *        arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
		 */
		int[][] arr = new int[10][];
		for(int i = 0;i < 10;i++) {
			arr[i] = new int[i+1];//给每一个一维数组开辟空间
			for(int j = 0;j < arr[i].length;j++) {
				if(j == 0 || j == arr[i].length -1) {
					arr[i][j] = 1; 
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		for(int i = 0;i < 10;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
