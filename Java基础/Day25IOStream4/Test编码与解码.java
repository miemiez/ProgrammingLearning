package Day25IOStream4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test编码与解码 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*
		 * 编码：把人看得懂的变成看不懂的（字符-->字节）
		 * byte[] getBytes()
		 * byte[] getBytes(String charsetName)使用指定的字符集讲此String编码为byte序列
		 * 解码：把人看不懂的变成看得懂的（字节-->字符）
		 * String(byte[] bytes)
		 * String(byte[] bytes,String charsetName)
		 */
		String str = "喜羊羊";
		byte[] bytes = new byte[3];
		bytes[0] = -27;
		bytes[1] = -106;
		bytes[2] = -100;
		//编码和解码格式要一致，要不然会产生乱码
		System.out.println(str.getBytes());//str的编码
		System.out.println(Arrays.toString(str.getBytes()));
		System.out.println(new String(bytes));//bytes字节数组的解码
		System.out.println(new String(bytes,"GBK"));///bytes字节数组的解码（因为编码和解码的格式不一致，所以会导致乱码）
	}
}
