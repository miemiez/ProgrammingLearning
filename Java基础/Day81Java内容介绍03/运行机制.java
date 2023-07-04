package Day81Java内容介绍03;

/**
 * @author 12852
 * @version 1.0
 * 说明文档
 */

public class 运行机制 {
	/*
	 * 编译：
	 *     1.有了java源文件，通过编译器将其编译成JVM可以识别的字节码文件
	 *     2.在该源文件目录下，通过javac编译工具对Hello.java文件进行编译
	 *     3.如果程序没有错误，没有任何提示，但在当前目录下会出现一个class文件，
	 *       该文件称为字节码文件，也是可以执行的java程序。
	 */
	
	/*
	 * 类注释文档可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档，一般写在类，方法
	 * 生成方式：
	 *     javadoc -d 文件夹名 -xx -yy Demo3.java
	 *         例：javadoc -d d:\\temp -author -version 运行机制.java
	 */
}
