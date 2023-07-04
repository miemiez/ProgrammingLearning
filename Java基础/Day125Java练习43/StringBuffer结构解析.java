package Day125Java练习43;

public class StringBuffer结构解析 {
	public static void main(String[] args) {
		/*
		 * 1.java.lang.StringBuffer代表可变的字符序列，可以对字符串内容进行增删
		 * 2.很多方法与String相同，但是StringBuffer是可变长度的
		 * 3.StringBuffer是一个容器
		 * 4.StringBuffer是final类
		 * 5.实现了Serializable接口，可以保存到文件，或网络传输
		 * 6.继承了抽象类：
		 *   AbstractStringBuilder
		 * 7.AbstractStringBuilder属性char[] value，存放的字符序列
		 * 8.StringBuffer保存的是字符串变量，里面的值可以更改，每次
		 *   StringBuffer的更新实际上可以更新内容，不同每次更新地址，效率较高【只有在空间不够的时候，扩容的时候才会更换地址】
		 */
		StringBuffer sb = new StringBuffer("XYY");
	}
}
