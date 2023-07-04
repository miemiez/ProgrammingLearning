package Day43Socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP网络通信编程应用案例3客户端 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),9999);
		OutputStream outputStream = socket.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
		bw.write("hello,server字符流");
		bw.newLine();//插入一个换行符，表示写入的内容结束，注意：要求对方使用readLine()!!!(作用与socket.shutdownOutput()相似，都可以作为结束标记，可以参照应用案例3服务端的写法)
		bw.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		br.close();
		socket.close();
	}
}
