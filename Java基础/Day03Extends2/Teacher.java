package Day03Extends2;

public class Teacher extends Employee{

	public Teacher(String id,String name,String work) {
		super(id,name,work);
	}
	
	@Override
	public void work() {
		System.out.println("老师正在授课");
	}
}