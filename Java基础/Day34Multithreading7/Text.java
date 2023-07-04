package Day34Multithreading7;

import java.util.ArrayList;

public class Text {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(null);
		Class1 c = new Class1(arr);
		Class2 c2 = new Class2(arr);
		Thread t1 = new Thread(c,"奇数线程--->");
		Thread t2 = new Thread(c2,"偶数线程--->");
		t1.start();
		t2.start();
	}
}

class Class1 implements Runnable{
	private ArrayList<Integer> arr;

	public Class1(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(arr) {
				
				int i = arr.size();
				if(i % 2 == 1){
					System.out.println(Thread.currentThread().getName() + i);
					try {
						arr.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				arr.add(null);
				arr.notify();
			}
		}
		
	}
	
}

class Class2 implements Runnable{
	private ArrayList<Integer> arr;
	
	public Class2(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(arr) {
				
				int i = arr.size();
				if(i % 2 == 0) {
					System.out.println(Thread.currentThread().getName() + i);
					try {
						arr.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				arr.add(null);
				arr.notify();
			}
		}
		
	}
	
}