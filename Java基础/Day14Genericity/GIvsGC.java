package Day14Genericity;

public interface GIvsGC<T> {
	//泛型方法与泛型接口的区别
	public abstract <T> T show(T t);//show(T t)方法中的T指的是泛型方法中的<T>,而不是泛型类的<T>；
	
	public abstract <M> T show(T t,M m);//这时show(T t,M m)方法中的T指的是泛型类中的<T>,M指的是泛型方法中的<M>；
	
	public abstract <M> M show2(T t,M m);
}
