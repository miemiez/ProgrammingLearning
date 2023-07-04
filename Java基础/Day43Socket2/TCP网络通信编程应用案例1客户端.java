package Day43Socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.InetAddress;

public class TCP网络通信编程应用案例1客户端 {
	/*
	 * 客户端思路：
	 *     1.连接服务端（ip，端口）
	 *     2.连接上后，生成Sock，通过Sock.getOutputStream()
	 *     3.通过这个输出流，写入数据到数据通道
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * 这句代码意思就是：客户端要连接本机的9999端口，如果连接成功会返回Socket对象socket
		 */
		Socket socket = new Socket(InetAddress.getLocalHost(),9999);
		System.out.println("Socket返回=" + socket.getClass());
		/*
		 * 连接上后，生成Socket，通过socket.getOutputStream();得到和socket对象关联的输出流对象
		 */
		OutputStream os = socket.getOutputStream();
		String s = "hello,server";
		os.write(s.getBytes());
		/*
		 * 完成写入后，必须要关闭IO流对象以及Socket对象
		 */
		os.close();
		socket.close();
		System.out.println("客户端退出了");
	}
}
