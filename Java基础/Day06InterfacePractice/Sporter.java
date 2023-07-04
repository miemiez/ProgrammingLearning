package Day06InterfacePractice;

public abstract class Sporter extends SportPerson{
	public Sporter() {
		
	}
	
	public Sporter(String name,int age) {
		super(name,age);
	}
	
	public abstract void study();
}
