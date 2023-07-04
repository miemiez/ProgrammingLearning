package Day103Java练习21;

public class Doctor {
	String name;
	int age;
	String job;
	String gender;
	double sal;
	
	public Doctor(String name, int age, String job, String gender, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
		this.sal = sal;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || !(o instanceof Doctor)) {
			return false;
		}
		Doctor doctor = (Doctor)o;
		return this.name.equals(doctor.name) && this.age == doctor.age &&
				this.gender.equals(doctor.gender) && this.job.equals(doctor.job) &&
				this.sal == doctor.sal;
	}
}
