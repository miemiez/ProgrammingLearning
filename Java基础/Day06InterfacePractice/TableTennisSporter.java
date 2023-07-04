package Day06InterfacePractice;

public class TableTennisSporter extends Sporter implements SpeakEnglish{
	public TableTennisSporter() {
		
	}
	
	public TableTennisSporter(String name,int age) {
		super(name,age);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "学习打乒乓球");
	}

	@Override
	public void speakEnglish() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员" + getName() + "在说英语");
	}
}
