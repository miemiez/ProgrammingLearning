package Day52Java8新特性3;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class 新时间API3 {
	public static void main(String[] args) {
		/*
		 * Instant:时间戳
		 * ZoneId:时区
		 * 
		 * Date,Instant,LocalDateTime的转换
		 */
		
		//Instant:时间戳
		Instant instant = Instant.now();//默认采用格林尼治的时区来进行输出
		System.out.println(instant.toString());
		System.out.println(instant.toEpochMilli());
		System.out.println(System.currentTimeMillis());
		
		Instant instant2 = instant.plusSeconds(10);
		System.out.println(Duration.between(instant, instant2).toMillis());
		
		
		//ZoneId:时区
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		for(String str:availableZoneIds) {
			System.out.println(str);//打印所有时区
		}
		
		System.out.println(ZoneId.systemDefault().toString());//打印当前时区
		
		
		//方法一:Date ---> Instant --->LocalDateTme
		Date date = new Date();
		Instant instant3 = date.toInstant();
		System.out.println(instant3);
		
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant3, ZoneId.systemDefault());
		System.out.println(localDateTime);
		
		//方法二:LocalDateTime ---> Instant ---> Date
		Instant instant4 = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
		System.out.println(instant4);
		Date from = Date.from(instant4);
		System.out.println(from);
	}
}
