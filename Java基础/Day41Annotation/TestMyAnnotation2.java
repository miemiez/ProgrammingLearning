package Day41Annotation;

import java.lang.reflect.Method;

public class TestMyAnnotation2 {
	@MyAnnotation2(username = "LHY",password = "123456")
	public void doSome() {
		
	}
	
	public static void main(String[] args) throws Exception{
		@SuppressWarnings("unchecked")
		Class<TestMyAnnotation2> c = (Class<TestMyAnnotation2>)Class.forName("Day41Annotation.TestMyAnnotation2");
		Method m = c.getDeclaredMethod("doSome");
		if(m.isAnnotationPresent(MyAnnotation2.class)) {
			MyAnnotation2 myAnnotation2 = m.getAnnotation(MyAnnotation2.class);
			System.out.println(myAnnotation2.username());
			System.out.println(myAnnotation2.password());
		}
	}
}
