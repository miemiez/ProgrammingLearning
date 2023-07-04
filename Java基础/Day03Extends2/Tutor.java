package Day03Extends2;

public class Tutor extends Teacher{
	
	public Tutor(String id,String name,String work) {
		super(id,name,work);
	}
	
	@Override
	public void work() {
		System.out.println("助教正在整理课堂材料");
	}
}