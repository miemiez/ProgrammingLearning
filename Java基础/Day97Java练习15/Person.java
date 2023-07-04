package Day97Java练习15;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String say() {
		return "大家好！我叫" + getName() + "，我今年" + getAge() + "岁了。";
	}
}

class Student extends Person{
	private int id;
	private double score;

	public Student(String name, int age, int id, double score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public String say() {
		return super.say() + "我的学号是" + id + "，这次考试的成绩是" + score + "分。";
	}
}
