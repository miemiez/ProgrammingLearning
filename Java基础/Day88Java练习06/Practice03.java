package Day88Java练习06;

public class Practice03 {
	public static void main(String[] args) {
		/*
		 * int[] x,y[];以下选择允许通过编译的是【b,e】
		 * x是int类型一维数组，y是int类型的二维数组
		 * （a）x[0] = y;//错误 int[][] -> int
		 * （b）y[0] = x;//正确 int[] -> int[]
		 * （c）y[0][0] = x;//错误 int[] -> int
		 * （d）x[0][0] = y;//错误 x是一维数组
		 * （e）y[0][0] = x[0];//正确 int -> int
		 * （f）x = y;//错误 int[][] -> int[]
		 */
	}
}
