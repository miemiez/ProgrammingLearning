package Day26IOStream5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test字符流写入 {
	public static void main(String[] args) throws IOException{
		/*
		 * 字符流：
		 * 实际上是对字节流的包装，如果读取的文件为文本类型，应该优先使用字符流对文件进行编码和解码操作
		 */
		FileOutputStream f = new FileOutputStream("E:\\JAVAIO\\File02\\test08.txt");
		OutputStreamWriter osw = new OutputStreamWriter(f,"GBK");
		//写入的方式一：字符串（用的最多）
		String str = "喜羊羊与灰太狼";
		osw.write(str);
		osw.write(str,4,3);
		//写入的方式二：单个字节
		osw.write(97);
		//写入的方式三：单个字符
		osw.write('b');
		//写入的方式四：字符数组
		char[] chars = {'c','d','e','光','头','强'};
		osw.write(chars);
		osw.write(chars,3,3);
		osw.close();
	}
}
