package Day25IOStream4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test读取磁盘文件中的乱码 {
	public static void main(String[] args) throws IOException {
		/*
		 * 读取磁盘中的文件乱码
		 * 程序中设定读取编码的格式UTF-8
		 * 该文件存储在硬盘中的编码格式也应为UTF-8
		 * 如果编码格式不一致，则会发生乱码
		 */
		FileInputStream f = new FileInputStream("E:\\JAVAIO\\File02\\test07.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		int len;
		byte[] bytes = new byte[1024];
		while((len = b.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));//因为test07.txt文件为GBK编码格式，所以正常用默认的UTF-8编码格式读取时，会出现乱码
			System.out.println(new String(bytes,0,len,"GBK"));//用GBK编码格式读取则不会有乱码问题
		}
		b.close();
	}
}
