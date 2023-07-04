package Day93Java练习11;

public class Practice02方法重载 {
	public static void main(String[] args) {
		Practice02方法重载 p = new Practice02方法重载();
		int i1 = p.m(10);
		int i2 = p.m(10,2);
		String str = p.m("abc");
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("str = " + str);
	}
	
	public int m(int i) {
		return i * i;
	}
	
	public int m(int i,int n) {
		int result = i;
		for(int c = 0;c < n;c++) {
		    result *= i;
		}
		return result;
	}
	
	public String m(String str) {
		return str.concat(str);
	}
}
