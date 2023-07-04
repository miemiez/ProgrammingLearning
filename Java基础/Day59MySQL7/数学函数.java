package Day59MySQL7;

public class 数学函数 {
	/*
	 * 数学相关函数
	 *     1.ABS(num) 
	 *         绝对值
	 *             SELECT ABS(-10) FROM dual
	 *             
	 *     2.BIN(decimal_number)
	 *         十进制转二进制
	 *             SELECT BIN(10) FROM dual
	 *             
	 *     3.CEILING(number2)
	 *         向上取整，得到比number2大的最小整数
	 *             SELECT CEILING(1.1) FROM dual
	 *     
	 *     4.CONV(number2,from_base,to_base)
	 *         进制转换
	 *             SELECT CONV(8,10,2) FROM dual 【含义：8是十进制的8，转成2进制输出】
	 *             SELECT CONV(8,16,2) FROM dual 【含义：8是16进制的8，转成2进制输出】
	 *             
	 *     5.FLOOR(number2)
	 *         向下取整，得到比number2小的最大整数
	 *             SELECT FLOOR(1.1) FROM dual
	 *             
	 *     6.FORMAT(number,decimal_places)
	 *         保留小数位数（四舍五入）【ROUND(number) 四舍五入取整，结果为整数】
	 *             SELECT FORMAT(AVG(chinese),2) FROM student 【含义：取chinese平均值，保留小数位至后两位】
	 *             
	 *     7.HEX(DecimalNumber)
	 *         转十六进制
	 *         
	 *     8.LEAST(number,number2[,...])
	 *         求最小值
	 *             SELECT LEAST(0,1,-10,5) FROM dual
	 *     
	 *     9.MOD(numerator,denominator) //MOD(分子,分母)
	 *         求余
	 *             SELECT MOD(10,3) FROM dual
	 *             
	 *     10.RAND([seed])
	 *         RAND([seed])其范围为0<=v<=1.0
	 *             (1)如果使用rand()每次返回不同的随机数，在0 <= v <= 1.0
	 *             (2)如果使用rand(seed) 返回随机数，范围0 <= v <= 1.0，如果seed不变，该随机数也不变【一个seed对应一个随机数】
	 */
}
