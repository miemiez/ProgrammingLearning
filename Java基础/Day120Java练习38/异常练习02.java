package Day120Java练习38;

public class 异常练习02 {
	public static void main(String[] args) {
		System.out.println(method());//4
	}
	
    public static int method() {
		int i = 1;
		try {
			i++;
			String[] names = new String[3];
			if(names[1].equals("tom")) {
				System.out.println(names[1]);
			}else {
				names[3] = "XYY";
			}
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			return 2;
		}catch(NullPointerException e) {
			return ++i;//return后面如果是一段语句的话，会先执行后面的
		}finally {
			return ++i;
		}
	}
}
