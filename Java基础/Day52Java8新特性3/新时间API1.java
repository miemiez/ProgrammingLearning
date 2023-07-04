package Day52Java8新特性3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class 新时间API1 {
	/*
	 * 在旧版的 Java 中，日期时间 API 存在诸多问题，其中有：

	 *    非线程安全 − java.util.Date 是非线程安全的，所有的日期类都是可变的，这是Java日期类最大的问题之一。

	 *    设计很差 − Java的日期/时间类的定义并不一致，在java.util和java.sql的包中都有日期类，此外用于格式化和解析的类在java.text包中定义。java.util.Date同时包含日期和时间，而java.sql.Date仅包含日期，将其纳入java.sql包并不合理。另外这两个类都有相同的名字，这本身就是一个非常糟糕的设计。

	 *    时区处理麻烦 − 日期类并不提供国际化，没有时区支持，因此Java引入了java.util.Calendar和java.util.TimeZone类，但他们同样存在上述所有的问题。
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		ExecutorService pool = Executors.newFixedThreadPool(10);
		Callable<LocalDate> callable = new Callable<>() {

			@Override
			public LocalDate call() throws Exception {
				return LocalDate.parse("20221018",dtf);
			}
			
		};
		List<Future<LocalDate>> list = new ArrayList<>();
		for(int i = 0;i < 10;i++) {
			Future<LocalDate> future = pool.submit(callable);
			list.add(future);
		}
		
		for(Future<LocalDate> future:list) {
			System.out.println(future.get());
		}
		pool.shutdown();
	}
}