package Day120Java练习38;

public class Throws细节 {
	/*
	 * 1.对于编译异常，程序中必须处理，比如try-catch或者throws
	 * 2.对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
	 * 3.子类重写父类的方法时，对抛出的异常的规定：子类重写的方法，所抛出的异常类型要么和父类抛出的异常一致，
	 *   要么是父类抛出的异常的类型的子类型
	 * 4.在throws过程中，如果有方法try-catch，就相当于处理异常，就可以不必throws
	 */
}
