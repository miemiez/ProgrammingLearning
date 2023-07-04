package Day44Socket3;

public class netstat指令 {
	public static void main(String[] args) {
		/*
		 * 1.netstat -an 可以查看当前主机网络情况，包括【端口监听】情况和【网络连接】情况
		 * 2.netstat -an | more可以分页显示
		 * 3.要求在dos控制台下执行（win + r键）
		 * 4.ctrl + c键：退出
		 * 5.netstat -anb | more可以分页查看当前主机的网络情况，并显示是哪个程序正在监听某个端口（但是这里需要以管理员身份运行）
		 * 说明：
		 * (1)Listening表示某个端口在监听
		 * (2)如果有一个外部程序（客户端）连接到该端口，就会显示一条连接信息
		 */
	}
}
