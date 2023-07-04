package Day93Java练习11;

public class Practice03方法重载 {
	public static void main(String[] args) {
		Practice03方法重载 p = new Practice03方法重载();
		int i = p.max(1,2);
		double b1 = p.max(1.1,2.2);
		double b2 = p.max(1.1,2.2,3.3);
		System.out.println("i = " + i);
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
	}
	
	public int max(int i,int n) {
		return (i > n ? i : n);
	}
	
	public double max(double b,double n) {
		return (b > n ? b : n);
	}
	
	public double max(double b,double n,double m) {
		double x = (b > n ? b : n);
		return (x > m ? x : m);
	}
}
