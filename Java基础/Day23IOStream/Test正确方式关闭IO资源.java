package Day23IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test正确方式关闭IO资源 {
	public static void main(String[] args) {
		FileOutputStream f = null;
		try {
			f = new FileOutputStream("E:\\JAVAIO\\File02\\test04.txt",true);
			f.write("hhh".getBytes());
			f.write(10/0);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(RuntimeException re){
			re.printStackTrace();
		}finally {
			if(f != null) {
				try {
					//关闭资源
					f.close();
					System.out.println("成功关闭资源");
				} catch (IOException ioe) {
					// TODO Auto-generated catch block
					ioe.printStackTrace();
				}
			}
		}
	}
}
