package Day32Serialization;

import java.io.Serializable;

public class User类同时用来说明transient关键字 implements Serializable{
	/*
	 * transient关键字表示为游离的，不参与序列化。
	 */
	private int number;
	private transient String name;//表示name不参与序列化操作！！
	
	public User类同时用来说明transient关键字() {
		
	}
	
	public User类同时用来说明transient关键字(int number,String name) {
		this.number = number;
		this.name = name;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "User{序号：" + number + ",姓名：" + name + "};";
	}
}
