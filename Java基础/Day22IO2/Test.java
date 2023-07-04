package Day22IO2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		/*
		 * 读取文件是图片，视频，音影等二进制文件，优先使用字节流读取
		 * 读取文件是文本，则优先使用字符流读取
		 * 如果不确定该文件是什么类型，则使用字节流读取
		 */
		
		File file = new File("E:\\JAVAIO\\File02\\test.txt");
		/* 输出流步骤：
		 * 1.哪怕这个文件不存在，也会调用系统功能创建文件
		 * 2.创建字节输出流对象（fileOutputStream）
		 * 3.字节输出流对象指向文件（file）
		 */
		
		//将程序中的数据写入到磁盘中
		//需要指定写入文件的路径，但是以防文件路径不存在，优先抛出或者捕获异常
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//将数据写入到磁盘当中
		fileOutputStream.write(97);
		//关闭字节输出流
		fileOutputStream.close();
	}
}
