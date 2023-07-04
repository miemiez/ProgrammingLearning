package Day141Java练习59HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
	public static void main(String[] args) {
		Set<Employee> epSet = new HashSet<>();
		epSet.add(new Employee("Tom",23,new MyDate(2000,1,1)));
		epSet.add(new Employee("Jack",33,new MyDate(1990,1,1)));
		epSet.add(new Employee("Jerry",28,new MyDate(1995,1,1)));
		epSet.add(new Employee("Tom",23,new MyDate(2000,1,1)));
		epSet.add(new Employee("Tom",23,new MyDate(2000,2,2)));
		for(Employee e:epSet) {
			System.out.println(e);
		}
	}
}

class Employee{
	private String name;
	private int salary;
	private MyDate birthday;
	
	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(String name, int salary,MyDate birthday) {
		super();
		this.name = name;
		this.salary = salary;
		this.birthday = birthday;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null || !(o instanceof Employee)) return false;
		Employee e = (Employee)o;
		return e.salary == salary && e.name.equals(name) && e.birthday.equals(birthday);
	}
	
	@Override
	public int hashCode() {
		return salary + name.hashCode() + birthday.hashCode();
	}
	
	@Override
	public String toString() {
		return "姓名：" + name + "\t收入：" + salary + "\t生日：" + birthday;
	}
}

class MyDate{
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null || !(o instanceof MyDate)) return false;
		MyDate md = (MyDate)o;
		return md.year == year && md.month == month && md.day == day;
	}
	
	@Override
	public int hashCode() {
		return year + month + day;
	}
	
	@Override
	public String toString() {
		return year + "年" + month + "月" + day + "日";
	}
}