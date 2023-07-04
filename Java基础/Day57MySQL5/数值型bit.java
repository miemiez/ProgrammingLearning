package Day57MySQL5;

public class 数值型bit {
	/* 
	 * 1.基本使用：
	 *     mysql> create table t02(num bit(8));
	 *     mysql> insert into t02(1,3);
	 *     mysql> insert into t02 values(2,65);
	 *     
	 * 2.细节说明：
	 *     bit字段显示时，按照 位 的方式显示（bit(m) m在1~64，添加数据范围按照给的位来确定，比如m = 8表示一个字节 0~255）
	 *     查询的时候仍然可以用使用添加的数值
	 *     如果一个值只有0，1可以考虑使用bit(1)，可以节约空间
	 *     位类型，M指定位数，默认值为1，范围1~64
	 *     使用不多
	 */
}
