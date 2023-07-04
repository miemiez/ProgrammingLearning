package Day102Java练习20;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

class CheckingAccount extends BankAccount {
	
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
	}

	public void deposit(double amount) {//存款e
		super.deposit(amount - 1);
	}
	
	public void withdraw(double amount) {//取款
		super.deposit(amount + 1);
	}
}

class SavingsAccount extends BankAccount {
	//新增属性
	private int count = 3;
	private double rate = 0.01;//利率
	

	public SavingsAccount(double initialBalance) {
		super(initialBalance);
	}
	
	public void deposit(double amount) {//存款e
		if(count > 0) {
			super.deposit(amount);
		}else {
			super.deposit(amount - 1);//1块转入银行
		}
		count--;//减去一次
	}
	
	public void withdraw(double amount) {//取款
		if(count > 0) {
			super.withdraw(amount);
		}else {
			super.withdraw(amount + 1);
		}
		count--;//减去一次
	}
	
	public void earnMonthlyInterest(double account) {//每个月初，统计上个月的利息，同时将count = 3
		count = 3;
		super.deposit(getBalance() * rate);
	}
}
