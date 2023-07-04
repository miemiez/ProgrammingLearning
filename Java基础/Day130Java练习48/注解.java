package Day130Java练习48;

public @interface 注解 {
	//类比接口结构去记忆
	
	//属性：公有 静态 常量 属性
	public static final String s1 = "a";//可以写但是没什么用
	//作用来说 接口（定义规则，其他类来实现）  注解【搬运信息，用户把信息给到注解对象，注解把信息传递给读取注解的人，所以注解不是写死的（常量）但也可以写】
	
	//方法：公有 抽象 方法 default特殊
	public abstract String test();
	//特殊要求：方法不能有参数，并且方法必须有返回值（void不行），返回值只能是基础类型，String类型和枚举类型，（基础类型，String类型和枚举类型）的数组
	
	//没有块 没有构造器
}
