package Day124Java练习42;

public class 字符串的特性1 {
	public static void main(String[] args) {
		/*
		 * 1）String是一个final类，代表不可变的字符序列
		 * 2）字符串是不可变的，一个字符串对象一旦被分配，其内容是不可变的
		 */
		
		//题目一：
		String s1 = "hello"; 
		s1 = "haha";//s1指向的是常量池中的“haha”对象，但是常量池中有两个对象“hello”和“haha”，“hello”不会因为s1指向了“haha”而被改变
		//创建了两个对象
		
		//题目二：
		String a = "hello" + "abc";//==> 优化等价于String a = "helloabc";
		//创建了1个对象
		
		//题目三：
		String a1 = "hello";
		String b1 = "abc";
		String c = a1 + b1;
		/* c的创建过程【底层】
		 * 1.先创建一个StringBuilder sb = new StringBuilder();
		 * 2.执行sb.append("hello");
		 * 3.sb.append("abc");
		 * 4.String c = sb.toString();
		 * 最后其实是c指向堆中的对象（String）value[] -> 池中的“helloabc”
		 */
		/*
		 * 【重要规则】
		 * String c1 = "ab" + "cd";
		 * 常量相加，看的是池
		 * String c1 = a + b;
		 * 变量相加，是在堆中
		 */
		String d = "helloabc";
		String e = "hello" + "abc";//直接看池，e指向常量池
		System.out.println(c == d);//F
		System.out.println(d == e);//T
		//创建了4个对象（算上sb）
	}
}
