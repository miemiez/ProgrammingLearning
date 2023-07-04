public class TestMethod{
	public static void main(String[] args) {
		double sum1 = getQuarterlyTurnover(10.2,10.6,11.1);
		double sum2 = getQuarterlyTurnover(11.4,18.8,9.1);
		double sum3 = getQuarterlyTurnover(12.3,10.4,11.3);
		double sum4 = getQuarterlyTurnover(10.3,15.3,18.1);
		double sum = sum1 + sum2 + sum3 + sum4;
		System.out.println(sum);
	}
	
	public static double getQuarterlyTurnover(double a,double b,double c) {
		double result = a + b + c;
		return result;
	}
}