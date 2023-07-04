package Day24IOStream3;

import java.io.FileInputStream;
import java.io.IOException;

public class Test以1024字节数组读取 {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			/*
			 * 字节数组读取数据方法三：
			 */
			f = new FileInputStream("E:\\JAVAIO\\File02\\test03.txt");
			byte[] bytes = new byte[1024];//1024的整数倍数
			int len = f.read(bytes);//获取到实际读取到的字节数组长度
			System.out.println(len);
			System.out.println(new String(bytes,0,len));
			/*
			 * 两种方式判断：
			 * 1.读取到数据 字节数组长度>0；
			 * 2.如果没有数据则返回-1(如果len == -1)则表示读取不到数据了
			 */
			//1.读取到数据 字节数组长度>0
			while((len = f.read(bytes)) > 0) {
				System.out.println(new String(bytes,0,len));
			}
			
			//2.如果没有数据则返回-1
			//while循环
			while((len = f.read(bytes)) != -1) {
				System.out.println(new String(bytes,0,len));
			}
			
			//for循环
			for(int len1 = f.read(bytes);len1 != -1;len = f.read(bytes)) {
				System.out.println(new String(bytes,0,len1));
			}
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
