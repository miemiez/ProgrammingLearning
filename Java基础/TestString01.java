public class TestString01{
	public static void main(String[] args) {
		String str1 = "str01";
		String str2 = "sTr08882";
		String str3 = "  string  ";
		String str4 = "L0H0Y";
		
		//compareTo方法：比较两个字符串是否相等，如果相等则返回0；如果不等则返回第一个不等的字符的Ascii编码差值；
		System.out.println(str1.compareTo(str2));
		//compareToIgnoreCase方法：比较两个字符串是否相等，如果相等则返回0；如果不等则返回第一个不等的字符的Ascii编码差值（不考虑大小写）；
		System.out.println(str1.compareToIgnoreCase(str2));
		//concat方法：等同于str1 + str2；
		System.out.println(str1.concat(str2));
		//charAt方法：根据下标获取字符；
		System.out.println(str1.charAt(3));
		//indexOf方法：索引“1”的起始下标；
		System.out.println(str1.indexOf("1"));
		//contains方法：检测“str1”中是否包含“stra”这个字符串；
		System.out.println(str1.contains("stra"));
		//trim方法：去除字符串两边的空格；
		System.out.println(str3.trim());
		//replace方法：替换；
		System.out.println(str1.replace("r","R"));
		//substring方法：截取一段；
		System.out.println(str1.substring(1,4));
		//split方法：分割；
		String[] arr = str4.split("0");
		for (String x : arr) {
			System.out.print(x);
		}
		System.out.print("\n");
		//toUpperCase方法：转大写；
		System.out.println(str1.toUpperCase());
		//toLowerCase方法：转小写；
		System.out.println(str1.toLowerCase());
	}
}