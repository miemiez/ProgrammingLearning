package Day06Interface;

public class Dog extends Animals implements Swim{
	
	public Dog() {
		
	}
	
	public Dog(String name,int age) {
		super(name,age);
	}
	
	
	@Override
	public void eat1() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "啃完骨头了");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "正在游泳");
	}
}