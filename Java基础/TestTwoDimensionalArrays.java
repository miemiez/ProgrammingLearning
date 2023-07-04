
public class TestTwoDimensionalArrays {
	public static void main(String[] args) {
		int[][] dimenArr1;//申明一个名为dimenArr1的二维数组
		dimenArr1 = new int[][] {{1, 2, 3}, {7, 6, 5}};//给这个二维数组创建值；

		int[][] dimenArr2 = {{1,2},{2,3}};
		
		int[][] dimenArr3 = new int[2][3];//创建一个名为dimenArr3的二维数组，并将数组内容初始化为一个两行三列的空二维数组
		dimenArr3[0][0] = 1;
		dimenArr3[0][1] = 2;
		dimenArr3[0][2] = 3;
		dimenArr3[1][0] = 7;
		dimenArr3[1][1] = 6;
		dimenArr3[1][2] = 5;
		
		int[][] dimenArr4 = new int[3][];//创建一个名为dimenArr4的二维数组，并将数组内容初始化为一个两行不定列的空二维数组
		dimenArr4[0] = new int[1];//设定第一行只有1列；
		dimenArr4[1] = new int[3];
		dimenArr4[2] = new int[2];
		
		int a = dimenArr3[1][2];
		
		dimenArr2[0][1] = 10;//修改dimenArr2[0][1]的值；
		
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println(printDimenArr(dimenArr1));
		System.out.println(multiplicationTable(arr));
		System.out.println();
		System.out.println(a);
		System.out.println(dimenArr2[0][1]);
	}
	
	public static String printDimenArr(int[][] dimenArr) {
		String s = "";
		if (dimenArr != null) {
			s += "{";
			for(int i = 0;i < dimenArr.length;i++) {
				s += "{";
				for(int j = 0;j < dimenArr[i].length;j++) {
					s += dimenArr[i][j];
				}
				s += "}";
			}
			s += "}";
			
		}else {
			s = "数组错误";
		}
		return s;
	}
	
	public static String multiplicationTable(int[] arr) {
		int a = 1;
		String s = "";
		while(a <= arr.length) {
			System.out.println();
			for(int nums:arr) {
				System.out.print(nums * a + " ");
			}
			a++;
		}
		return s;
	}
}
