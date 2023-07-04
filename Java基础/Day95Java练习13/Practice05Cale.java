package Day95Java练习13;

public class Practice05Cale {
	public static void main(String[] args) {
		Practice05Cale p = new Practice05Cale(2.0,0);
		double pl = p.plus(p.var1,p.var2);
		double mi = p.minus(p.var1,p.var2);
		double mu = p.multiply(p.var1,p.var2);
		Double di = p.divide(p.var1,p.var2);
		System.out.println(p.var1 + "+" + p.var2 + "=" + pl);
		System.out.println(p.var1 + "-" + p.var2 + "=" + mi);
		System.out.println(p.var1 + "*" + p.var2 + "=" + mu);
		System.out.println(p.var1 + "/" + p.var2 + "=" + di);
	}
	
	double var1;
	double var2;
	
	public Practice05Cale(double var1,double var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public double plus(double var1,double var2) {
		return var1 + var2;
	}
	
	public double minus(double var1,double var2) {
		return var1 - var2;
	}
	
	public double multiply(double var1,double var2) {
		return var1 * var2;
	}
	
	public Double divide(double var1,double var2) {
		if(var2 == 0) {
			System.out.println("不能除以0");
			return null;
		}
		return var1 / var2;
	}
}
