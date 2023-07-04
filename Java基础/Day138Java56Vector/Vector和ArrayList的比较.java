package Day138Java56Vector;

public class Vector和ArrayList的比较 {
	public static void main(String[] args) {
		/*
		 *                    底层结构             版本          线程安全（同步）效率                                     扩容倍数
		 *  ArrayList         可变数组            jdk1.2           不安全，效率高              若无参构造器，第一次10，从第二次开始1.5倍扩容，若有参构造器，1.5倍扩容
		 *  
		 *  Vector       可变数组（Object[]）     jdk1.0            安全，效率不高              若无参，默认10，满后两倍扩容；若制指定大小，则每次直接2倍扩容
		 */
	}
}
