package Day134Java练习52;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInteger和BigDecimal类 {
	public static void main(String[] args) {
		/*
		 * 应用场景：
		 *     （1）BigInteger适合保存比较大的整型
		 *     （2）BigDecimal适合保存精度更高的浮点型（小数）
		 */
		/*
		 * 当编程中，需要处理很大的整数，long不够用就可以用BigInteger来解决
		 */
		//long l = 99999999999999999999999999999999999l;
		BigInteger bigInteger01 = new BigInteger("99999999999999999999999999999999999");
		BigInteger bigInteger02 = new BigInteger("100");
		System.out.println(bigInteger01);
		
		/*
		 * 1.在对BigInteger进行加减乘除的时候，需要使用对象的方法，不能直接进行 + - * /【用加减乘除返回的值都是new的一个新的BigInteger对象】
		 */
		bigInteger01 = bigInteger01.add(bigInteger02);
		System.out.println(bigInteger01);//加：add
		System.out.println(bigInteger01.subtract(bigInteger02));//减：subtract
		System.out.println(bigInteger01.multiply(bigInteger02));//乘：multiply
		System.out.println(bigInteger01.divide(bigInteger02));//除：divide
		
		
		/*
		 * 【BigDecimal也是同理】
		 * 但是在做除法的时候如果结果是一个无限循环的小数，就会抛出异常
		 */
		BigDecimal bd01 = new BigDecimal("199.99999999999921111111111887877");
		BigDecimal bd02 = new BigDecimal("1.1");
		/*
		 * 如果是无限循环小数就很可能抛异常
		 * 【解决方法：在调用divide方法时，指定精度即可】
		 */
		System.out.println(bd01.divide(bd02,BigDecimal.ROUND_CEILING));//BigDecimal.ROUND_CEILING：是保留分子的精度
	}
}
