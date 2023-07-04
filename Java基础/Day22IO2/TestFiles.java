package Day22IO2;

import java.io.File;
import java.io.IOException;

public class TestFiles {
	public static void main(String[] args) throws IOException {
		//递归算法遍历目录下的所有内容
		File file1 = new File("E:\\JAVAIO\\File01");
		File file2 = new File(file1,"Test");
		File file3 = new File(file1,"text01.java");
		File file4 = new File(file1,"text02.java");
		File file5 = new File(file2,"Test01");
		File file6 = new File(file2,"test01.txt");
		File file7 = new File(file2,"test02.txt");
		
		file1.mkdir();
		file2.mkdir();
		file3.createNewFile();
		file4.createNewFile();
		file5.mkdir();
		file6.createNewFile();
		file7.createNewFile();
		
		factorial(file1);
		
		//递归算法删除文件
		deletes(file1);
	}
	
	public static void factorial(File file) {
		File[] files = file.listFiles();
		if(files == null) {
			return;
		}
		for(File f:files) {
			if(f.isDirectory()) {
				factorial(f);
			}else if(f.isFile()) {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
	
	public static void deletes(File file) {
		File[] files = file.listFiles();
		if(files == null) {
			file.delete();
		}
		for(File f:files) {
			if(f.isDirectory()) {
				deletes(f);
				f.delete();
			}else if(f.isFile()) {
				f.delete();
			}
		}
		file.delete();
	}
}
