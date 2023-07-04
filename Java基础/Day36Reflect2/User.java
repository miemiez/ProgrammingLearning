package Day36Reflect2;

public class User {
	public User() {
		System.out.println("无参构造方法被调用");
	}
	
	public User(String s) {
		System.out.println("这是有参构造方法，c.newInstance()方法无法调用");
	}
}
