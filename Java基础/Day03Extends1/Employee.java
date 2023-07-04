package Day03Extends1;

public class Employee{
	//1.类名要见名知意；
	//2.所有的成员变量都需要私有；
	//3.构造方法（空参&带全部参数的构造）；
	//4.get/set方法；
	
	private String id;
	private String name;
	private double salary;
	
	//Constructor;
	public Employee(){
		
	}
	
	public Employee(String id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//Get/Set Methods;
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	//成员方法；
	//Work;
	public void work() {
		System.out.println("员工在工作");
	}
	
	//Eat;
	public void eat() {
		System.out.println("员工在吃饭");
	}
}