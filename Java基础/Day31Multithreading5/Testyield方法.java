package Day31Multithreading5;

public class Testyield方法 {
	/*
	 * 静态方法yield()：
	 * 	   暂停当前正在执行的线程对象，让当前线程让位，让给其他线程使用
	 *     yield()方法的执行会让当前线程从“运行状态”转变为“就绪状态”（但是到就绪态之后还可能继续抢到线程，但是概率较小）
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new Thread01(),"子xc");
		Thread.currentThread().setName("主xc");
		t.start();
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}
}

class Thread01 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			if(i % 10 == 0) {
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}
}
