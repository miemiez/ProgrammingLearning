package Day21IO1;

import java.io.File;

public class CycleToDelete {
	public static void main(String[] args) {
		File file1 = new File("E:\\JAVAIO\\File01");
		if(file1.isDirectory()) {
			System.out.println("删除的路径是一个文件夹目录");
			deletes(file1);
		}else if(file1.isFile()) {
			System.out.println("删除的路径是一个文件");
			delete(file1);
		}
	}
	
	public static void deletes(File file) {
		File[] files = file.listFiles();
		for(File f:files) {
			f.delete();
			System.out.println("删除的文件为：" + f.getAbsolutePath());
		}
		file.delete();
		System.out.println("删除的文件夹目录为：" + file.getAbsolutePath());
	}
	
	public static void delete(File file) {
		file.delete();
	}
}
