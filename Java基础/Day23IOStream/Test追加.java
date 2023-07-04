package Day23IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test追加 {
	public static void main(String[] args) throws IOException{
		FileOutputStream f = new FileOutputStream("E:\\JAVAIO\\File02\\test03.txt",true);//表示追加写入数据，写入文件的末尾
		f.write("追加写入成功".getBytes());
		f.close();
	}
}
