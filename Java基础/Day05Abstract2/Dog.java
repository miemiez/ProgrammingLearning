package Day05Abstract2;

public class Dog extends Animal{
	
	public Dog() {
		
	}
	
	public Dog(String name,int age) {
		super(name,age);
	}

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "啃完骨头了");
	}
}