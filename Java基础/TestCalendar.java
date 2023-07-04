import java.util.Calendar;

public class TestCalendar{
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022,7,14);
		// 获得年份
		int year = c.get(Calendar.YEAR);
		// 获得月份
		int month = c.get(Calendar.MONTH) + 1;
		// 获得日期
		int date = c.get(Calendar.DATE);
		// 获得小时
		int hour = c.get(Calendar.HOUR_OF_DAY);
		// 获得分钟
		int minute = c.get(Calendar.MINUTE);
		// 获得秒
		int second = c.get(Calendar.SECOND);
		// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "年" +month + "月" + date + "日" + hour + "点" + minute + "分" + second + "秒" + "星期"+ (day-1) );
	}
}
