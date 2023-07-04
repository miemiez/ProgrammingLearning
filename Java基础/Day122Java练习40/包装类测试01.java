package Day122Java练习40;

public class 包装类测试01 {
	public static void main(String[] args) {
		Double d = 100d;//√，自动装箱Double.valueOf(100d);
		Float f = 1.5f;//√，自动装箱Float.valueOf(1.5f;
		Object obj1 = true?new Integer(1):new Double(2.0);//【三元运算符是一个整体】
		System.out.println(obj1);//1.0，因为三元运算符使用时，会将【true?new Integer(1):new Double(2.0)】这个看作一个整体，这里精度最高的是Double，所以会提高优先级
	}
}
