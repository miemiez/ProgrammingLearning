package Day31Multithreading5;

public class MyThread04 extends Thread{
	public void myThread04() {
		MyThread03 mt03 = new MyThread03();
		Thread t03 = new Thread(mt03);
		t03.setName("线程三");
		t03.start();
		try {
			t03.join();//“线程三”合并到当前线程中，当前线程受阻塞
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程三已经合并入线程四");
	}
}
