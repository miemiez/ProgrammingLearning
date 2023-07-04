
public class StringBuilderAnalyse {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());//16
		System.out.println(sb.length());//0
		
		sb.append("abc");
		System.out.println(sb.capacity());//16
		System.out.println(sb.length());//3
		
		sb.append("defghijklmnopqrstuvwxyz");
		System.out.println(sb.capacity());//老容量（16）* 2 + 2 = 34
		System.out.println(sb.length());//26
		
		sb.append(123456789);
		System.out.println(sb.capacity());//老容量（34）* 2 + 2 = 70
		System.out.println(sb.length());//35
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("abcdefghijklmnopqrstuvwxyz0123456789");
		System.out.println(sb2.capacity());//如果一次性添加的字符数组比【老容量（16）* 2 + 2 = 34】大，那么字符数组的容量就为这个数组的长度；36
		System.out.println(sb2.length());//36
		
		sb2.append("abcdef");
		System.out.println(sb2.capacity());//老容量（36）* 2 + 2 = 74
		System.out.println(sb2.length());//42
	}
}
