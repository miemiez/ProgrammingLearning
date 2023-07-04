package Day14Genericity2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	/*通配符的上限与下限：
	 * 上限：<? extends 类型> List<? extends Parent>:它表示的类型是Parent或者子类型；
	 * 下限：<? super 类型>  List<? super Parent>:它表示的类型是Parent或其父类型；
	 */
	public static void main(String[] args) {
		List<GrandParent> gp = new ArrayList<>();
		List<Parent> p = new ArrayList<>();
		List<Extends> e = new ArrayList<>();
		List<NoExtends> ne = new ArrayList<>();
		//method(gp);报错
		method(p);
		method(e);
		//method(ne);报错
		method2(gp);
		method2(p);
		//method2(e);报错
	}
	
	public static void method(List<? extends Parent> list) {
		
	}
	
	public static void method2(List<? super Parent> list) {
		
	}
}
