package Day33Multithreading6线程安全问题之使用同步模型;

public class DeadLock {
	public static void main(String[] args) {
		Object ob1 = new Object();
		Object ob2 = new Object();
		
		//t1，t2两个线程共享ob1,ob2
		Thread1 t1 = new Thread1(ob1,ob2);
		Thread2 t2 = new Thread2(ob1,ob2);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread{
	Object ob1;
	Object ob2;
	
	public Thread1(Object ob1,Object ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	public void run() {
		synchronized(ob1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(ob2) {
				
			}
		}
	}
}

class Thread2 extends Thread{
	Object ob1;
	Object ob2;
	
	public Thread2(Object ob1,Object ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	public void run() {
		synchronized(ob2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(ob1) {
				
			}
		}
	}
}