package Day103Java练习21;

public class Person {
	public void run() {
		System.out.println("person run");
	}
	
	public void eat() {
		System.out.println("person eat");
	}
}

class Student extends Person{
	@Override
	public void run() {
		System.out.println("Student run");
	}
	
	public void study() {
		System.out.println("Student study");
	}
}
