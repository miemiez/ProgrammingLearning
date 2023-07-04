package Day03Extends2;

public class Employee{
	
	private String id;
	private String name;
	private String work; 
	
	public Employee() {
		
	}
	
	public Employee(String id,String name,String work) {
		this.id = id;
		this.name = name;
		this.work = work;
	}
	
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
	
	public void setWork(String work) {
		this.work = work;
	}
	
	public String getWork() {
		return work;
	}
	
	public void work() {
		System.out.println("员工正在工作");
	}
}