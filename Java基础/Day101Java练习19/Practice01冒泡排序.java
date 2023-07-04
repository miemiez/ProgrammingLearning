package Day101Java练习19;

public class Practice01冒泡排序 {
	//按年龄从小到大进行排序
	public static void main(String[] args) {
		Person[] arr = new Person[3];
		arr[0] = new Person("MYY",32,"老师");
		arr[1] = new Person("XYY",28,"律师");
		arr[2] = new Person("LYY",17,"学生");
		Practice01冒泡排序 p = new Practice01冒泡排序();
		p.sort(arr);
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i].getAge());
		}
	}
	
	public void sort(Person[] arr) {
		Person p = null;
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j].getAge() > arr[j + 1].getAge()) {
					p = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = p;
				}
			}
		}
	}
}

class Person{
	String name;
	int age;
	String job;
	
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
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
	
}
