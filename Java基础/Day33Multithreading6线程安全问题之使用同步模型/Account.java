package Day33Multithreading6线程安全问题之使用同步模型;

public class Account{
	//账号：
	private String account;
	//余额：
	private double balance;
	
	public Account(String account,double balance) {
		this.account = account;
		this.balance = balance;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return account + "账户余额为：" + balance;
	}
	
	public synchronized void withdraw(double money) {
		/*
		 * 一.线程同步机制的语法是：
		 *     synchronized(){
		 *         //线程同步代码块
		 *     }
		 *     
		 *     synchronized关键字后面这个小括号中传入的“数据”是相当关键的
		 *     这个数据必须是多线程共享的数据，才能达到多线程排队
		 *     
		 *     ()中写什么：
		 *         要看你想让哪些线程同步，假设t1，t2，t3，t4，t5五个线程，
		 *         你只希望让t1，t2，t3排队，t4，t5不需要排队，则必须在()中写入一个只有t1，t2，t3共享的对象，
		 *         而这个对象对于t4，t5来说不是共享的
		 *         （这里的共享对象是账户对象，那么this就可以指代账户对象）
		 *         但是不一定非要this不可，哪怕在成员变量中新建一个String，Object等成员对象，那么就都可以（一个对象一把锁，线程拿到锁才能执行synchronized关键字中的代码块，只要多个线程共享这个对象，那么synchronized()中就可以填写这个共享对象）
		 *         这个共享的对象一定要选好，这个共享对象一定是需要排队执行的这些线程所共享的。
		 *         
		 *         
		 * 二.synchronized(){
		 *         ...
		 *     }
		 *         这个"..."方法区中的代码越少效率越高，因为withdraw(double money)中所有的代码块都被synchronized(this) {}给框起来了，所以这里也可以把synchronized(){}这个关键字，
		 *         给用到"取款线程"这个类的run()方法中的ac.withdraw(b);上，即，这样写：synchronized(ac){ac.withdraw(b)}；
		 * 
		 * 
		 * 三.在实例方法上也可以使用synchronized关键字，
		 *     缺点：
		 *         1。那么这时候synchronized锁的一定就是this，所以这种方式不灵活；
		 *         2.synchronized出现在实例方法上，表示整个方法体都需要同步，可能无故扩大同步的范围，导致程序效率的降低，所以这种方式不常用（结合第二大点去理解）
		 *     优点：
		 *         代码写的少了，节俭了（如果共享的对象就是this，且需要同步的代码块就是整个方法体，那么就推荐使用这种方式）
		 * 
		 */
		synchronized(this) {
			double before = this.getBalance();
			double after = before - money;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setBalance(after);
		}
	}
}
