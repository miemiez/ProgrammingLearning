package Day03Extends2;

public class Buyer extends AdminStaff{
	
	public Buyer(String id,String name,String work) {
		super(id,name,work);
	}
	
	@Override
	public void work() {
		System.out.println("采购专员正在采购中");
	}
}