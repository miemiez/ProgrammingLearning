package Day23IOStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test循环读取 {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("E:\\JAVAIO\\File02\\test1.txt");
			
			//循环读取方法一：
			int size = f.available();
			for(int i = 0;i < size;i++) {
				System.out.println((char)f.read());
			}
			
			//循环读取方法二：
			int read = f.read();
			while(read != -1) {
				System.out.println((char)read);
				read = f.read();
			}
			
			//循环读取方法三（方法二的优化）：
			int read2;
			while((read2 = f.read()) != -1) {
				System.out.println((char)read2);
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
