package Day95Java练习13;

public class Practice01 {
	public static void main(String[] args) {
		Person p1 = new Person("XYY",22);
		Person p2 = new Person("LYY",20);
		Person p3 = new Person("XYY",22);
		boolean b1 = p1.compareTo(p2);
		boolean b2 = p1.compareTo(p3);
		System.out.println(b1);
		System.out.println(b2);
	}
}

class Person{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo(Person p) {
		if(p.name == this.name && p.age == this.age) {
			return true;
		}
		return false;
	}
}