package Day24IOStream3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test内容拷贝 {
	public static void main(String[] args) {
		//字节流文件内容拷贝
		FileInputStream f = null;
		FileOutputStream f1 = null;
		try {
			f = new FileInputStream("E:\\JAVAIO\\File02\\test03.txt");
			f1 = new FileOutputStream("E:\\JAVAIO\\File01\\test03.txt");
			int read;
			while((read = f.read()) != -1) {
				//写入数据到磁盘中
				f1.write(read);
			}
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}finally {
			if(f != null) {
				try {
					f.close();
					f1.close();
				}catch(IOException ioe) {
					System.out.println(ioe.getMessage());
				}
			}
		}
	}
}