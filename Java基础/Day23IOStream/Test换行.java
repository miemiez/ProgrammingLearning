package Day23IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test换行 {
	public static void main(String[] args) throws IOException{
		/* 换行
		 * windows:\r\n
		 * linux:\n
		 * mac:\r
		 */
		FileOutputStream fileOutputStream = new FileOutputStream("E:\\JAVAIO\\File02\\test03.txt");
		String str = "门前大桥下游过一群鸭";
		fileOutputStream.write(str.getBytes());
		
		for(int i = 0;i < 3; i++) {
			fileOutputStream.write((str + "\r\n").getBytes());//换行
		}
		fileOutputStream.close();
	}
}
