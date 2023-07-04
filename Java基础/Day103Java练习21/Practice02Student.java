package Day103Java练习21;

public class Practice02Student extends Practice02Person {
	private int stu_id;
	
	public Practice02Student(String name, String sex, int age, int stu_id) {
		super(name,sex,age);
		this.stu_id = stu_id;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	
	public void study() {
		System.out.println("我承诺，我会好好学习");
	}
	
	public void play() {
		System.out.println(getName() + "爱玩足球");
	}

	@Override
	public String toString() {
		return "Practice02Student [" + super.toString() + ", stu_id=" + stu_id + "]";
	}
}
