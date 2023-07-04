package Day135Java练习53;

public class 字符串统计 {
	public static void main(String[] args) {
		System.out.println(printName("LI HE YANG"));
	}
	
	public static String printName(String name) {
		String[] strArr = name.split(" ");
		String name2 = strArr[1].substring(0,1);
		return strArr[0].concat(",").concat(strArr[2]).concat(" .").concat(name2);
	}
}
