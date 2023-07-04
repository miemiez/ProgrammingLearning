import java.util.*;
import java.text.*;

public class TestSimpleDateFormat {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		System.out.println(s.format(d));
	}
}
