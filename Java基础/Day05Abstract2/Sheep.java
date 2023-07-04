package Day05Abstract2;

public class Sheep extends Animal{
	public Sheep() {
		
	}
	
	public Sheep(String name,int age) {
		super(name,age);
	}

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "吃完草了");
	}
}