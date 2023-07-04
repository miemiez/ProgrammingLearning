package Day134Java练习52;

import java.util.Calendar;

public class 第二代日期类Calendar {
	public static void main(String[] args) {
		//Calendar c = new Calendar();【X】，因为Calendar的构造器是私有的
		/*
		 * 1.Calendar是一个抽象类，并且构造器是private
		 * 2.可以通过getInstance()来获取实例
		 * 3.有大量的方法和字段提供给程序员
		 * 4.Calendar没有提供对应的格式化的类，因此需要程序员自己组合来输出（灵活）
		 * 5.如果我们需要按照24小时进制来获取时间，Calendar.HOUR ==改成==> HOUR_OF_DAY
		 */
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		/*
		 * 获取日历对象的某个日历字段
		 */
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);//这里需要+1是因为Calendar返回月份的时候，是按照0开始编号
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		//Calendar没有专门的格式化方法，所以需要程序员自己来组合显示
		System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日\t"
		                   + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
		
		/*
		 * 【Date和Calendar存在的问题】：
		 *     1.可变性：像日期和时间这样的类应该是不可变的。
		 *     2.偏移性：Date中的年份是从1900开始的，而月份都从0开始。
		 *     3.格式化：格式化只对Date有用，Calendar则不行
		 *     4.此外，它们也不是线程安全的；同时还不能处理闰秒（每隔2天，多出1s）
		 */
	}
}
