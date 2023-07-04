package Day24IOStream3;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
	public static void main (String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("E:\\JAVAIO\\File02\\test03.txt");
			byte[] bytes = new byte[1024];
			int len;
			while((len = f.read(bytes)) != -1) {
				System.out.println(new String(bytes,0,len));
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
