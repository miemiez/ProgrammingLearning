package Day41Annotation;

import java.lang.reflect.Method;

/*
 * Deprecated这个注解标注的元素已过时
 * 这个注解主要是告诉其他程序员一个已过时的信息，有更好的解决方案存在
 */
public class TestDeprecated {
	public static void main(String[] args) {
		TestDeprecated t = new TestDeprecated();
		t.doSome();//显示这个方法已过时
		t.doOther();
	}
	
	@Deprecated//申明这个方法已过时
	public void doSome() {
		System.out.println("doSome()方法被调用");
	}
	
	public void doOther() {
		System.out.println("doOther方法被调用");
	}
}

class Test{
	public static void main(String[] args) throws Exception{
		Class testDeprecatedClass = Class.forName("Day41Annotation.TestDeprecated");
		Object o = testDeprecatedClass.newInstance();
		Method doSomeM = testDeprecatedClass.getDeclaredMethod("doSome");
		Method doOtherM = testDeprecatedClass.getDeclaredMethod("doOther");
		Object returnObj = doSomeM.invoke(o);
		Object returnObj2 = doOtherM.invoke(o);
		
		
		TestDeprecated t = (TestDeprecated)o;
		t.doSome();//显示这个方法已过时
		t.doOther();
	}
}
