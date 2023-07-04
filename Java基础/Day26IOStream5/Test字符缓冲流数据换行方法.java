package Day26IOStream5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test字符缓冲流数据换行方法 {
	/*
	 * 因为不同系统的换行符不同：
	 * Windows:\r\n
	 * Linux:\n
	 * Mac:\r
	 * 字符缓冲流数据换行方法（ 所以为了让程序适配各个系统，则可以需要判断系统）：
	 * 字符缓冲流写入数据换行方法bw.newLine();
	 * 字符缓冲流读取数据换行方法br.readLine();
	 */
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\JAVAIO\\File02\\test11.txt"));
		BufferedReader br = new BufferedReader(new FileReader("E:\\JAVAIO\\File02\\test11.txt"));
		
		for(int i = 0;i < 10;i++) {
			bw.write("喜羊羊喜羊羊喜羊羊");
			bw.newLine();//换行方法
		}
		
		bw.close();
		
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);//br.readLine();方法只是读取文件中一行的数据（无换行符），但是如果要在控制台中打印，还是要使用System.out.println();方法，而不是使用System.out.print();方法
		}
		br.close();
	}
}
