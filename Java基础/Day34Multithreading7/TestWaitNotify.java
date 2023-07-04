package Day34Multithreading7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestWaitNotify {
	public static void main(String[] args) {
		/*
		 * 模拟这样一个需求：
		 *     仓库采用List集合；
		 *     List集合中假设只能存储1个元素；
		 *     1个元素代表仓库满了；
		 *     如果List集合中元素个数是0，就表示仓库空了；
		 *     保证List集合中永远都是最多存储1个元素；
		 *     必须做到这种校效果：生产1个消费1个。
		 */
		
		List<HashMap<Integer,String>> list = new ArrayList<>();
		
		Thread t1 = new Thread(new Producer(list));
		Thread t2 = new Thread(new Consumer(list));
		t1.setName("生产线程");
		t2.setName("消费线程");
		
		t1.start();
		t2.start();
	}
}

class Producer implements Runnable{
	private List<HashMap<Integer, String>> list;
	
	public Producer(List<HashMap<Integer, String>> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while(true) {
			synchronized(list) {
				//如果集合中有元素则停止生产
				if(list.size() > 0) {
					try {
						//让当前线程等待，并且释放list的对象锁
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
				HashMap<Integer,String> hashMap = new HashMap<>();
				hashMap.put(1,"数据1");
				list.add(hashMap);
				System.out.println(Thread.currentThread().getName() + "生产成功！");
				//唤醒线程
				list.notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				};
				System.out.println("notify方法只是唤醒线程，但是不会释放list对象锁，释放锁之后才能执行消费者模式");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

class Consumer implements Runnable{
	private List<HashMap<Integer, String>> list;
	
	public Consumer(List<HashMap<Integer, String>> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while(true) {
			synchronized(list) {
				//如果集合中没有元素则停止消费
				if(list.size() == 0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				HashMap<Integer,String> h= list.get(0);
				list.remove(0);
				System.out.println(Thread.currentThread().getName() + "消费成功！" + h);
				list.notify();
			}
		}
	}
}