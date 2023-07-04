package Day04Polymorphism;

public class Test{
	public static void main(String[] args) {
		Person p = new Person(22,"mmz");
		Animal a = new Dog(2,"黑色");
		Animal b = new Cat(3,"橘色");
		
		p.keepPet(a, "骨头");
		System.out.print("\n");
		p.keepPet(b, "鱼罐头");
		
	}
}