package Day07Interface4;

public class InterfaceImp3 implements Inter,Inter2{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("这是因为Inter与Inter2接口都有default定义的相同方法：show方法，所以show方法需要被重写");
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("这是Inter接口中abstractd定义的method方法，证明了默认方法的注意事项3");
	}
	
}
