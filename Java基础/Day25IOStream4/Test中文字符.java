package Day25IOStream4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test中文字符 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*
		 * 汉字存储占用的字节数：
		 * 1.一个汉字如果是GBK编码，则占用2个字节
		 * 2.一个汉字如果是UTF-8编码，则占用3个字节（默认使用UTF-8编码）
		 */
		String str = "喜羊羊";
		String str1 = "XYY";
		System.out.println(str.getBytes().length);//9
		System.out.println(str1.getBytes().length);//3
		System.out.println(Arrays.toString(str.getBytes()));//默认使用UTF-8编码（占3个字节）
		System.out.println(Arrays.toString(str.getBytes("GBK")));//如果使用GBK编码则需申明，并且抛出异常（占2个字节）
		System.out.println(Arrays.toString(str1.getBytes()));
		
	}
}
