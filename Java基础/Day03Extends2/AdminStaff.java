package Day03Extends2;

public class AdminStaff extends Employee{
	
	public AdminStaff(String id,String name,String work) {
		super(id,name,work);
	}
	
	@Override
	public void work() {
		System.out.println("行政部员工正在工作");
	}
}