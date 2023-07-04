package Day90Java练习08;

public class Practice01 {
	public static void main(String[] args) {
		Practice01 p = new Practice01();
		System.out.println(p.oddOrEven(2));
		p.printGraph(4, 3, '王');
	}
	
	public boolean oddOrEven(int number) {
		/*
		 * 方法练习题：判断奇数偶数，奇数为true，偶数为false
		 */
		return number % 2 != 0;
	}
	
	public void printGraph(int row,int column,char ch) {
		/*
		 * 根据行，列，字符打印对应行数和列数的字符
		 */
		for(int i = 0;i < column;i++) {
			for(int j = 0;j < row;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
