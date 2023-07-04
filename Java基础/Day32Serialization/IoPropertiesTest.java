package Day32Serialization;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class IoPropertiesTest {
	public static void main(String[] args) throws IOException {
		/*
		 * Properties是一个Map集合，key和value都是String类型
		 * 想将E:\\JAVAIO\\File01\\userinfo.properties文件中的数据加载到Properties对象当中
		 * 
		 * 作用：
		 *     以后值经常变动的信息可以尽量不写在java程序中，将来在改变的时候，java程序就需要重新编译
		 *     所以值经常变动的信息可以写在一个文件中，将来要读取值的时候，可以读取这个文件来动态的获取值，而程序不需要改动
		 */
		
		/*
		 * 步骤：
		 *     1.需要新建一个输入流对象
		 *     2.新建一个Map集合（Properties）
		 *     3.调用Properties对象的load方法将文件中的数据加载到Map集合中
		 */
		
		/*
		 * IO+Properties的联合应用：
		 * 非常好的一个设计理念：
		 *     以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取
		 *     奖来只需要修改这个文件的内容，而java代码不需要改动，不需要重新编译，服务器也不需要重新启动，就可以拿到动态的信息
		 *     
		 * ！！！类似于以上机制的这种文件被称之为：配置文件！！！
		 * 并且当配置文件中的内容格式为：
		 *     key=value
		 *     key=value
		 *     的时候，就把这种文件叫做属性配置文件
		 *     
		 *     java规范中有要求：属性配置文件建议以：properties结尾，但这不是必须的；
		 *     这种以.properties结尾的文件在java中被称为：属性配置文件
		 *     其中Properties是专门存放属性配置文件的一个类
		 *     
		 *     当属性配置文件的key重复的时候，value会自动覆盖
		 */
		FileReader freader = new FileReader("E:\\JAVAIO\\File01\\userinfo.properties");
		Properties pro = new Properties();
		pro.load(freader);//相当于文件中的数据顺着管道加载到Map集合中，其中等号左边做key，等号右边做value
		String str01 = pro.getProperty("username");//相当于获取key为username的值
		String str02 = pro.getProperty("password");//相当于获取key为password的值
		System.out.println(str01);
		System.out.println(str02);
		freader.close();
	}
}
