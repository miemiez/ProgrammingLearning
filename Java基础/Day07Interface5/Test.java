package Day07Interface5;

public class Test {
	public static void main(String[] args) {
		/*接口中静态方法的定义格式：
		 		格式：public static 返回值类型 方法名（参数列表）{}
		 		范例：public static void show() {}
		 
		 		接口中静态方法的注意事项：
		 			静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
		 			public可以省略，static不能省略*/
		
		InterfaceImp ii = new InterfaceImp();
		ii.method();//打印的值为：InterfaceImp重写了抽象方法，但是没有重写静态方法；
		InterfaceImp.show();//也可以写成ii.show();打印的值为：这不叫重写，这只是因为InterfaceImp类里有一个和Inter接口中同名的show方法而已，而不是调用Inter接口中的show方法；
		ii.show1();//只不过是在show1方法中将Inter.show();写进去了而已；打印的值也为：Inter接口中的静态方法；
		Inter.show();//打印的值为：Inter接口中的静态方法。
	}
}
