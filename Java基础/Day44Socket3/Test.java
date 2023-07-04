package Day44Socket3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		String s = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		System.out.println(s);
		OutputStream is = new BufferedOutputStream(new FileOutputStream("/C:/Users/12852/eclipse-workspace/JavaWeb/build/classes/111.txt"));
	}
}
