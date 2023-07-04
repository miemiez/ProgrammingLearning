package Day23IOStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test读取 {
	public static void main(String[] args) {
		/*
		 * 创建FileInputStream输入流，读取磁盘中的数据到内存中
		 */
		FileInputStream f = null;
		try {
			f = new FileInputStream("E:\\JAVAIO\\File02\\test1.txt");
			//每次读取一个字节的数据到内存中
			int read1 = f.read();
			System.out.println((char)read1);
			int read2 = f.read();
			System.out.println((char)read2);
			int read3 = f.read();
			System.out.println((char)read3);
			int read4 = f.read();
			System.out.println((char)read4);
			int read5 = f.read();
			System.out.println((char)read5);
			int read6 = f.read();
			System.out.println(read6);//-1  代表文件已经读取完毕
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			if(f != null) {
				try {
					f.close();
				}catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
}
