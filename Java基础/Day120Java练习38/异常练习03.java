package Day120Java练习38;

public class 异常练习03 {
	public static void main(String[] args) {
		System.out.println(method());//i=4  3
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
			System.out.println(e.getStackTrace());
			return ++i;//i=3 => 保存临时变量 temp = 3
		}finally {
			++i;//i=4
			System.out.println("i=" + i);//i=4
		}
	}
}
