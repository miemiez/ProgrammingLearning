package Day20OI;

import java.io.File;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException{
		File file = new File("E:\\JAVAIO\\File01");
		//获取该file类完整路径地址（绝对路径地址）
		System.out.println(file.getAbsolutePath());
		//获取抽象路径名转化路径名字符串
		System.out.println(file.getPath());
		//获取文件或者文件夹的名称
		System.out.println(file.getName());
		
		
		File file1 = new File("E:\\JAVAIO\\File01\\test01.java");
		System.out.println(file1.createNewFile());
		File file2 = new File("E:\\JAVAIO\\File01\\test02.java");
		System.out.println(file2.createNewFile());
		//获取目录下所有内容，返回字符串数组（返回的是字符串类型）
		String[] list = file.list();
		for(String str:list) {
			System.out.println(str);
		}
		//获取目录下所有内容，返回文件数组（返回的是文件类型）但是如果填写的是一个文件路径，则会报错，只能是文件夹路径
		File[] fList = file.listFiles();
		System.out.println("--------------------");
		for(File f:fList) {
			System.out.println(f);
		}
	}
}