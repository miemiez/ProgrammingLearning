package Day90Java练习08;

public class Practice05 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		int i = t.fbnqs(5);
		System.out.println(i);
	}
}

class Test03{
	public int fbnqs(int n) {
		/*
		 * 求斐波那契数，给一个索引n，求出它的值
		 */
		if(n > 2) {
			return fbnqs(n - 1) + fbnqs(n -2);
		}else if(n == 1 || n == 2) {
			return 1;
		}else {
			System.out.println("要求n为正整数");
			return -1;
		}
	}
}
