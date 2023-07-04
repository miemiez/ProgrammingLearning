package Day31Multithreading5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test线程池创建线程 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + "我是子线程");
			}
			
		});
	}
}
