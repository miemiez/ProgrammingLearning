package Day137Java55;

public class Dog {
	private String name;
	private int age;
	
	public Dog(String name,int age) {
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
	
	@Override
	public String toString() {
		return "狗狗的名字叫" + name + "，它今年" + age + "岁了。";
	}
}
