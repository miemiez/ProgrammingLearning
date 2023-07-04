package Day11ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Student> als = new ArrayList<>();
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要录入的学生人数");
		int i = sc.nextInt();
		for(int a = 0;a < i;a++) {
			Student s1 = new Student();
			System.out.println("请输入学生的id：");
			String id = sc.next();
			System.out.println("请输入学生的姓名：");
			String name = sc.next();
			System.out.println("请输入学生的年龄：");
			int age = sc.nextInt();
			
			s1.setId(id);
			s1.setName(name);
			s1.setAge(age);
			als.add(s1);
		}
		
		System.out.println(s.iteStudent(als));
		System.out.println(s.searchStudent(als,"18200121228"));
		ArrayList<Student> as = s.ageDistinguish(als, 25);
		
		for(Student st : as) {
			System.out.println(st.getId() + "," + st.getAge() + "," + st.getName());
		}
		
		sc.close();
	}
}
