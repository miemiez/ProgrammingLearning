package Day86Java练习04;

public class Practice01 {
	public static void main(String[] args) {
		double money = 100000;
		int i = 0;
		while(true) {
			if(money > 50000) {
				money *= 0.95;
				++i;
			}else if(money >= 1000){
				money -= 1000;
				++i;
			}else {
				break;
			}
		}
		System.out.println(money);
		System.out.println(i);
	}
}
