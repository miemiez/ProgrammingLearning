package Day122Java练习40;

public class 装箱和拆箱 {
	public static void main(String[] args) {
		/*
		 * 1）jdk5前的手动装箱和拆箱，装箱：基本类型->包装类型，反之，拆箱
		 * 2）jdk5以后（含jdk5）的自动装箱和拆箱方法
		 * 3）自动装箱底层调用的是valueOf方法，比如Integer.valueOf()
		 *    自动拆箱底层调用的是Integer对象.intValue()
		 */
		
		/*
		 * 手动装箱：
		 */
		int i1 = 10;
		Integer itg1 = Integer.valueOf(i1);
		
		/*
		 * 手动拆箱：
		 */
		Integer itg2 = new Integer(20);
		int i2 = itg1.intValue();
		
		/*
		 * 自动装箱：
		 */
		int i3 = 30;
		Integer itg3 = i3;
		
		/*
		 * 自动拆箱：
		 */
		Integer itg4 = new Integer(40);
		int i4 = itg4;
	}
}
