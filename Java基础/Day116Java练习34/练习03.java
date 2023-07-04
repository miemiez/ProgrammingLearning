package Day116Java练习34;

public class 练习03 {
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.shout();//猫会喵喵叫
		Animal dog = new Dog();
		dog.shout();//狗会汪汪叫
	}
}

abstract class Animal{
	public abstract void shout();
}

class Cat extends Animal{

	@Override
	public void shout() {
		System.out.println("猫会喵喵叫");
	}
	
}

class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("狗会汪汪叫");
	}
	
}