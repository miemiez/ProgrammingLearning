package Day26IOStream5;

public class Test小结 {
	/*
	 * 文件：
	 * File(String name);//输入文件路径
	 * 
	 * 字节流：
	 * 	FileInputStream(String name);//输入文件路径
	 * 	FileOutputStream(String name);//输入文件路径
	 * 
	 * 字节缓冲流：
	 * 	BufferedInputStream(InputStream in     (FileInputStream in));
	 * 	BufferedOutputStream(OutputStream out  (FileOutputStream out));
	 * 
	 * 字符流：
	 * 	InputStreamReader(InputStream in     (FileInputStream in));       ***可以指定解码类型***
	 * 	OutputStreamWriter(OutputStream out  (FileOutputStream out));	  ***可以指定编码类型***   ***可以通过FileOutputStream实现追加写入***
	 * 
	 * 字符流（精简）：
	 * 	FileReader(String name);//输入文件路径     ***不可以直接通过FileReader指定解码类型***
	 * 	FileWriter(String name);//输入文件路径     ***不可以直接通过FileReader指定编码类型***   ***可以追加写入***
	 * 
	 * 字符缓冲流：
	 * 	BufferedReader(Reader in   (FileReader in));
	 * 	BufferedWriter(Writer out  (FileReader out));
	 * 
	 * *****字节缓冲流是通过封装字节流来实现的*****
	 * ***** 字符流也是通过封装字节流来实现的 *****
	 * 
	 * 继承关系：
	 * (1)	Reader:
	 * 			BufferedReader
	 * 
	 * 			InputStreamReader
	 * 				FileReader
	 * 
	 * 
	 * (2)	Writer:
	 * 			BufferedWriter
	 * 
	 * 			OutputStreamWriter
	 * 				FileWriter
	 * 
	 * (3)  InputStream:
	 * 			FileInputStream
	 * 
	 * 			FilterInputStream
	 * 				BufferedInputStream()
	 * 
	 * (4)	OutputStream:
	 * 			FileOutputStream
	 * 
	 * 			FilterOutputStream
	 * 				BufferedOutputStream
	 */
}
