package Day44Socket3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP网络通信编程应用案例4TCPFileCopy服务端 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.编写一个服务端，和一个客户端
		 * 2.服务器端在8888端口监听
		 * 3.客户端连接到服务端，发送一张图片E:\\JAVAIO\\File0\\picture.jpg
		 * 4.服务器端接收到客户端发送的图片，保存到classes文件下，发送“收到图片”再退出
		 * 5.客户端接收到服务器端发送的“收到图片”，再退出
		 */
		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("服务器端在8888端口监听，等待连接ing");
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		BufferedInputStream br = new BufferedInputStream(is);
		String s = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(s + "pictureCopy.jpg"));
		byte[] bytes = new byte[1024];
		int len;
		while((len = br.read(bytes)) != -1) {
			bw.write(bytes,0,len);
		}
		bw.flush();
		
		OutputStream os = socket.getOutputStream();
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(os));
		bw2.write("收到图片");
		bw2.flush();
		bw2.newLine();
		
		
		bw2.close();
		bw.close();
		br.close();
		socket.close();
		serverSocket.close();
	}
}
