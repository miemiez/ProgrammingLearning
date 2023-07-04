public class TestJumpControl{
	public static void main(String[] args) {
		for(int i = 1;i < 6;i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("i的值为：" + i);
		}
		System.out.println("\n");
		
		for(int i = 1;i < 6;i++) {
			if(i == 3) {
				break;//结束循环
			}
			System.out.println("i的值为：" + i);
		}
	}
}