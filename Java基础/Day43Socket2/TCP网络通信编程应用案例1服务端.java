package Day43Socket2;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class TCP网络通信编程应用案例1服务端 {
	/*
	 * 1.编写一个服务器端和一个客户端
	 * 2.服务端在9999端口监听
	 * 3.客户端连接到服务器端，发送“hello,server”，然后退出
	 * 4.服务器端接收到客户端发送的信息，输出并退出
	 *
	 * 注意：要写两个程序，一个服务端，一个客户端（但是理论上，这两个程序要写在不同的电脑上）
	 */
	
	/*
	 * 服务端思路：
	 *     1.在本机的9999端口监听，等待连接
	 *     2.当没有客户端连接9999端口时，程序会阻塞，等待连接
	 *     3.通过Socket.getInputStream()读取客户端写入到数据通道的数据，显示
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * 在本机的9999端口监听，等待连接
		 * 细节1：要求在本机没有其他服务在监听9999，如果有其他服务在监听9999这个端口就会报错
		 * 细节2：serverSocket可以通过accept()方法返回多个Socket（即：多个客户端连接服务器的并发）
		 */
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端在9999端口监听，等待连接ing");
		/*
		 * 当没有客户端连接9999端口时，程序会阻塞，等待连接
		 * 如果有客户端连接，则会返回Socket对象，程序继续
		 */
		Socket socket = serverSocket.accept();
		System.out.println("socket = " + socket.getClass());
		InputStream is = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len;
		while((len = is.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		is.close();
		socket.close();
		serverSocket.close();
		System.out.println("服务端退出了");
	}
}
