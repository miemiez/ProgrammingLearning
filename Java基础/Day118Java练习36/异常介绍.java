package Day118Java练习36;

public class 异常介绍 {
	public static void main(String[] args) {
		/*
		 * Java语言中，将程序执行中发生的不正常情况称为“异常”。（开发过程中的语法错误和逻辑错误不是异常）
		 * 
		 * 执行过程中所发生的异常事件可分为两类
		 *     （1）Error（错误）：Java虚拟机无法解决的严重问题。如：JVM系统内部错误，资源耗尽等严重情况。比如：StackOverflowError【栈溢出】
		 *          和OOM（out of memory）【内存不足】，Error是【严重错误】，程序会崩溃【！！！这种错误无法用异常处理机制来解决！！！】
		 *     （2）Exception：其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。
		 *          例如空指针访问，试图读取不存在的文件，网络连接中断等等，Exception分为两大类：【运行时异常】和【编译时异常】
		 */
	}
}
