package Day03Extends1;

public class Manager extends Employee{
	
	//成员变量；
	private double bouns;
	
	//构造方法；
	public Manager() {
		
	}
	
	public Manager(String id,String name,double salary,double bouns) {
		super(id,name,salary);
		this.bouns = bouns;
	}
	
	//Set/Get Methods;
	public void setBouns(double bouns) {
		this.bouns = bouns;
	}
	
	public double getBouns() {
		return bouns;
	}
	
	//成员方法；
	//重写Word方法;
	@Override
	public void work() {
		System.out.println("管理其他人");
	}
}