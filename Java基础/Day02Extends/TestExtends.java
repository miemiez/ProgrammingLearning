package Day02Extends;

public class TestExtends{
	public static void main(String[] args) {
		//子类只能访问父类中非私有的成员；
		Teddy td = new Teddy();
		td.drink();
		td.eat();
		td.lookAfterHouse();
	}
}