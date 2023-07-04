package Day29Multithreading3;

public class TestRunnable接口 implements Runnable{
	public static void main(String[] args) {
		new Thread(new TestRunnable接口()).start(); 
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "这是利用Runnable接口创建的线程");
	}
	
}
