package Day131Java练习49;

public class Car {
	@MyAnno(myValue = "BMW")
	private String brand;
	@MyAnno(myValue = "black")
	private String color;
	
	public Car() {
		
	}
	
	public Car(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
