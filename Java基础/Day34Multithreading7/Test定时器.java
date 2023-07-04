package Day34Multithreading7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test定时器 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date firstTime = sdf.parse("2022-9-26 01:18:00");//解析这个格式的时间，传给Date类型的firstTime对象
		Timer timer = new Timer();
		//Timer timer = new Timer(true);这个构造方法是将线程设置成守护线程
		timer.schedule(new TestTimerTask(),firstTime,3000);//timer.schedule(定时任务,第一次执行时间,间隔多久执行一次);
	}
}

class TestTimerTask extends TimerTask{

	@Override
	public void run() {
		//编写需要执行的任务就行
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(new Date());
		System.out.println("成功完成第一次数据备份" + time);
	}
	
}
