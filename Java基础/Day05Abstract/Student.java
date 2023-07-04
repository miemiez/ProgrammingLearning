package Day05Abstract;

public class Student extends Person//抽象类的子类：1.要么重写抽象类中的所有抽象方法；
{
	public Student(){
		
	}
	
	public Student(String name,int age) {
		super(name,age);
	}
	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("学生的工作是学习");
		
	}
}