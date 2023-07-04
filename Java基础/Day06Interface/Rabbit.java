package Day06Interface;

public class Rabbit extends Animals{
	public Rabbit() {
		
	}
	
	public Rabbit(String name,int age) {
		super(name,age);
	}

	@Override
	public void eat1() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "吃完胡萝卜了");
	}
}