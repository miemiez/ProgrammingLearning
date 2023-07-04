package Day49Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

public class Clock2 extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int width,height;//保存Applet的宽度和高度
	int hours = 0,minutes = 0,seconds = 0;//用于保存时，分，秒的数值
	String timeString = "";//用于以数字方式显示时间的字符串
	
	public void init() {
		width = getSize().width;//获取Applet的宽度
		height = getSize().height;//获取Applet的高度
		setBackground(Color.black);//设置Applet的背景为黑色
	}
	
	public void start() {
		Calendar c = Calendar.getInstance();
		hours = c.get(Calendar.HOUR_OF_DAY);
		minutes = c.get(Calendar.MINUTE);
		seconds = c.get(Calendar.SECOND);
		timeString = ((hours > 9) ? "" : "0") + hours + ":"
				+ ((minutes > 9) ? "" : "0") + minutes + ":"
				+ ((seconds > 9) ? "" : "0") + seconds;
				
	}
	
	public void stop() {
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		Font bigBoldFont = new Font("Arial",Font.BOLD,20);
		g.setFont(bigBoldFont);
		g.drawString(timeString, (width-80)/2, height-height/2+10);
	}
}
