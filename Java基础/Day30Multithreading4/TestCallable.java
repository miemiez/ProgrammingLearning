package Day30Multithreading4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable<Integer> {
	/*
	 * 用Callable和Future创建线程，需要等到得到该线程的返回值之后，才能继续运行下面的代码；
	 * 
	 * 底层是用LockSupport.park()方法进行阻塞的，可以用LockSupport.unpark()进行唤醒。
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		TestCallable tc = new TestCallable();
		FutureTask<Integer> ft = new FutureTask<Integer>(tc);
		new Thread(ft).start();
		//主线程需要等待子线程返回结果才能继续运行；
		Integer result = ft.get();
		System.out.println(Thread.currentThread().getName() + result);
	}
	
	@Override
	public Integer call() throws Exception {
		System.out.println("当前子线程正在执行");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "线程1");
		return null;
	}
	
}
