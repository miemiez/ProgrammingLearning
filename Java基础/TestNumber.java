public class TestNumber{
	public static void main(String[] args) {
		double[] numbers = {1.4,1.5,1.6,-1.4,-1.5,2.0};
		for(double nub : numbers) {
			print(nub);
		}
	}
	public static void print(double nub) {
		System.out.println("Math.floor(" + nub + ")" + Math.floor(nub));
		System.out.println("Math.round(" + nub + ")" + Math.round(nub));
		System.out.println("Math.ceil(" + nub + ")" + Math.ceil(nub));
		System.out.println("Math.abs(" + nub + ")" + Math.abs(nub));
		System.out.println("Math.pow(" + nub + ")" + Math.pow(nub, nub));
	}
}