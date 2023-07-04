package Day113Java练习31;

public class 枚举练习 {
	public static void main(String[] args) {
		Gender boy = Gender.BOY;//【√】
		Gender boy2 = Gender.BOY;//【√】
		System.out.println(boy);//boy.toString();【本质上是调用java.lang.Enum类中的toString()方法】返回值为BOY
		System.out.println(boy2 == boy);//true
	}
}

enum Gender {
	BOY,GIRL
}