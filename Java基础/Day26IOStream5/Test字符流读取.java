package Day26IOStream5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test字符流读取 {
	public static void main(String[] args) throws IOException {
		FileInputStream f= new FileInputStream("E:\\JAVAIO\\File02\\test08.txt");
		InputStreamReader r = new InputStreamReader(f,"GBK");
		//读取的方式一：字符数组
		int len;
		char[] chars = new char[1024];
		while((len = r.read(chars)) != -1) {
			System.out.println(new String(chars,0,len));
			System.out.println(Arrays.toString(chars));
		}
		//读取的方式二：字符数组（每次从0索引开始只读取2个字符，所以len的值几乎都为2）
		while((len = r.read(chars,0,2)) != -1) {
			System.out.println(new String(chars,0,len));
			System.out.println(Arrays.toString(chars));
		}
		//读取的方式三：读取单个字符（就算是在"GBK"编码中占用两个字节的中文，也是可以直接读取出来的）
		System.out.println((char)r.read());
		r.close();
	}
}
