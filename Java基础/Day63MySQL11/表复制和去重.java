package Day63MySQL11;

public class 表复制和去重 {
	/* 
	 * 表复制：
	 *     有时需要对某个sql语句进行效率测试，需要海量数据时，可以使用表复制为表创建海量数据
	 *     CREATE TABLE my_table01
	 *            (id INT,
	 *             `name` VARCHAR(32),
	 *             sal DOUBLE,
	 *             job VARCHAR(32),
	 *             deptno INT)
	 *     DESC my_table01
	 *     INSERT INTO my_table01 (id,`name`,sal,job,deptno) SELECT empno,ename,sal,job,deptno FROM emp  //把emp表的记录复制到my_table01
	 *     INSERT INTO my_table01 SELECT * FROM my_table01;
	 *     
	 *     
	 * 表去重：
	 *     1.先创建一张表my_table02
	 *     2.让my_table02有重复的记录
	 *     
	 *     CREATE TABLE my_table02 LIKE emp  //这个语句把emp表的结构(列)，复制到my_table02
	 *     DESC my_table02
	 *     INSERT INTO my_table02 SELECT * FROM emp
	 *     
	 *     3.考虑去重my_table02的记录
	 *         思路
	 *         （1）先创建一张临时表my_temp,该表的结构和my_table02一样
	 *         CREATE TABLE my_temp LIKE my_table02
	 *         DESC my_temp
	 *         （2）把my_table02的记录通过DISTINCT关键字处理后，把记录复制到my_temp
	 *         INSERT INTO my_temp SELECT DISTINCT * FROM my_table02
	 *         （3）清除掉my_table02的记录
	 *         DELETE FROM my_table02
	 *         （4）将my_temp的记录复制到my_table02
	 *         INSERT INTO my_table02 SELECT * FROM my_temp
	 *         (5)删除my_temp表
	 *         DROP TABLE my_temp
	 *     
	 *     
	 */
}
