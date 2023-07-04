package Day03Extends2;

public class Maintainer extends AdminStaff{
	
	public Maintainer(String id,String name,String work) {
		super(id,name,work);
	}
	
	@Override
	public void work() {
		System.out.println("维护专员正在维护部门网站");
	}
}