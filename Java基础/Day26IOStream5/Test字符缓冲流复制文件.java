package Day26IOStream5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test字符缓冲流复制文件 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("E:\\JAVAIO\\File02\\test11.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\JAVAIO\\File01\\test11.txt"));
		
		String str;
		while((str = br.readLine()) != null) {
			bw.write(str);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
