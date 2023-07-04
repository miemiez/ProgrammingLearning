package Day24IOStream3;

import java.io.FileInputStream;
import java.io.IOException;

public class Test字节数组读取数据 {
	public static void main(String[] args) {
		/*
		 * 使用单个字节 输入（读取数据）或者 写入（磁盘中）数据效率非常低
		 */
		FileInputStream f = null;
		try {
			f = new FileInputStream("E:\\JAVAIO\\File02\\test1.txt");
			/*
			 * 方法一：
			 */
			byte[] bytes = new byte[5];
			int len = f.read(bytes);//f.read(bytes);是以字节数组的形式读取数据，赋值给bytes数组，这个方法的返回值为实际读取到的字节数组的长度（如果读取不到则返回-1）
			System.out.println(len);//5
			System.out.println(new String(bytes));
			len = f.read(bytes);
			System.out.println(len);//5
			System.out.println(new String(bytes));
			len = f.read(bytes);
			System.out.println(len);//2
			System.out.println(new String(bytes,0,len));
			len = f.read(bytes);
			System.out.println(len);//-1
			System.out.println(new String(bytes,0,len));//报错
			
			/*
			 * 方法二：
			 */
			byte[] bytes1 = new byte[f.available()];
			f.read(bytes1);
			System.out.println(new String(bytes1));
			
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}finally {
			if(f != null) {
				try {
					f.close();
				}catch(IOException ioe) {
					System.out.println(ioe.getMessage());
				}
			}
		}
	}
}