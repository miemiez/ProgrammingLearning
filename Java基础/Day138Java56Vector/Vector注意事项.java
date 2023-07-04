package Day138Java56Vector;

import java.util.Vector;

public class Vector注意事项 {
	public static void main(String[] args) {
		/*
		 *（1）Vector底层也是一个对象数组，protected Object[] elementData;
		 *（2）Vector是线程同步的，即线程安全，Vector类的操作方法带有synchronized
		 *（3）在开发中，需要线程同步安全时，考虑使用Vector
		 */
		Vector<String> v  = new Vector<>();
		
	}
}