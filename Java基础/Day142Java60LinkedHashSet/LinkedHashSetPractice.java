package Day142Java60LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
		Set<Car> carSet = new LinkedHashSet<>();
		carSet.add(new Car("奥迪",300000));
		carSet.add(new Car("奥拓",10000));
		carSet.add(new Car("法拉利",100000000));
		carSet.add(new Car("保时捷",70000000));
		carSet.add(new Car("奥迪",300000));
		
		for(Car c:carSet) {
			System.out.println(c);
		}
	}
}

class Car{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o != this) return true;
		if(o == null || !(o instanceof Car)) return false;
		Car c = (Car)o;
		return c.name.equals(name) && c.price == price;
	}
	
	@Override
	public int hashCode() {
		return (int)(name.hashCode() + price);
	}
	
	@Override
	public String toString() {
		return name + ":" + price;
	}
}