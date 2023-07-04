package Day07Interface6;

public interface Inter {
	public default void show1() {
		System.out.println("Start");
		show5();
	}
	
	public default void show2() {
		System.out.println("End");
		show5();
	}
	
	public static void show3() {
		System.out.println("Start");
		show6();
	}
	
	public static void show4() {
		System.out.println("End");
		show6();
	}
	//普通的私有方法，是给默认方法服务的；
	private void show5() {
		System.out.println("是给上面默认的方法来用");
	}
	
	//静态的私有方法，是给静态方法服务的；
	private static void show6() {
		System.out.println("是给上面静态的方法来用");
	}
}
