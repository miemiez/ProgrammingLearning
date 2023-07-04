package Day04Polymorphism;

public class Animal{
	
	private int age;
	private String color;
	
	
	public Animal(){
		
	}
	
	public Animal(int age,String color) {
		this.age = age;
		this.color = color;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	public void eat(String s) {
		System.out.println("吃东西" + s);
	}
}