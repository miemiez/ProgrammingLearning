
public class EncasementAndDevanning {
	public static void main(String[] args) {
		int i = 10;
		//下面三种方法都可以实现int -> Integer的装箱，只不过前两种为手动装箱，第三种为自动装箱
		Integer it = new Integer(i);
		Integer it1 = Integer.valueOf(i);
		Integer it2 = i;//底层仍然使用的是Integer.valueOf()方法
		
		//下面两种方法都可以实现Integer -> int的拆箱，只不过第一种为手动拆箱，第二种为自动拆箱
		int i1 = it1.intValue();
		int i2 = it1;//底层仍然使用的是intValue()方法
		
		System.out.println(it);
		System.out.println(it1);
		System.out.println(it2);
		
		System.out.println(i1);
		System.out.println(i2);
	}
}
