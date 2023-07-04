package Day07Interface4;

public class InterfaceImp implements Inter{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("这是Inter接口中abstractd定义的method方法，证明了默认方法的注意事项1");
	}
	
	@Override
	public void show() {
		System.out.println("这里重写了接口中的默认方法");
	}
}
