package Day05Abstract;

public class Test{
	public static void main(String[] args) {

		//Person p = new Person();抽象类是不能创建对象的；
		Student s = new Student("LHY",22);
		System.out.println(s.getName() + "今年" + s.getAge() + "岁。");
	}
}