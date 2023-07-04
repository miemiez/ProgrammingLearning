package Day20OI;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		File file = new File("E:\\JAVAIO\\File01");
		//file.isDirectory() 返回的是为true，则它是文件夹，如果返回的是为false，则它就不是文件夹
		if(file.isDirectory()) {
			System.out.println("是文件夹");
		}else {
			System.out.println("不是文件夹");
		}
		//file.isFile() 返回的是为true，则它是文件，如果返回的是为false，则它就不是文件
		if(file.isFile()) {
			System.out.println("是文件");
		}else {
			System.out.println("不是文件");
		}
		System.out.println(file.exists());
	}
}
