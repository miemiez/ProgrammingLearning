package Day34Multithreading7;

public class wait和notify说明 {
	/*
	 * 一.wait和notify方法不是线程对象的方法，是java中任何一个java对象都有的方法，因为这两个方法是Object类中自带的。
	 *     wait方法和notify方法不是通过线程对象调用。
	 *     
	 * 二.wait()方法作用：
	 *     Object o = new Object();
	 *     o.wait();
	 *     表示：让正在o对象上活动的线程进入等待状态，无期限等待，直到被唤醒为止。
	 *         o.wait()方法的调用，会让“当前线程（正在o对象上活动的线程）”进入等待状态。
	 * 
	 * 三.notify()方法作用：
	 *     Object o = new Object();
	 *     o.notify();
	 *     表示：
	 *         唤醒正在o对象上等待的线程。
	 *     还有一个notifyAll()方法：
	 *         这个方法是唤醒o对象上处于等待的所有线程
	 *         
	 * 四.生产者和消费者模式：
	 *     1.生产线程负责生产，消费线程负责消费。
	 *         生产线程和消费线程要达到均衡。
	 *     2.这是一种特殊的业务需求，在这种特殊的情况下需要使用wait方法和notify方法。
	 *     3.wait方法和notify方法建立在线程同步（synchronized）的基础上，因为多线程要同时操作一个仓库（对象），有线程安全问题。
	 *     4.wait方法作用：o.wait()让正在o对象上活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁。
	 *     5.notify方法作用：o.notify()让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁。
	 *     
	 */
}
