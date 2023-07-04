package Day44Socket3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP网络通信编程应用案例4TCPFileCopy客户端 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),8888);
		InputStream is1 = new FileInputStream("E:\\JAVAIO\\File01\\picture.jpg");
		BufferedInputStream br1 = new BufferedInputStream(is1);
		byte[] bytes = new byte[1024];
		int len;
		
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bw = new BufferedOutputStream(os);
		while((len = br1.read(bytes)) != -1) {
			bw.write(bytes,0,len);
		}
		bw.flush();
		socket.shutdownOutput();
		
		InputStream is = socket.getInputStream();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(is));
		String str2;
		while((str2 = br2.readLine()) != null) {
			System.out.println(str2);
		}
		
		bw.close();
		br1.close();
		br2.close();
		socket.close();
	}
}
