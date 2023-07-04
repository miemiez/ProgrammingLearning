package Day37Reflect3;

public class Test获取绝对路径 {
	public static void main(String[] args) {
		/*
		 * 获取绝对路径的方式（使用绝对路径，就算代码换位置了，这样编写仍然是通用的）：
		 *     （使用前提是：这个文件必须在类路径（classes或src）下，classes或src是类的根路径，凡是在classes或src下的都是类路径）：
		 *         Thread.currentThread()  当前线程对象；
		 *         getContextClassLoader() 这是线程对象的方法，可以获取到当前线程的类加载器对象（java有三大类加载器：启动类加载器，扩展类加载器，应用类加载器）
		 *         getResource()           【获取资源】这是类加载器对象的方法（当前线程的类加载器默认从类的根路径（classes或src）下加载资源）
		 *         
		 *         Thread.currentThread().getContextClassLoader().getResource("").getPath();
		 */
		//注意：getResource()  方法中的参数，必须是从类的根路径下作为起点开始写（即：classes或src目录下的文件开始）
		String path1= Thread.currentThread().getContextClassLoader().getResource("Day37Reflect3/classinfo2.properties").getPath();
		String path2= Thread.currentThread().getContextClassLoader().getResource("classinfo3.properties").getPath();
		System.out.println(path1);
		System.out.println(path2);
	}
}
