package Day143Java61Map接口;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Map练习 {
	public static void main(String[] args) {
		Map<Integer,Employee> hashMap = new HashMap<>();
		Employee e1 = new Employee(01,"Tom",14000);
		Employee e2 = new Employee(02,"Jack",19000);
		Employee e3 = new Employee(03,"Jerry",12000);
		Employee e4 = new Employee(04,"Lucy",18500);
		Employee e5 = new Employee(05,"Eddy",16500);
		hashMap.put(e1.getId(),e1);
		hashMap.put(e2.getId(),e2);
		hashMap.put(e3.getId(),e3);
		hashMap.put(e4.getId(),e4);
		hashMap.put(e5.getId(),e5);
		hashMap.remove(e2.getId());
		System.out.println(hashMap.isEmpty());//false
		System.out.println(hashMap.size());//4
		System.out.println(hashMap.containsKey(2));//false
		
		Set<Map.Entry<Integer,Employee>> entry = hashMap.entrySet();
		for(Map.Entry<Integer, Employee> node:entry) {
			if(node.getValue().getSalary() > 18000) {
				System.out.println(node);
			}
		}
	}
}

class Employee{
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}