package Day95Java练习13;

public class Practice03Book {
	public static void main(String[] args) {
		Practice03Book p = new Practice03Book("名侦探柯南",156.99);
		p.updatePrice(p.price);
		System.out.println(p.price);
	}
	
	String name;
	double price;
	
	public Practice03Book(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	public void updatePrice(double price) {
		if(price >= 100 && price < 150) {
			this.price = 100;
		}else if(price >= 150) {
			this.price = 150;
		}
	}
	
	public void info() {
		System.out.println("书名=" + this.name);
	}
}
