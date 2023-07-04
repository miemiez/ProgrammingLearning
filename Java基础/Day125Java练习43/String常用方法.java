package Day125Java练习43;

public class String常用方法 {
	public static void main(String[] args) {
		/*
		 * 1.equals  ->  区分大小写，判断内容是否相等
		 * 2.equalsIgnoreCase  ->  忽略大小写的判断内容是否相等
		 * 3.length  ->  获取字符的个数，字符串的长度
		 * 4.indexOf  ->  获取字符在字符串中第一次出现的索引，索引从0开始，如果找不到，返回-1
		 * 5.lastIndexOf  ->  获取字符在字符串中最后一次出现的索引，索引从0开始，如果找不到，返回-1
		 * 6.substring  ->  截取指定范围的子串
		 * 7.trim  ->  去前后空格
		 * 8.charAt  ->  获取某索引处的字符，注意不能使用Str[index] 这种方式
		 * 9.toUpperCase  ->  转换成大写
		 * 10.toLowerCase  ->  转换成小写
		 * 11.concat  ->  拼接字符串
		 * 12.replace  ->  替换字符串中的字符
		 * 13.split  ->  分割字符串，返回的是字符串数组，对于某些不可分割字符，我们需要转译，如：|,\\等等
		 * 14.toCharArray  ->  转换成字符数组
		 * 15.compareTo  ->  比较两个字符串的大小，如果前者大，则返回正数，后者大，则返回负数，相等则返回0
		 * 16.format  ->  格式字符串 【占位符有：%s字符串；%c字符；%d整型；%.2f浮点型并且替换后进行四舍五入，只会保留小数点后两位】
		 */
		String s1 = "abc";
		String s2 = "fbcsstere";
		String s3 = "abcdefg";
		String s4 = "abddef";
		String s5 = new String("abc");
		String s6 = "def";
		System.out.println(s2.compareTo(s1));//5【（2）】
		System.out.println(s3.compareTo(s1));//4【（3）】
		System.out.println(s4.compareTo(s1));//1【（2）】
		System.out.println(s1.compareTo(s5));//0【（1）】
		System.out.println(s6.compareTo(s1));//3【（2）】
		/*
		 * compareTo比较两个字符串的大小：
		 *     （1）如果长度相同，并且每个字符也相同，则返回0
		 *     （2）如果长度相同或者不相同，但是内容不同，在进行比较时，可以按照ASCII码表取 第一个不同字符的ASCII码的差值
		 *     （3）如果前面的部分相同，就返回，str.length - str.length;
		 */
	}
}
