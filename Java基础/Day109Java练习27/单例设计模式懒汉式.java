package Day109Java练习27;

public class 单例设计模式懒汉式 {
	private String name;
	private static 单例设计模式懒汉式 instance;
	
	private 单例设计模式懒汉式(String name){
		this.name = name;
	}
	
	public static 单例设计模式懒汉式 getInstance() {
		if(instance == null) {
			instance = new 单例设计模式懒汉式("新实例");
		}
		return instance;
	}
}
