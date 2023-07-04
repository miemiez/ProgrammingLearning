package Day41Annotation;

public @interface MyAnnotation定义属性 {
	/*
	 * 我们通常在注释当中可以定义属性，以下这个是“MyAnnotation定义属性”的name,age,favour...属性
	 * 看着像1个方法，但实际上我们称之为属性name,age,favour...
	 * @return
	 * 
	 * 属性的类型可以是：
	 *     byte,short,int,long,float,double,boolean,char,String,Class,枚举类型
	 *     以及以上每一种的数组形式
	 */
	String name();
	int age();
	String favour() default "talk";//给favour这个属性一个“talk”默认值
	String[] strArr();
	Seasons[] seasons();
	Seasons season();
}
