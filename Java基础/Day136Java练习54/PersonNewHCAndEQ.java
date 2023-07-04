package Day136Java练习54;

public class PersonNewHCAndEQ {
	private String name;
	private int age;

	public PersonNewHCAndEQ(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(this.getClass() != o.getClass() || o == null) return false;
		PersonNewHCAndEQ p = (PersonNewHCAndEQ)o;
		return p.name.equals(name) && p.age == age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
