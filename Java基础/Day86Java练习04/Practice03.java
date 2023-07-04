package Day86Java练习04;

public class Practice03 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i < 100;i++) {
			if(i % 5 != 0) {
					System.out.print(i + "\t");
					++count;
					if(count % 5 == 0) {
						System.out.println();//每五个换行
					}
				}
		}
	}
}
