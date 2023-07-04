package Day06InterfacePractice;

public abstract class Coach extends SportPerson{
	public Coach() {
		
	}
	
	public Coach(String name,int age) {
		super(name,age);
	}
	
	public abstract void teach();
}
