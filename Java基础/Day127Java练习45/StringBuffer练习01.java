package Day127Java练习45;

public class StringBuffer练习01 {
	public static void main(String[] args) {
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		System.out.println(sb.length());//4
		
		System.out.println(sb);//null
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1);//空指针异常【底层执行super(str.length + 16)，但是str为空，所以会报空指针异常】
	}
}
