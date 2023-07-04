package Day116Java练习34;

public class 练习06 {
	public static void main(String[] args) {
		Person tangS = new Person("唐僧",new Horse());
		tangS.passRiver();//过河
		tangS.passRoad();//走路
		tangS.passRoad();
		tangS.passRoad();
		tangS.passRiver();
	}
}

interface Vehicles{
	void work();
}

class Horse implements Vehicles{
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("一般情况下，使用马儿前进。。。");
	}
	
}

class Boat implements Vehicles{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("在海上，使用小船前行。。。");
	}
	
}

class Factory{
	private static Horse horse = new Horse();//饿汉式【马儿始终是同一匹】
	private Factory() {
		
	}
	
	public static Horse getHorse() {
		return horse;
	}
	
	public static Boat getBoat() {
		return new Boat();
	}
}

class Person{
	private String name;
	private Vehicles v;
	
	public Person(String name,Vehicles v) {
		this.name = name;
		this.v = v;
	}
	
	public void passRiver() {
		if(!(v instanceof Boat)) {
			v = Factory.getBoat();
		}
		v.work();
	}
	
	public void passRoad() {
		if(!(v instanceof Horse)) {
			v = Factory.getHorse();
		}
		v.work();
	}
}