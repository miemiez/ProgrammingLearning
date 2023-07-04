package Day36Reflect2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class 验证反射机制的灵活性 {
	/*
	 * java代码写一遍，再不改变java源代码的基础上，可以做到不同对象的实例化。非常灵活。（符合OCP开闭原则：对扩展开放，对修改关闭）
	 * 后期要学习的是高级框架，而工作过程中，也都是使用高级框架。
	 * 包括：ssh ssm
	 *     Spring SpringMVC MyBatis
	 *     Spring Struts Hibernate
	 *     ...
	 *     这些高级框架底层实现原理：都采用了反射机制，所以反射机制很重要，学会了反射机制有利于理解刨析框架底层的源代码。
	 */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    	FileInputStream fis = new FileInputStream("E:\\JAVAIO\\File01\\classinfo.properties");
    	Properties p = new Properties();
    	p.load(fis);
    	fis.close();
    	String s = p.getProperty("className");
    	System.out.println(s);
    	
    	Class c = Class.forName(s);
    	/*
    	 * 之后如果想创建其他类型的对象，直接在属性配置文件（.properties）文件里面写就行了
    	 * 如果是使用“类名 instance = new 类名();”就将对象类型限定死了，之后改源代码的时候还需要重新修改源代码，重新编码
    	 */
    	Object o = c.newInstance();
    	System.out.println(o);
    }
    
    
}
