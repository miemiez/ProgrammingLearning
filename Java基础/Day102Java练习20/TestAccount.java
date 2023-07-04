package Day102Java练习20;

public class TestAccount {
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(1000);
		ca.deposit(10);
		System.out.println(ca.getBalance());
		
		SavingsAccount sa = new SavingsAccount(1000);
		sa.deposit(100);
		sa.deposit(100);
		sa.deposit(100);
		System.out.println(sa.getBalance());//1300
		sa.deposit(100);
		System.out.println(sa.getBalance());//1399
		sa.withdraw(100);
		System.out.println(sa.getBalance());//1298
		
		//假设这里有一个定时器，月初自动调用earnMonthlyInterest()方法
		sa.earnMonthlyInterest(sa.getBalance());//获取一个月的存款利息
		System.out.println(sa.getBalance());//1310.98
	}
}
