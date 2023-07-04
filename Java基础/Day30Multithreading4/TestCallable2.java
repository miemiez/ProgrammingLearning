package Day30Multithreading4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable2 implements Callable<Integer>{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		TestCallable2 tc2 = new TestCallable2();
		FutureTask<Integer> fti = new FutureTask<Integer>(tc2);
		new Thread(fti,"线程一").start();
		Integer result = fti.get();
		System.out.println(Thread.currentThread().getName() + "主线程结束运行" +result);
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "正在运行");
		int a = 1;
		int b = 4;
		Thread.sleep(3000);
		return b-a;
	}
	
	
}
