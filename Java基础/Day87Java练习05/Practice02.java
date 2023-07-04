package Day87Java练习05;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 创建一个char类型的26个元素的数组，分别放置'A'-'Z'。使用for循环访问所有元素并打印出来
		 */
		char[] ch = new char[26];
		
		for(int i = 0;i < 26;i++) {
			ch[i] = (char)('A'+ i);
		}
		for(int i = 0;i < 26;i++) {
			System.out.print(ch[i]);
		}
	}
}
