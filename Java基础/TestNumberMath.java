public class TestNumberMath{
	public static void main(String[] args) {
		System.out.println("sin90=" + Math.sin(Math.PI/2));
		System.out.println("tan180=" + Math.tan(Math.PI));
		System.out.println("cos60=" + Math.cos(Math.PI/3));
		System.out.println("The degrees of π/2 is " + Math.toDegrees(Math.PI/2));
		System.out.println(Math.PI);
		System.out.println("The radians of π/3 is " + Math.toRadians(Math.toDegrees(Math.PI/3)));
	}
}