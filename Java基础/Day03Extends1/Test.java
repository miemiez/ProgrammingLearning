package Day03Extends1;

public class Test{
	public static void main(String[] args) {
		//经理对象m；
		Manager m = new Manager("L1002","LHY",100,10);
		
		System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBouns());
		
		m.work();
		m.eat();
		
		//厨师对象c；
		Cooker c = new Cooker("L1022","WP",88);
		
		System.out.println(c.getId() + ","  + c.getName() + "," + c.getSalary());
		
		c.work();
		c.eat();
	}
}