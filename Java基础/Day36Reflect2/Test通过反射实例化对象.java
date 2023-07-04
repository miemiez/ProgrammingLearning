package Day36Reflect2;

public class Test通过反射实例化对象 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("Day36Reflect2.User");
		Object o = null;
		try {
			o = c.newInstance();//能创建对象，但是只能调用类的无参构造方法（通过这种方式创建对象，比new关键字创建对象更灵活）；
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(o);//创建的实例对象的地址值
	}
}
