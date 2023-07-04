package Day32Serialization;

import java.io.Serializable;

public class Student implements Serializable{
	/*
	 * java虚拟机看到Serialiable接口之后，就会自动生成一个默认的序列化版本号；
	 * 自动生成的序列化版本号是在代码中看不见的，且之后改动编译好的源代码，都会生成一个新的序列化版本号
	 * ！！！（建议将序列化版本号手动写出来，不建议自动生成）！！！
	 */
	
	/*
	 * 假如过了很久之后，Student这个类源代码被改动了
	 * 源代码被改动之后，就需要重新编译，编译之后就会生成全新的字节码文件；
	 * 并且class文件再次运行的时候，java虚拟机生成的序列化版本号也会发生相应的改变
	 */
	
	/* 
	 * 最终结论：
	 * 可以自己设定一个固定的序列化版本号
	 */
	private static final long serialVersionUID = 88688888888L;//自己设定一个固定的序列化版本号
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
		String str = "Student{" + " 学生姓名为：" + name + 
				"\r\n学生年龄为：" + age + "}";
		return str;
	}
}
