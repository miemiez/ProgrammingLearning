package Day126Java练习44;

public class StringBuffer构造器 {
	public static void main(String[] args) {
		//构造器一：创建一个容量大小为16的char[]，用于存放字符内容
		StringBuffer stringBuffer1 = new StringBuffer();
		
		//构造器二：通过构造器指定char[]大小
		StringBuffer stringBuffer2 = new StringBuffer(100);
		
		//构造器三：当前字符串的大小+16，下列代码创建的容量大小为5+16=21
		StringBuffer stringBuffer3 = new StringBuffer("hello");
	}
}
