package Day108Java练习26;

public class 代码块使用细节1 {
	/* 1.static代码块也叫静态代码块，作用是对类进行初始化，而且它随着【类的加载】而执行，
	 * 【并且只会执行一次，因为类只会在方法区被加载一次】，如果是普通代码块，每创建一个对象，就执行
	 * 
	 * 2.类什么时候会被加载：
	 *     （1）创建对象实例时（new）
	 *     （2）创建子类对象实例时，父类也会被加载
	 *     （3）使用类的静态成员时（静态属性，静态方法）
	 *     
	 * 3.普通的代码块，在创建对象实例时，会被隐式调用，被创建一次，就被调用一次，
	 *   如果只是使用类的静态成员，普通代码块并不会执行
	 *   
	 * 4.创建一个对象时，在一个类调用顺序是：
	 *     （1）调用静态代码块和静态属性初始化
	 *         （注意：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义顺序调用）
	 *     （2）调用普通代码块和普通属性的初始化
	 *         （注意：普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通变量初始化，则按他们定义顺序调用）
	 *     （3）调用构造方法
	 */
	public static void main(String[] args) {
		//类什么时候会被加载：
		//（1）创建对象实例时（new）
		//A dmkxj1 = new A();
		//（2）创建子类对象实例时，父类也会被加载
		B dmkxj2 = new B();
		//（3）使用类的静态成员时（静态属性，静态方法）,同样，父类也会被加载
		System.out.println(Dog.n1);
	}
}

class A{
	static {
		System.out.println("A的静态代码块被执行");
	}
}

class B extends A{
	static {
		System.out.println("B的静态代码块被执行");
	}
}

class Animal{
	static {
		System.out.println("Animal的静态代码块被执行");
	}
}

class Dog extends Animal{
	public static int n1 = 999;
	
	static {
		System.out.println("Dog的静态代码块被执行");
	}
}
