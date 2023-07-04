package Day95Java练习13;

public class Practice04Circle {
	public static void main(String[] args) {
		Practice04Circle p = new Practice04Circle(5.0);
		double peri = p.perimeter(p.radius);
		double area = p.area(p.radius);
		System.out.println("圆的周长 = " + peri);
		System.out.println("圆的面积 = " + area);
	}
	
	double radius;
	
	public Practice04Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter(double radius) {
		return 2 * Math.PI * radius;
	}
	
	public double area(double radius) {
		return Math.PI * radius * radius;
	}
}
