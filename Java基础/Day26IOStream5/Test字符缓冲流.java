package Day26IOStream5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test字符缓冲流 {
	public static void main(String[] args) throws IOException{
		/*
		 * 区别于字节缓冲流，这是字符缓冲流，它的功能与字节缓冲流一样，减少系统调用，提高代码效率（每次读取，写入的默认大小都为8kb）
		 */
		
		/*
		 * （一）可以同时实现增加写入功能以及编码（解码）功能
		 * OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\JAVAIO\\File02\\test03.txt",true),"GBK");
		 * InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\\\JAVAIO\\\\File02\\\\test03.txt"),"GBK");
		 */
		
		//（二）只能实现增加写入功能，不能实现指定编码（解码）功能
		FileWriter fw = new FileWriter("E:\\JAVAIO\\File02\\test10.txt");
		FileReader fr = new FileReader("E:\\JAVAIO\\File02\\test10.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
		
		bw.write("阁下连让我拿出电锯的实力都没有\r\n更别说踏入那片森林!");
		bw.close();
		
		int len;
		char[] chars = new char[1024];
		while((len = br.read(chars)) != -1) {
			System.out.println(new String(chars,0,len));
			System.out.println(Arrays.toString(chars));
		}
		br.close();
	}
}
