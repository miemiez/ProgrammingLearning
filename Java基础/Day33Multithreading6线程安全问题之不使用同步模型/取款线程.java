package Day33Multithreading6线程安全问题之不使用同步模型;

public class 取款线程 implements Runnable{
	private Account ac;
	
	public 取款线程(Account ac) {
		this.ac = ac;
	}
	
	@Override
	public void run(){
		// TODO Auto-generated method stub
		double b = 2000;
		ac.withdraw(b);
		System.out.println(Thread.currentThread().getName() + ac.getAccount() + "账户余额为：" + ac.getBalance());
	}
}
