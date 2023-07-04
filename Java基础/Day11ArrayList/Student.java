package Day11ArrayList;

import java.util.ArrayList;

public class Student {
	
	private String id;
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public StringBuffer iteStudent(ArrayList<Student> als) {//录入学生信息
		StringBuffer strB = new StringBuffer();
		if(als != null) {
			strB.append("{");
			for(int i = 0;i < als.size();i++) {
				Student s = als.get(i);
				strB.append("id：" + s.getId() + ",");
				strB.append("姓名：" + s.getName() + ",");
				if(i < als.size()-1) {
					strB.append("年龄：" + s.getAge() + ";");
				}else {
					strB.append("年龄：" + s.getAge());
				}
			}
			strB.append("}");
		}
		return strB;
	}
	
	public boolean searchStudent(ArrayList<Student> als,String i) {//查找是否有id为特定值的学生
		for(Student s : als) {
			if(s.getId().equals(i)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Student> ageDistinguish(ArrayList<Student> als,int i){//查找是否有小于指定岁数的学生
		ArrayList<Student> as = new ArrayList<>();  
		for(Student s : als) {
			if(s.getAge() < i) {
				as.add(s);
			}
		}
		return as;
	}
}
