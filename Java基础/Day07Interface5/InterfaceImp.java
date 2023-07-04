package Day07Interface5;

public class InterfaceImp implements Inter{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceImp重写了抽象方法，但是没有重写静态方法");
	}
	
	public static void show() {
		System.out.println("这不叫重写，这只是因为InterfaceImp类里有一个和Inter接口中同名的show方法而已，而不是调用Inter接口中的show方法");
	}
	
	public void show1() {
		Inter.show();
	}
}
