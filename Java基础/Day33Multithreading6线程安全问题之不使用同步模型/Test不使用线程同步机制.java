package Day33Multithreading6线程安全问题之不使用同步模型;

public class Test不使用线程同步机制 {
	public static void main(String[] args) {
		/*
		 * 模拟同一个银行账户被两个线程同时取款
		 */
		Account ac = new Account("LHY的钱包",10000);
		取款线程 t1 = new 取款线程(ac);
		取款线程 t2 = new 取款线程(ac);
		new Thread(t1,"线程一").start();
		new Thread(t2,"线程二").start();
		
	}
}
