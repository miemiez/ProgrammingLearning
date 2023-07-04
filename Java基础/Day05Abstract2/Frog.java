package Day05Abstract2;

public class Frog extends Animal{

	public Frog() {
		
	}
	
	public Frog(String name,int age) {
		super(name,age);
	}
	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "吃完虫子了");
	}
}