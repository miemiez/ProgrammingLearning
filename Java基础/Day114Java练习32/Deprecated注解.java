package Day114Java练习32;

public class Deprecated注解 {
	public static void main(String[] args) {
		A a = new A();
		a.hi();
	}
}

@Deprecated
/*
 * 1.@Deprecated 修饰某个元素，表示该元素已过时
 * 2.即不再推荐使用，但是仍然可以使用
 * 3.可以修饰方法，类，字段，包，参数等等
 * 4.@Target(value = {CONSTRUCTOR,FIELD,LOCAL_VARIABLE,METHOD,PACKAGE,PARAETER,TYPE})
 * 5.@Deprecated 可以做到新旧版本的兼容和过度
 */
class A{
	public int n1 = 10;
	public void hi() {
		System.out.println("Hi!");
	}
}
