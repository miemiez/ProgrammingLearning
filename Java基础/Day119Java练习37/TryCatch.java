package Day119Java练习37;

public class TryCatch {
	public static void main(String[] args) {
		/*
		 * try{
		 *     代码【可能有异常】
		 * }catch(Exception e){
		 *     捕获到异常
		 *     1.当异常发生时
		 *     2.系统将异常封装成Exception对象e，传递给catch
		 *     3.得到异常对象后，程序员自己处理
		 *     4.注意，如果没有发生异常catch代码块不执行
		 * }finally{
		 *     1.不管try代码块是否有异常发生，始终要执行finally
		 *     2.所以，通常将释放资源的代码放在finally中去
		 * }
		 */
		
		/*
		 * try-catch方式处理异常的注意事项
		 *     1）如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块；
		 *     2）如果异常没有发生，则顺序执行try的代码块，不会进入到catch
		 *     3）如果希望不管是否发生异常，都执行某段代码（比如关闭连接，释放资源等等），则使用如下代码-finally{}
		 *     4）可以有多个catch语句，捕获不同的异常（进行不同的业务处理），要求父类异常在后，子类异常在前，比如（Exception在后，
		 *         NullPointerException在前），如果发生异常，只会匹配到一个catch
		 */
		/*
		 *     5）可以进行try-finally配合使用，这种用法相当于没有捕获异常，因此程序会直接崩掉/退出。
		 *         应用场景，就是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑
		 */
		try {
			int n1 = 10;
			int n2 = 0;
			System.out.println(n1 / n2);
		}finally {
			System.out.println("执行了finally。。。");
		}
		System.out.println("程序继续执行。。。");
	}
}
