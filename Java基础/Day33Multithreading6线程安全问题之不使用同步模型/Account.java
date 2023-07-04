package Day33Multithreading6线程安全问题之不使用同步模型;

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
	
	public void withdraw(double money) {
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
