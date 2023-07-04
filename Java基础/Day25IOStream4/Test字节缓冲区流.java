package Day25IOStream4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test字节缓冲区流 {
	public static void main(String[] args) throws IOException {
		/*
		 * 字节缓冲输入流和字节缓冲输出流（减少系统调用，提高代码效率；底层就是申请一个8k容量的字节数组）：
		 * 1.创建字节输出流以及字节输入流对象，并填写指向的磁盘路径
		 * 2.创建字节缓冲输出流以及字节缓冲输入流，在构造方法中传递字节输出流以及字节输入流对象
		 * （字节缓冲输出流的本质是对字节流进行封装，以块的形式写入数据）
		 * 缓冲区的默认大小为8k
		 */
		FileOutputStream f1 = new FileOutputStream("E:\\JAVAIO\\File02\\test06.txt");
		BufferedOutputStream b1 = new BufferedOutputStream(f1);
		
		b1.write("MMZ\r\nYYDS".getBytes());
		b1.close();//8k内大小的字节数组，写入完不加入b1.close();则无法成功写入（缓冲）
		
		FileInputStream f2 = new FileInputStream("E:\\JAVAIO\\File02\\test06.txt");
		BufferedInputStream b2 = new BufferedInputStream(f2);
		//申请以块的形式读取数据
		int len;
		byte[] bytes = new byte[1024];
		while((len = b2.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		b2.close();
	}
}
