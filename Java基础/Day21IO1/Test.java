package Day21IO1;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		/*
		 * 绝对路径：物理硬盘真实存放的路径
		 * 相对路径：是java工程中要访问的文件相当于当前文件的位置
		 */
		File file = new File("test.java");
		//底层自动获取当前项目路径，填充绝对路径
		//C:\Users\12852\eclipse-workspace\JavaWeb\    +    test.java
		System.out.println(file.createNewFile());
		System.out.println(file.getAbsolutePath());//绝对路径
		System.out.println(file.getPath());//相对路径(一般用相对路径更多)
		
		/*
		 * 绝对路径是直接写死的，如果将该代码放入到其他电脑上去运行，没有该路径，则会报错
		 * 但是如果使用的是相对路径，它是动态获取运行项目的路径------相对路径是灵活的，所以使用的更多
		 */
	}
}
