package Day34Multithreading7;

public class Test守护线程 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		t1.setName("子xc");
		//启动线程之前，将线程设置为守护线程，等到main这个用户线程结束之后，守护线程就自动结束了，所以守护线程一般都设置为死循环。
		t1.setDaemon(true);
		t1.start();
		
		for(int i = 0;i < 10;i++) {
			System.out.println(Thread.currentThread().getName() + "----->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true) {
			System.out.println(Thread.currentThread().getName() + "----->" + (++i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}