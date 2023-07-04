package Day108Java练习26;

public class Practice01 {
	/*
	 * 1.main()方法是虚拟机来调用的
	 * 2.java虚拟机需要调用类的main()方法，所以该方法的访问权限必须是public
	 * 3.java虚拟机在执行main()方法时不必创建对象，所以该方法必须是static
	 * 4.该方法接收String类型的数组参数并在该数组中保存，在执行java命名时，是传递给所运行的类的参数【这些参数是执行main程序的时候可以传进去的】
	 */
	public static void main(String[] args) {
		for(int i = 0;i < args.length;i++) {
			System.out.println("第" + (i + 1) + "个参数的值为" + args[i]);
		}
	}
}
