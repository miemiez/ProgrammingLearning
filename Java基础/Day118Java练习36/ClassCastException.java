package Day118Java练习36;

public class ClassCastException {
	public static void main(String[] args) {
		Object obj = new C();
		A a;
		a = (B)obj;
		System.out.println(a);
		
		Person p;
		p = (Person)obj;//ClassCastException
		System.out.println(p);
	}
}

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

class Person extends A{
	
}