package Day86Java练习04;

public class Practice05 {
	public static void main(String[] args) {
		/*
		 * 有一个隐藏的陷阱，要把公式的分子1写成1.0才能得到精确的小数
		 */
		double sum = 0;
		for(int i = 1;i <= 100;i++) {
			if(i % 2 == 0) {
				sum -= 1.0/i;
			}else {
				sum += 1.0/i;
			}
		}
		System.out.println(sum);
	}
}
