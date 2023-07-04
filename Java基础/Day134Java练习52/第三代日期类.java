package Day134Java练习52;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class 第三代日期类 {
	public static void main(String[] args) {
		/*
		 * LocalDate（年月日），LocalTime（时分秒），LocalDateTime（日期时间/年月日时分秒）
		 */
		LocalDateTime ldt = LocalDateTime.now();//LocalDate.now();//LocalTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getYear() + "年" + ldt.getMonthValue() + "月" + ldt.getDayOfMonth() + "日" 
		                 + ldt.getHour() + "时" + ldt.getMinute() + "分" + ldt.getSecond() + "秒");
		
		
		//LocalDate和LocalTime的方法也是同理
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		/*
		 * DateTimeFormatter格式日期类（类似于SimpleDateFormat）
		 */
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
		String str = dtf.format(ldt);
		System.out.println("格式化的日期=" + str);
		
		/*
		 * Instant时间戳
		 *     类似于Date
		 *     提供了一系列和Date类转换的方式
		 *     Instant --> Date:
		 *     Date date = Date.from(instant);
		 *     
		 *     Date --> Instant:
		 *     Instant instant = date.toInstant();
		 */
		Instant now = Instant.now();//通过静态方法 now()获取表示当前时间戳的对象
		System.out.println(now);
		Date date = Date.from(now);//通过from可以吧Instant转成Date
		System.out.println(date);
		Instant instant = date.toInstant();//通过date的toInstant()可以把date转成Instant对象
		System.out.println(instant);
		
		
		/*
		 * 第三代日期类更多方法：
		 *     LocalDateTime类
		 *     MonthDay类：检查重复事件
		 *     是否是闰年
		 *     增加日期的某个部分
		 *     使用plus方法测试增加时间的某个部分
		 *     使用minus方法测试查看一年前和一年后的日期
		 *     其他的方法，使用的时候查看API就行
		 */
		//提供plus和minus方法可以对当前时间进行加或减
		//想看看890天后，是什么时候，把年月日-时分秒
		LocalDateTime localDateTime = ldt.plusDays(890);
		System.out.println("890天后是 " + dtf.format(localDateTime));
	}
}