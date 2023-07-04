package Day06InterfacePractice;

public class TableTennisCoach extends Coach implements SpeakEnglish{
	public TableTennisCoach() {
		
	}
	
	public TableTennisCoach(String name,int age) {
		super(name,age);
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(getAge() + "岁的" + getName() + "教打乒乓球");
	}

	@Override
	public void speakEnglish() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球教练" + getName() + "在说英语");
	}
}
