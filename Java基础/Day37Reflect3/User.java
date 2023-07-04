package Day37Reflect3;

public class User implements Cloneable{
	private String s;
	
	public User() {
		System.out.println("无参构造器被调用!");
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	@Override
	public User clone() throws CloneNotSupportedException {
		return (User)super.clone();
	}
}
