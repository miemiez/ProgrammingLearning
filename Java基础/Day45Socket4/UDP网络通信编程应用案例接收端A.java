package Day45Socket4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDP网络通信编程应用案例接收端A {
	/*
	 * 1.编写一个接收端A，和一个发送端B
	 * 2.接收端A在9999端口等待接收数据（receive）
	 * 3.发送端A向接收端B发送数据“hello，明天吃海底捞~”
	 * 4.接收端B接收到发送端A发送的数据，回复“好的，明天地铁口见”，再退出
	 * 5.发送端接收回复的数据，再退出
	 */
	public static void main(String[] args) throws IOException {
		//1.创建一个DatagramSocket对象，准备在9999接收数据
		DatagramSocket datagramSocket = new DatagramSocket(9999);
		
		//2.构建一个DatagramPacket对象，准备接收数据（UDP协议中，一个数据包最大64kb）
		byte[] buf = new byte[1024];
		
		DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
		//3.调用接收方法，将通过网络传输的DatagramPacket对象，填充到datagramSocket.receive(datagramPacket)方法中的，datagramPacket对象中
		//注意：当有数据包发送到本机的9999端口时，就会接收到数据，如果没有数据包发送到本机的9999端口，就会阻塞等待。
		System.out.println("接收端A在等待接收数据");
		datagramSocket.receive(datagramPacket);
		
		//4.把datagramPacket进行拆包，取出数据，并显示
		int length = datagramPacket.getLength();//实际接收到的数据字节长度
		byte[] data = datagramPacket.getData();//接收到的数据内容
		String str = new String(data,0,length);
		System.out.println(str);
		
		byte[] buf2 = "好的，明天地铁口见".getBytes();
		DatagramPacket datagramPacket02 = new DatagramPacket(buf2,buf2.length,InetAddress.getByName("192.168.0.206"),9998);
		
		datagramSocket.send(datagramPacket02);
		
		//5.关闭资源
		datagramSocket.close();
		System.out.print("A端已退出");
	}
}
