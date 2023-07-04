package Day06InterfacePractice;

public class Test {
	public static void main(String[] args) {
		TableTennisSporter tts = new TableTennisSporter("LHY",22);
		System.out.println("姓名：" + tts.getName() + "," + "年龄：" + tts.getAge());
		tts.study();
		tts.speakEnglish();
	}
}
