package Day30Multithreading4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Integer> fti = new FutureTask<Integer>(() -> {
			int a = 1;
			int b = 2;
			System.out.println(Thread.currentThread().getName() + "正在运行");
			Thread.sleep(3000);
			return a + b;
		});
		new Thread(fti,"线程一").start();
		Integer result = fti.get();
		System.out.println(Thread.currentThread().getName() + "主线程结束运行，线程一的运行结果为：" + result);
	}
}