package Day25IOStream4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test字节缓冲区复制视频 {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		method1();//最快（拷贝该视频耗时40毫秒左右）
		//method2();//中等（拷贝该视频耗时150毫秒左右）
		//method3();//最慢（拷贝该视频耗时120200毫秒左右）
		long endTime = System.currentTimeMillis();
		
		System.out.println("复制该视频一共耗时" + (endTime - startTime) + "毫秒。");
	}
	
	public static void method1() throws IOException {
		/*
		 * **********以字节缓冲区流的方式进行拷贝，只进行少次系统调用，效率最高***********
		 */
		FileInputStream f1 = new FileInputStream("E:\\JAVAIO\\File02\\video.mp4");
		FileOutputStream f2 = new FileOutputStream("E:\\JAVAIO\\File01\\video.mp4");
		
		BufferedInputStream b1 = new BufferedInputStream(f1);
		BufferedOutputStream b2 = new BufferedOutputStream(f2);
		
		int len;
		byte[] bytes = new byte[1024];
		while((len = b1.read(bytes)) != -1) {
			b2.write(bytes,0,len);
		}
		
		b1.close();
		b2.close();
	}
	
	public static void method2() throws IOException{
		/*
		 * 以容量为1024的字节数组的形式进行拷贝，对视频大小大于该容量的文件，拷贝效率也低
		 */
		FileInputStream f1 = new FileInputStream("E:\\JAVAIO\\File02\\video.mp4");
		FileOutputStream f2 = new FileOutputStream("E:\\JAVAIO\\File01\\video.mp4");
		
		int len;
		byte[] bytes = new byte[1024];//容量定位f1.available()效率也很块（拷贝该文件耗时65毫秒左右，仅次于method1()）
		while((len = f1.read(bytes)) != -1) {
			f2.write(bytes,0,len);
		}
		
		f1.close();
		f2.close();
	}
	
	public static void method3() throws IOException{
		/*
		 * 一个字节一个字节的拷贝，有多少字节就要进行多少次系统调用，效率极低
		 */
		FileInputStream f1 = new FileInputStream("E:\\JAVAIO\\File02\\video.mp4");
		FileOutputStream f2 = new FileOutputStream("E:\\JAVAIO\\File01\\video.mp4");
		
		int read;
		while((read = f1.read()) != -1) {
			f2.write(read);
		}
		
		f1.close();
		f2.close();
	}
}
