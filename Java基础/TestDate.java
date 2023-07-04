import java.util.Date;
import java.text.SimpleDateFormat;
public class TestDate{
	 public static void main(String[] args){
		 //创建动态Date
		 Date date1 = new Date();
		 System.out.println(date1);
		 System.out.println(date1.getYear());
		 System.out.println(date1.getMonth());
		 System.out.println(date1.getDate());
		 System.out.println(date1.getDay());
		 System.out.println(date1.getHours());
		 System.out.println(date1.getMinutes());
		 System.out.println(date1.getSeconds());
		 
		 //创建静态Date
		 Date date2 = new Date(122,7,14,18,25);//year +1900,mouth -1,date
		 System.out.println(date2);
		 
		 //用字符串创建静态Date
		 Date date3 = new Date("Aug 14 18:17:56 2022");
		 System.out.println(date3);
		 
		 //比较日期先后；
		 boolean b = date1.before(date2);
		 boolean a = date1.after(date2);
		 int c = date1.compareTo(date2);
		 System.out.println(b);
		 System.out.println(a);
		 System.out.println(c);
		 
		 //从格林尼治时间（时间原点）到现在所经历的时间（单位：毫秒）
		 System.out.println(date1.getTime());
		 System.out.println(date1.toLocaleString());//以字符串的形式打印日期；
		 
		 //格式化日期
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println("当前时间为：" + sdf.format(date1));
		 
		 //printf格式化日期
		 System.out.printf("显示全部日期:%tc%n",date1);
		 System.out.printf("显示年月日:%tF%n",date1);
		 System.out.printf("显示月日年:%tD%n",date1);
		 System.out.printf("显示12小时制时间:%tr%n",date1);
		 System.out.printf("显示24小时制时间（到分）:%tR%n",date1);
		 System.out.printf("显示24小时制时间:%tT",date1);
	}
}