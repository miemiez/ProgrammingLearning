package Day124Java练习42;

public class 字符串的特性3 {
	String str = new String("XYY");
	final char[] ch = {'j','a','v','a'};
	int i = 10;
	/*
	 * 一个方法调用会在栈里压入一个栈帧
	 * 栈帧中有个“局部变量表”的结构，保存局部变量和形参
	 * 这里“局部变量表”里的str指向堆里的一个对象
	 * 【对于Java语言来说，参数传递是建立一个副本】
	 */
	public static void main(String[] args) {
		字符串的特性3 zfctx = new 字符串的特性3();
		int c = 100;
		c = zfctx.i;
		c = 1000;
		System.out.println(zfctx.i);
		zfctx.change(zfctx.str, zfctx.ch,zfctx.i);
		/*
		 * 只要调用一个方法就会产生一个新栈，调用change方法，
		 * 只是把zfctx.str赋值给了str形参，刚开始新栈中的str指向了zfctx.str指向的堆中的value数组
		 * 后面执行str = "java";语句，将新栈中的str指向了常量池中的“java”
		 * 
		 * ch也是一样的道理，只不过ch改变了内容
		 */
		System.out.println(zfctx.str + "and");//XYYand【只是change方法中的str指向了常量池中的“java”，zfctx.str依旧指向堆中的value数组->常量池中的“XYY”】
		System.out.println(zfctx.ch);//hava【它改变了堆中ch数组的值】
		System.out.println(zfctx.i);//10
	}
	
	public void change(String str,char ch[],int i) {
		str = "java";
		ch[0] = 'h';
		i = 100;
	}
}
