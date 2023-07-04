package Day126Java练习44;

public class StringBuilder结构剖析 {
	public static void main(String[] args) {
		/*
		 * String类是保存字符串常量的，每次更新都需要重新开辟空间，效率较低
		 */
		
		String s = new String("");
		for(int i = 0;i < 80000;i++) {
			s += "1";
		}
	}
}
