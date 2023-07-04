public class TestStringBuffer{
	public static void main(String[] args) {
		//可修改的字符串；
		StringBuffer sb = new StringBuffer(20);
		System.out.println(sb.append("Hello world"));
		System.out.println(sb.insert(8, "java"));
		System.out.println(sb.delete(5,8));
		System.out.println(sb.capacity());
	}
}