package Day112Java练习30;

public class 匿名内部类练习 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.m(() -> System.out.println("上课铃想啦！！！叮叮叮叮"));
	}
}

interface Bell{
	void ring();
}

class CellPhone{
	public void m(Bell bell) {
		System.out.println("m方法被调用");
		alarmClock(bell);
	}
	
	public void alarmClock(Bell bell) {
		System.out.println(bell.getClass());
		bell.ring();//动态绑定
	}
}
