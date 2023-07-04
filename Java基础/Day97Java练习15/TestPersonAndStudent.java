package Day97Java练习15;

public class TestPersonAndStudent {
	public static void main(String[] args) {
		Person p = new Person("XYY",20);
		Student s = new Student("LYY",19,007,59.9);
		System.out.println(p.say());
		System.out.println(s.say());
	}
}
