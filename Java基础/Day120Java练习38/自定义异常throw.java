package Day120Java练习38;

public class 自定义异常throw {
	public static void main(String[] args) {
		int age = 180;
		if(age < 18 || age > 120) {
			//这个我们可以通过构造器，设置信息
			throw new AgeException("年龄需要在18~120岁之间");
		}else {
			System.out.println("你的年龄范围正确");
		}
		System.out.println("AAAA");
	}
}

//一般情况下，自定义异常是继承RuntimeException，好处是我们可以使用默认的处理机制，如果不是运行时异常的话，就要在main方法中抛出（throws）异常
class AgeException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7988095689974634071L;

	public AgeException(String message) {
		super(message);
	}
}
