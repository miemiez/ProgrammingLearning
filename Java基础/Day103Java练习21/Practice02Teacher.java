package Day103Java练习21;

public class Practice02Teacher extends Practice02Person {
	private int work_age;
	
	public Practice02Teacher(String name, String sex, int age, int work_age) {
		super(name,sex,age);
		this.work_age = work_age;
	}

	public int getWork_age() {
		return work_age;
	}

	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}
	
	public void teach() {
		System.out.println("我承诺，我会认真教学");
	}
	
	public void play() {
		System.out.println(getName() + "爱玩象棋");
	}

	@Override
	public String toString() {
		return "Practice02Teacher [" + super.toString() + ", work_age=" + work_age + "]";
	}
}
