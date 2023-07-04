package Day117Java练习35;

public class 练习08 {
	public static void main(String[] args) {
		Car c = new Car();
		Car.Air a1 = c.getAir(10);
		a1.flow();
		Car.Air a2 = c.getAir(50);
		a2.flow();
		Car.Air a3 = c.getAir(-7);
		a3.flow();
	}
}

class Car{
	private double temperature;
	class Air{
		public Air(double temperature) {
			Car.this.temperature = temperature;
		}
		
		public void flow() {
			if(temperature > 40) {
				System.out.println("现在吹冷气");
			}else if(temperature < 0) {
				System.out.println("现在吹暖气");
			}else {
				System.out.println("现在关闭空调");
			}
		}
	}
	
	public Air getAir(double temperature) {
		return new Air(temperature);
	}
}