package Day112Java练习30;

public class 匿名内部类 {
	public static void main(String[] args) {
		/*
		 * （1）本质是类
		 * （2）内部类
		 * （3）该类没有名字
		 * （4）同时还是一个对象
		 * 说明：匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名
		 *     匿名内部类基本语法
		 *     new 类或接口(参数列表){
		 *         类体
		 *     };
		 */
		IA lion = new IA() {

			@Override
			public void cry() {
				System.out.println("狮吼...");
			}
			
		};
		//底层会分配类名【匿名内部类$1】给这个匿名内部类，
		//并且在创建匿名内部类【匿名内部类$1】的同时，立刻马上就创建了它的实例，并且把地址返回给lion
		//匿名内部类使用一次就不能再使用了，lion还是能继续被调用
		System.out.println("lion的运行类型 = " + lion.getClass());
		lion.cry();
		lion.cry();
	}
}

interface IA{
	void cry();
}