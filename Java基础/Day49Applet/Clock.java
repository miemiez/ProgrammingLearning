package Day49Applet;

import java.applet.Applet;
import java.awt.Graphics;

public class Clock extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.drawString("18:26:52",10,30);
	}
}
