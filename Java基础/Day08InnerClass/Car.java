package Day08InnerClass;

public class Car {
	private String carBrand;
	private int carAge;
	String carColor;
	
	public void show() {
		System.out.println(carBrand = "大奔");
		System.out.println(carAge);
		System.out.println(carColor);
		
		Engine e = new Engine();
		e.engineBrand = "飞翔";
		e.show();
	}
	
	class Engine{
		String engineBrand;
		int engineAge;
		
		public void show() {
			System.out.println(engineBrand);
			System.out.println(carBrand);
			System.out.println(engineAge = 1);
		}
	}
}
