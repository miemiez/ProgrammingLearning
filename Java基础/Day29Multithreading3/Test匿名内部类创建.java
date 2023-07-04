package Day29Multithreading3;

public class Test匿名内部类创建 implements Runnable {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + "这是利用匿名内部类方法创建的线程");
			}
			
		}).start();
		
		new Thread(() -> System.out.println(Thread.currentThread().getName()) , "这是用lambda表达式创建的线程").start();
		
		new Thread(new Test匿名内部类创建()).start();
		
		System.out.println(Thread.currentThread().getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "这是利用Runnable接口创建的线程");
		
	}
}
