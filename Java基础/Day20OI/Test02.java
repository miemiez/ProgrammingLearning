package Day20OI;

import java.io.File;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		//public boolean createNewFile() 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新**空文件**（文件）
		File file1 = new File("E:\\JAVAIO\\file01.java");
		//createNewFile 如果能够成功创建文件，则返回true，如果不能够创建文件，则返回false
		try {
			System.out.println(file1.createNewFile());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		//public boolean mkdir() 创建由此抽象路径名命名的**目录**(文件夹)
		File file2 = new File("E:\\JAVAIO\\File01");
		System.out.println(file2.mkdir());
		
		//public boolean mkdirs() 创建由此抽象路径命名的目录，包括任何必须但不存在的父目录（文件夹）
		File file3 = new File("E:\\JAVAIO\\File02\\file");
		System.out.println(file3.mkdirs());
	}
}