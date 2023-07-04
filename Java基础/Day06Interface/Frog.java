package Day06Interface;

public class Frog extends Animals implements Swim{
	public Frog() {
		
	}
	
	public Frog(String name,int age) {
		super(name,age);
	}

	@Override
	public void eat1() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "吃完虫子了");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "正在游泳");
	}
}