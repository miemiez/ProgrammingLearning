package Day52Java8新特性3;

import java.time.LocalDateTime;

/*
 * 之前时间API存在问题：线程安全问题，设计混乱
 * 
 * 本地化日期时间API
 *     LocalDate
 *     LocalTime
 *     LocalDateTime
 *     
 * Instant:时间戳
 * ZoneId:时区
 * 
 * Date,Instant,LocalDateTime的转换
 * 
 * DateTimeFormatter:格式化类
 */

public class 新时间API2 {
	public static void main(String[] args) {
		/*
		 * LocalDateTime的使用
		 */
		//1.创建本地时间
		LocalDateTime localDateTime = LocalDateTime.now();//方法一
		//方法2：LocalDateTime localDateTime2 = LocalDateTime.of(0, 0, 0, 0, 0)
		System.out.println(localDateTime);
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getMonthValue());
		System.out.println(localDateTime.getDayOfMonth());
		
		//2.添加两天
		LocalDateTime localDateTime2 = localDateTime.plusDays(2);//和Date不同的是，LocalDateTime调用方法进行加减时间的时候，都会产生一个新的对象
		System.out.println(localDateTime2);
		
		//3.减少两个月
		LocalDateTime localDateTime3 = localDateTime.minusMonths(2);
		System.out.println(localDateTime3);
		
	}
}
