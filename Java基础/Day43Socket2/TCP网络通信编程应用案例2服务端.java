package Day43Socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP网络通信编程应用案例2服务端 {
	/*
	 * 1.编写一个服务端，和一个客户端
	 * 2.服务器端在9999端口监听
	 * 3.客户端连接到服务器端，发送“hello,server”，并接受服务器端回发的“hello,client”，再退出
	 * 4.服务器端接收到客户端发送的信息，输出，并发送“hello,client”，再退出
	 */
	
	/*
	 * 与应用案例1不同的地方在与，每次通信完要设置一个结束标记，代表“我”读完了
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端在监听9999端口，等待连接ing");
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len;
		while((len = is.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		OutputStream os = socket.getOutputStream();
		os.write("hello,client".getBytes());
		socket.shutdownOutput();//设置结束标记
		is.close();
		os.close();
		socket.close();
		serverSocket.close();
	}
	
}
