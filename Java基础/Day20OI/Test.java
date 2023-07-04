package Day20OI;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		/*
		 * java io 包下
		 * IO 对磁盘中的文件操作有：增加，修改，删除，查询
		 */
		
		//File(String pathname) 通过将给定的（路径名，字符串）转换为抽象路径名来创建新的File实例
		File file1 = new File("E:\\JAVAIO\\file01.txt");
		System.out.println(file1);
		
		//File(String parent,String child) 从（父路径名，字符串）和（子路径名，字符串）创建新的File实例
		File file2 = new File("E:\\JAVAIO\\","file02.txt");
		System.out.println(file2);
		
		//File(File parent,String child)从父抽象路径名和（子路径名，字符串）创建新的File实例
		File file3 = new File("E\\JAVAIO");
		File file4 = new File(file3,"file3.txt");
		System.out.println(file4);
	}
}
