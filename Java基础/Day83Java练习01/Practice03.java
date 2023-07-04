package Day83Java练习01;

public class Practice03 {
	public static void main(String[] args) {
		String book1 = "天龙八部";
		String book2 = "笑傲江湖";
		System.out.println(book1 + book2);//天龙八部笑傲江湖
		
		char c1 = '男';
		char c2 = '女';
		System.out.println(c1 + c2);//char字符的本质是 字符码值，所以最后结果为数字：52906
		
		double price1 = 123.45;
		double price2 = 543.21;
		System.out.println(price1 + price2);//小数相加结果是一个近似值
		int i = (int)price1;
		System.out.println(i);
		
		String str = i + "";
		System.out.println(str);
	}
}
