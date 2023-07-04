package Day43Socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.InetAddress;

public class TCP网络通信编程应用案例2客户端 {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),9999);
		OutputStream os = socket.getOutputStream();
		os.write("hello,server".getBytes());
		socket.shutdownOutput();//设置结束标记
		InputStream is = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len;
		while((len = is.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		os.close();
		is.close();
		socket.close();
	}
}
