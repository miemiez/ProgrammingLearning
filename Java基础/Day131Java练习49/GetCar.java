package Day131Java练习49;

public class GetCar {
	public static void main(String[] args) {
		Car car = BeanUtil.getBean(Car.class);
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
	}
}
