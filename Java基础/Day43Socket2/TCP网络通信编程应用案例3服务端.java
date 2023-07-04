package Day43Socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP网络通信编程应用案例3服务端 {
	/*
	 * 使用字节流实现应用案例2
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务器在监听9999端口，等待连接ing");
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		OutputStream os = socket.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write("hello,client字符流");
		
		bw.flush();
		socket.shutdownOutput();
		
		bw.close();
		socket.close();
		serverSocket.close();
	}
}
