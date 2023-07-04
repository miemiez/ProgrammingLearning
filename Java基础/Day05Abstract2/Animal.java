package Day05Abstract2;

public abstract class Animal{
	
	private String name;
	private int age;
	
	public Animal() {
		
	}
	
	public Animal(String name,int age) {
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
	
	
	public abstract void eat();
	
	public void drink() {
		System.out.println(age + "岁的" + name + "正在喝水");
	}
	
	public void zh(Animal a) {
		if(a instanceof Dog d) {
			d.eat();
			drink();
		}else if(a instanceof Sheep s) {
			s.eat();
			drink();
		}else if(a instanceof Frog f) {
			f.eat();
			drink();
		}else {
			System.out.println("没有这种动物");
		}
	}
}