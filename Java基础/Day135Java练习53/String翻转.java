package Day135Java练习53;

public class String翻转 {
	public static void main(String[] args) {
		/*
		 * （1）将字符串中指定部分进行反转。比如将“abcdef”反转为“aedcbf”
		 * （2）编写方法public static String reverse(String str,int start,int end)搞定
		 */
		String str = "abcdef";
		str = reverse(str,2,5);
		System.out.println(str);
	}
	
	public static String reverse(String str,int start,int end) {
		String target = str.substring(start - 1,end);
		String result = "";
		char[] cArr = target.toCharArray();
		String strS = str.substring(0,start - 1);
		String strE = str.substring(end);
		char temp = ' ';
		
		for(int i = 0,j = cArr.length - 1;i < j;i++,j--) {
			temp = cArr[j];
			cArr[j] = cArr[i];
			cArr[i] = temp;
		}
		return result.concat(strS).concat(new String(cArr)).concat(strE);
	}
}
