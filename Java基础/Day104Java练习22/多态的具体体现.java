package Day104Java练习22;

public class 多态的具体体现 {
	/*
	 * 什么是多态，多态的具体体现有哪些？
	 *     多态：方法或对象具有多种形态，是OOP的第三大特征，是建立在封装和继承基础之上
	 *     多态的具体体现：
	 *         1.方法多态
	 *             （1）重载体现多态
	 *             （2）重写体现多态
	 *         2.对象多态
	 *             （1）对象的编译类型和运行类型可以不一致，编译类型在定义时，就确定了，不能变化
	 *             （2）对象的运行类型是可以变化的，可以通过getClass()来查看其运行类型
	 *             （3）编译类型看： = 号的左边；运行类型看： = 号右边
	 */
	public static void main(String[] args) {//举例说明对象多态
		A obj = new BBB();//向上转型
		A obj2 = obj;
		System.out.println("obj的运行类型=" + obj.getClass());//BBB
		obj = new CCC();//向上转型
		CCC c = (CCC)obj;//向下转型
		System.out.println("obj的运行类型=" + obj.getClass());//CCC
		obj = obj2;
		System.out.println("obj的运行类型=" + obj.getClass());//BBB
		
	}
}

class A{
	
}

class BBB extends A{
	
}

class CCC extends A{
	
}
