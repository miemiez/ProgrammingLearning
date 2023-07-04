package Day95Java练习13;

public class Practice07 {
	public static void main(String[] args) {
		Practice07 p = new Practice07();
		Circle c = new Circle(1);
		p.printAreas(c,4);
	}
	
	public void printAreas(Circle c,int times) {
		System.out.println("Radius\tArea");
		for(int i = 1;i <= times;i++) {
			c.setRadius(i);
			System.out.println(c.radius + "\t" + c.findArea(c.radius));
		}
	}
}

class Circle{
	double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double findArea(double radius) {
		return Math.PI * radius * radius;
	}
}
