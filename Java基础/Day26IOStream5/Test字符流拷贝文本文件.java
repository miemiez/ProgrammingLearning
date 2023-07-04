package Day26IOStream5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test字符流拷贝文本文件 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\JAVAIO\\File02\\test03.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\JAVAIO\\File01\\test03.txt"));
		
		int len;
		char[] chars = new char[1024];
		while((len = isr.read(chars)) != -1) {
			osw.write(chars,0,len);
		}
		isr.close();
		osw.close();
	}
}
