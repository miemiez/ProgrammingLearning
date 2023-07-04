import java.util.StringJoiner;

public class StringFamily {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(12).append(3);//添加数据，并返回对象本身，所以可以采用链式编程来添加元素
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append(123).append(456);//添加数据，并返回对象本身，所以也可以采用链式编程来添加元素
		System.out.println(sb2);
		
		StringJoiner sj = new StringJoiner(",","[","]");//参数从左到右依次为：分隔符，起始符，结束符
		sj.add("123").add("456").add("789");//添加数据，并返回对象本身，所以也可以采用链式编程来添加元素
		System.out.println(sj);
	}
}
