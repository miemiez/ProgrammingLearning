package Day06InterfacePractice;

public class BasketballSporter extends Sporter{
	public BasketballSporter() {
		
	}
	
	public BasketballSporter(String name,int age) {
		super(name,age);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "学习打篮球");
	}
	
	
}
