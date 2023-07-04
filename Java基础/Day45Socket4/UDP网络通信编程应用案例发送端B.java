package Day45Socket4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP网络通信编程应用案例发送端B {
	public static void main(String[] args) throws IOException {
		//1.创建DatagramSocket对象，准备在9998端口接收数据
		//（因为UDP协议没有明确的服务端和客户端，只有数据的发送端和接收端，而这两个身份可以相互转换，因为现在程序是写在同一台电脑上所以发送端A与接收端B端口号最好不一样）
		DatagramSocket socket = new DatagramSocket(9998);
		
		//2.将需要发送的数据，封装到DatagramPacket对象中
		byte[] buf = "hello，明天吃海底捞~".getBytes();
		DatagramPacket packet = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.0.206"),9999);
		socket.send(packet);
		
		byte[] buf2 = new byte[1024];
		DatagramPacket packet02 = new DatagramPacket(buf2,buf2.length);
		socket.receive(packet02);
		int l = packet02.getLength();
		byte[] d = packet02.getData();
		System.out.println(new String(d,0,l));
		
		socket.close();
		System.out.print("B端已退出");
	}
}
