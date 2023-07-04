package Day14Genericity;

public class GCvsGI<T> implements GIvsGC<T>{

	@Override
	public <T> T show(T t) {
		// TODO Auto-generated method stub
		System.out.println("show(T t)方法中的T指的是泛型方法中的<T>,而不是泛型类的<T>");
		return t;
	}

	@Override
	public <M> T show(T t, M m) {
		// TODO Auto-generated method stub
		System.out.println(m);
		return t;
	}

	@Override
	public <M> M show2(T t, M m) {
		// TODO Auto-generated method stub
		System.out.println(t);
		return m;
	}
	
}
