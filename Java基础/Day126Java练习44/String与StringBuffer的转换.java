package Day126Java练习44;

public class String与StringBuffer的转换 {
	public static void main(String[] args) {
		//String -> StringBuffer
		String str = "hello tom";
		//方式1：使用构造器
		//注意：返回的才是StringBuffer对象，对str本身没有影响
		StringBuffer stringBuffer = new StringBuffer(str);
		
		//方式2：使用的是append方法
		StringBuffer stringBuffer1 = new StringBuffer();
		stringBuffer1.append(str);
		System.out.println(stringBuffer1);
		
		
		
		//StringBuffer -> String
		StringBuffer stringBuffer2 = new StringBuffer("XYY");
		//方式1：使用StringBuffer提供的toString方法
		String s = stringBuffer2.toString();
		
		//方式2：使用String的构造器
		String s1 = new String(stringBuffer2);
	}
}
