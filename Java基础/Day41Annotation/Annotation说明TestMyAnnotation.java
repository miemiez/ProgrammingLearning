package Day41Annotation;

/*
 * 1.注解，或者叫做注释类型，英文单词是：Annotation
 * 2.注释Annotation是一种引用数据类型。编译之后也是生成xxx.class文件
 * 3.定义注解，语法格式：
 *     [修饰符列表] @interface 注解类型名{
 *     
 *     }
 * 4.注解怎么用，用在什么地方：
 *     （1）注解使用时的语法格式：
 *         @注解类型名
 *     （2）注解可以出现在类上，属性上，方法上，变量上等...注解还可以出现在注解类型上。
 * 5.JDK内置了的注解：
 *     java.lang包下的注释类型：
 *         Deprecated：用@Deprecated注释的程序元素，不鼓励程序员使用这样的元素
 *                     通常是因为它很危险或存在更好的选择。
 *         Override：表示一个方法声明打算重写超类中的另一个方法声明。
 *         SuppressWarnings：指示应该在注释元素（以及包含在该注释元素中的所有程序元素）中取消显示指定的编译器警告。
 * 6.元注解：
 *     用来标注“注解类型”的“注解”，称为元注解。
 *     常见的元注解：
 *         （1）Target：用来标注“注解类型”的注解，这个注解可以用来标注“被标注的注解”可以出现在哪些位置上；
 *                      例如：@Target(ElementType.METHOD)：表示“被标注的注解”只能出现在方法上
 *         （2）Retention：也是用来标注“注解类型”的“注解”，这个Retention注解用来标注“被标注的注解”最终保存在哪里。
 *                         例如：@Retention(RetentionPolicy.SOURCE)：表示该注解只被保留在java源文件中
 *                               @Retention(RetentionPolicy.CLASS)：表示该注解被保存在class文件中
 *                               @Retention(RetentionPolicy.RUNTIME)：表示该注解被保存在class文件中，并且可以被反射机制读取
 * 7.注解在开发中的作用：
 *     需求（见MyAnnotation3/TestMyAnnotation3）：
 *         假设有这样一个注解：@Id，只能出现在类上，当这个类上有这个注解的时候，
 *         要求这个类中必须有一个int类型的id属性，如果没有这个属性就报异常，如果有这个属性则正常执行
 */

public class Annotation说明TestMyAnnotation {
	@MyAnnotation
	private int no;
	
	@MyAnnotation
	public Annotation说明TestMyAnnotation() {
		
	}
	
	@MyAnnotation
	public static void m1() {
		@MyAnnotation
		int i = 100;
	}
	
	@MyAnnotation
	public void m2(@MyAnnotation String name,@MyAnnotation int age) {
		
	}
}

@MyAnnotation
interface MyInterface {
	
}

@MyAnnotation
enum Season {
	SPRING,SUMMER,AUTUMN,WINTER
}

@MyAnnotation
@interface OtherAnnotation {
	
}