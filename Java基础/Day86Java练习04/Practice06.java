package Day86Java练习04;

public class Practice06 {
	public static void main(String[] args) {
		/*
		 * 求 1+（1+2）+。。。+（1+2+。。。+100）的值
		 */
		
		/*
		 * 方法一：
		 */
		int sum = 0;
		int total = 0;
		for(int i = 1;i <= 101;i++) {
			total += sum;
			sum += i;
		}
		System.out.println(total);
		
		/*
		 * 方法二：
		 */
		int sum2 = 0;
		for(int i = 1;i <= 100;i++) {
			for(int j = 1;j <= i;j++) {
				sum2 += j;
			}
		}
		System.out.println(sum2);
	}
}
