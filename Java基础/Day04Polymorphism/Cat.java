package Day04Polymorphism;

public class Cat extends Animal{
	public Cat(){
		
	}
	
	public Cat(int age,String color) {
		super(age,color);
	}
	
	
	@Override
	public void eat(String s) {
		System.out.println(getAge() + "岁的" + getColor() + "颜色的猫咪正在吃" + s);
	}
	
	public void catchMouse() {
		System.out.println("猫在抓老鼠");
	}
}