package Day29Multithreading3;

public class TestThread类 extends Thread {
	public static void main(String[] args) {
		/*
		 * 启动线程是调用start方法而不是run方法
		 * ****调用start()，线程不是立即被cpu执行（处于就绪状态，等待cpu调度，从就绪状态到运行状态）****
		 */
		new TestThread类().start();//创建第一个子线程
		new TestThread类().start();//创建第二个子线程
		//在这个案例中main是主线程
		System.out.println(Thread.currentThread().getName() + "我是主线程");//Thread.currentThread()方法是打印当前线程内容
		/*
		 * ****主线程结束了，并不代表子线程结束了****
		 */
		System.out.println("主线程执行完毕");
	}
	
	/*
	 * 线程执行的代码 就是在run方法中
	 */
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "我是子线程");
		try {
			//使当前线程阻塞3s；
			Thread.sleep(3000);
		}catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "阻塞完毕");
	}
	
}
