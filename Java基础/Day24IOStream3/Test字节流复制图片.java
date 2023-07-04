package Day24IOStream3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test字节流复制图片 {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("E:\\JAVAIO\\File02\\picture.jpg");
		byte[] bytes = new byte[1024];
		int len;
		
		FileOutputStream f1 = new FileOutputStream("E:\\JAVAIO\\File01\\picture.jpg");
		//while循环
		while((len = f.read(bytes)) != -1) {
			f1.write(bytes,0,len);
		}
		
		//for循环
		for(int len1 = f.read(bytes);len1 != -1;len1 = f.read(bytes)) {
			f1.write(bytes,0,len1);
		}
		f.close();
		f1.close();
	}
}
