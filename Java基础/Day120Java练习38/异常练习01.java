package Day120Java练习38;

public class 异常练习01 {
	public static void main(String[] args) {
		System.out.println(method());//4
	}
	
	public static int method() {
		try {
			String[] names = new String[3];
			if(names[1].equals("tom")) {
				System.out.println(names[1]);
			}else {
				names[3] = "XYY";
			}
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			return 2;
		}catch(NullPointerException e) {//捕获
			return 3;
		}finally {//必须执行
			return 4;//返回4
		}
	}
}
