package Day45Socket4;

public class UDP网络通信编程说明 {
	/*
	 * 1.类DatagramSocket【数据报套接字】和DategramPacket【数据报/数据包】实现了基于UDP协议网络程序。
	 * 2.UDP数据报通过数据报套接字DatagramSocket发送和接收，系统不保证UDP数据报一定能够安全送到目的地，也不能确定什么时候可以抵达。
	 * 3.DatagramPacket对象封装了UDP数据报，在数据报中包含了发送端的IP地址和端口号以及接收端的IP地址和端口号
	 * 4.UDP协议中每个数据报都给出了完整的地址信息，因此无需建立发送发和接收方的连接
	 * 
	 * 1.没有明确的服务端和客户端，演变成数据的发送端和接收端
	 * 2.接收数据和发送数据是通过DatagramSocket对象完成
	 * 3.将数据封装到DatagramPacket对象（封装包），发送
	 * 4.当接收到DatagramPacket对象，需要进行拆包，取出数据
	 * 5.DatagramSocket可以指定在哪个端口接收数据
	 * 
	 * 基本流程：
	 *     1.核心的两个类/对象DatagramSocket与DatagramPacket
	 *     2.建立发送端，接收端（没有服务端和客户端概念）
	 *     3.发送数据前，建立数据包/报DatagramPacket对象
	 *     4.调用DatagramSocket的发送，接收方法
	 *     5.关闭DatagramSocket
	 */
	
}
