package Day122Java练习40;

public class 包装类测试02 {
	public static void main(String[] args) {
		Object obj2;
		if(true) {
			obj2 = new Integer(1);
		}else {
			obj2 = new Double(2.0);
		}
		System.out.println(obj2);//1，分别计算
	}
}
