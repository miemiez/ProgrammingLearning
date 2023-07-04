package Day91Java练习09;

public class Practice01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		int all = t.factorial(1);
		System.out.println(all);
	}
}

class Test01{
	public int factorial(int i) {
		if(i == 10) {
			return 1;//第10天只剩下一只桃子
		}else if(i >= 1 && i <= 9) {
			return ((factorial(i + 1) + 1) * 2);
		}else {
			System.out.println("天数不在10以内");
			return -1;
		}
	}
}