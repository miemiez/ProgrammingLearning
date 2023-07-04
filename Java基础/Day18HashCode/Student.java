package Day18HashCode;

public class Student {
	private String name;
	private Integer age;
	
	public Student(String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Student s = (Student)o;
		return age == s.age &&
				name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		return age.hashCode() + name.hashCode();
	}
}
