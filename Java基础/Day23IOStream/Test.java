package Day23IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		/*
		 * 1.fileOutputStream.write(97);单个数据写入进磁盘效率低下
		 * 2.fileOutputStream.write(bytes);写入一个字节数组的数据到磁盘当中，效率高----例如生活中喝水一样，一滴一滴喝很慢，一整杯直接喝很快
		 * 3.fileOutputStream.write(bytes,int begin,int end);
		 */
		
		//fileOutputStream.write(bytes);
		FileOutputStream fileOutputStream = new FileOutputStream("E:\\JAVAIO\\File02\\test1.txt");
		byte[] bytes = {97,98,99,100,101};
		fileOutputStream.write(bytes);
		fileOutputStream.write("\r\n".getBytes());
		fileOutputStream.write(bytes);
		fileOutputStream.close();
		
		//fileOutputStream.write(bytes,int begin,int end);
		FileOutputStream fileOutputStream2 = new FileOutputStream("E:\\JAVAIO\\File02\\test2.txt");
		byte[] bytes2 = {102,103,104,105};
		fileOutputStream2.write(bytes2,1,3);
		fileOutputStream2.close();
	}
}
