package Day05Abstract;

public abstract class Person{
	/*抽象类和抽象方法的意义：
	  ***强制子类必须按照这种格式进行重写（团队协作完成项目的时候很重要！！！）*/
	
	//抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类；
	
	private String name;
	private int age;
	
	//抽象类可以有构造方法；
	//当创建子类对象时，给属性进行赋值(由于抽象类自己不能创建对象，所以无法给非静态属性赋值)；
	public Person() {
		
	}
	
	public Person(String name,int age) {
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
	
	public abstract void work();
}