package Day06Interface2;

public class InterfaceImp1 implements Inter1,Inter2{
	//多个接口中有重名的方法那么只要重写一次就可以了；
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method4");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3");
	}
	
}
