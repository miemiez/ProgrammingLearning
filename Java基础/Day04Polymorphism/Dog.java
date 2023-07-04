package Day04Polymorphism;

public class Dog extends Animal{
	public Dog() {
		
	}
	
	public Dog(int age,String color) {
		super(age,color);
	}
	
	
	@Override
	public void eat(String s) {
		System.out.println(getAge() + "岁的" + getColor() + "颜色的小狗正在吃" + s);
	}
	
	public void lookHome() {
		System.out.println("狗在看家");
	}
}