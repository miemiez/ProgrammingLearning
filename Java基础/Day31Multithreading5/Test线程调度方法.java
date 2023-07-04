package Day31Multithreading5;

public class Test线程调度方法 {
	public static void main(String[] args) {
		MyThread01 mt01 = new MyThread01();
		MyThread02 mt02 = new MyThread02();
		Thread t01 = new Thread(() -> {try {
			mt01.myThread01();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
									   System.out.println(Thread.currentThread().getName());},"线程一");
		t01.start();
		Thread t02 = new Thread(() -> {try {
			mt02.myThread02();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		                               System.out.println(Thread.currentThread().getName());},"线程二");
		t02.start();
		
		
		int i01 = t01.getPriority();//获取线程优先级，默认优先级为5
		int i02 = t02.getPriority();
		
		t01.setPriority(1);//修改线程优先级1最小，10最大（优先级高了，只是抢到的CPU时间片相对多一些）
		t02.setPriority(2);
		int i03 = t01.getPriority();
		int i04 = t02.getPriority();
		
		/*
		 * 合并线程join()：
		 */
		MyThread04 mt04 = new MyThread04();
		Thread t04 = new Thread(() -> {mt04.myThread04();;
									   System.out.println(Thread.currentThread().getName());},"线程四");
		t04.start();
		
		System.out.println(i01);
		System.out.println(i02);
		System.out.println(i03);
		System.out.println(i04);
		System.out.println(Thread.currentThread().getName());
	}
}
