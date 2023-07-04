package Day03Extends1;

public class Cooker extends Employee{
	
	//构造方法；
	public Cooker() {
		
	}
	
	public Cooker(String id,String name,double salary) {
		super(id,name,salary);
	}
	
	//成员方法；
	//重写Work方法；
	@Override
	public void work() {
		System.out.println("炒菜");
	}
}