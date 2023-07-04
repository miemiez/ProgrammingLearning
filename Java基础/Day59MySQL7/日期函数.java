package Day59MySQL7;

public class 日期函数 {
	/*
	 * 日期相关函数
	 *     1.CURRENT_DATE
	 *     2.CURRENT_TIME
	 *     3.CURRENT_TIMESTAMP
	 *     
	 *     4.显示所有新闻信息，发布日期只显示日期，不用显示日期，不用显示时【DATE(datetime) datetime的日期部分】【YEAR(datetime) | MONTH(datetime) | DATE(datetime)】
	 *         SELECT id,content,DATE(send_time) FROM mes
	 *         
	 *     5.查询在10分钟内发布的新闻【DATE_ADD(date2,INTERVAL d_value d_type)/DATE_SUB(date2,INTERVAL d_value d_type)】
	 *         (1)SELECT * FROM mes WHERE DATE_ADD(send_time,INTERVAL 10 MINUTE) >= NOW()
	 *         (2)SELECT * FROM mes WHERE DATE_SUB(NOW(),INTERVAL 10 MINUTE) <= send_time
	 *     
	 *     6.在mysql的sql语句中求出 2022-10-27 和 2020-8-8 相差多少天【DATEDIFF(date1,date2)：两个日期差，结果是天】
	 *         SELECT DATEDIFF('2022-10-27','2020-8-8') FROM dual
	 *         
	 *     7.【TIMEDIFF(date1,date2):两个时间差，结果是多少小时多少分钟多少秒】
	 *         SELECT TIMEDIFF(DATE_ADD('2020-8-8 10:10:10',INTERVAL 10 YEAR),NOW()) FROM dual
	 *     
	 *     8.unix_timestamp():返回的是1970-1-1到现在的毫秒数
	 *         SELECT UNIX_TIMESTAMP() FROM dual
	 *         
	 *     9.FROM_UNIXTIME():可以把一个unix_timestamp秒数，转成指定格式的日期
	 *         &Y-%m-%d 格式是规定好的，表示年月日
	 *             SELECT FROM_UNIXTIME(UNIX_TIMESTAMP,'%Y-%m-%d') FROM dual
	 *     
	 *     10.FROM_DAYS():按天数参数，返回年月日（模糊值）
	 */
}
