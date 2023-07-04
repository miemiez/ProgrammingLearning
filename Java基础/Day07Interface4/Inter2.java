package Day07Interface4;

public interface Inter2 {
	public default void show() {
		System.out.println("这是Inter2接口中的默认方法");//这是Inter2中的show方法，跟Inter中的show方法同名，如果它们同时被一个继承类去实现则必须重写，否则程序无法判断你需要的是哪个show方法了
	}
}
