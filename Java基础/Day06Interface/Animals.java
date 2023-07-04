package Day06Interface;

public abstract class Animals{
	
	private String name;
	private int age;
	
	public Animals() {
		
	}
	
	public Animals(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public abstract void eat1();
}