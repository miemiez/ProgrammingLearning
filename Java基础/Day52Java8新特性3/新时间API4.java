package Day52Java8新特性3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 新时间API4 {
	public static void main(String[] args) {
		/*
		 * DateTimeFormatter类的使用
		 */
		
		//1.创建DateTimeFormatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		//2.把时间格式化成字符串
		String str = dtf.format(LocalDateTime.now());
		System.out.println(str);
		
		//3.把字符串解析成时间
		LocalDateTime localDateTime = LocalDateTime.parse("2022-10-19 00:46:39",dtf);
		System.out.println(localDateTime);
	}
}
