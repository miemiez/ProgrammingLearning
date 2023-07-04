package Day21IO1;

import java.io.File;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		/*file.delete() 删除文件或者文件夹
		 * 如果删除的路径是一个文件路径，则直接删除
		 * 如果删除的路径是一个文件夹路径，则需要先将该文件夹中的内容删除，才可以删除该文件夹
		 */
		File file = new File("E:\\JAVAIO\\IO1");
		file.mkdirs();
		File file1 = new File(file,"test.java");
		System.out.println(file1.createNewFile());
		File file2 = new File(file,"test1.java");
		System.out.println(file2.createNewFile());
		File file3 = new File(file,"test2.java");
		System.out.println(file3.createNewFile());
		file3.delete();
		System.out.println(file3.exists());//false
		file.delete();
		System.out.println(file.exists());//true(因为此时D:\JAVAIO\IO1文件夹中还存在未被删除的文件，所以需要先将该文件夹中的内容删除，才可以删除该文件夹)
		file1.delete();
		file2.delete();
		file.delete();
		System.out.println(file.exists());//false
	}
}
