package Day26IOStream5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestFileWriterFileReader {
	public static void main(String[] args) throws IOException{
		/*
		 * 字符流底层是基于字节流封装的，能够对文件进行编码以及解码操作
		 * FileWriter：写入数据
		 * FileReader：读取数据  ---  InputStreamRead，字符输入流读取数据（字符输入流->字节输入流进行封装）
		 * 
		 * FileWriter&FileReader
		 * 为了精简代码，所以JDK对字符流进行封装，只要传递文件路径即可（底层还是new出了一个字节流）
		 */
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\JAVAIO\\File02\\test03.txt"));
		FileReader fr = new FileReader("E:\\JAVAIO\\File02\\test03.txt");//等同于上一行代码（更加精简）
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\JAVAIO\\File02\\test09.txt"));
		FileWriter fw = new FileWriter("E:\\JAVAIO\\File02\\test09.txt");//等同于上一行代码
		
		fw.write("门前，大桥下游过一群鸭");
		int len;
		char[] chars = new char[1024];
		while((len = fr.read(chars)) != -1) {
			System.out.println(new String(chars,0,len));
		}
		
		isr.close();
		osw.close();
		fr.close();
		fw.close();
	}
}
