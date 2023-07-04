package Day33Multithreading6线程安全问题之使用同步模型;

public class Test使用线程同步机制解决线程安全问题 {
	public static void main(String[] args) {
		Account ac = new Account("QYH",10000);
		取款线程 t1 = new 取款线程(ac);
		取款线程 t2 = new 取款线程(ac);
		Account ac2 = new Account("LHY",10000);
		/*
		 * 如果在Account类中的withdraw()方法中的synchronized()括号中写的是"abc"，
		 * 这样的随便一个字符串，由于这个字符串对象是在常量池中的，这个对象是大家所共享的唯一对象（这个对象在常量池中，有且只有一个），
		 * 所以这时候，t1，t2，t3这三个线程都要按顺序依次拿到锁后才能执行synchronized("abc"){}中的代码块
		 * 
		 * 但是如果synchronized()括号中写的是this，则t1，t2这两个线程需要按顺序依次拿到锁后才能执行synchronized(this){}中的代码块，
		 * 而t3则不需要。
		 */
		取款线程 t3 = new 取款线程(ac2);
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
	}
}
