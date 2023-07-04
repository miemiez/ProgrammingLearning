package Day134Java练习52;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 日期类 {
	public static void main(String[] args) throws ParseException {
		/*
		 * （1）Date；精确到毫秒，代表特定的瞬间
		 * （2）SimpleDateFormat：格式和解析日期的类
		 *      SimpleDateFormat 格式化和解析日期的具体类，它允许进行格式化（日期->文本），解析（文本->日期）和规范化
		 */
		
		//默认输出的日期格式是国外的方式，因此通常需要对格式进行转换
		Date d1 = new Date();//获取当前系统时间
		System.out.println("当前时间=" + d1);
		Date d2 = new Date(99999887897l);//通过指定毫秒数得到时间
		System.out.println("d2指定的时间=" + d2);//获取某个时间对应的毫秒数
		
		 //格式转换需要创建一个SimpleDateFormat对象
		 //这里的格式使用的字母都是规定好的，不能乱写
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		String format = sdf.format(d1);
		System.out.println("当前日期=" + format);//format：将日期转换成指定格式的字符串
		
		/*
		 * 可以把一个格式化的String转成对应的Date【解析parse】
		 */
		String s = "1996年01月01日 10:20:30 星期一";
		Date parse = sdf.parse(s);
		System.out.println(parse);
	}
}
