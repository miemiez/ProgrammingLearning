package Day62MySQL10;

public class 单行和多行子查询 {
		/* 
		 * 子查询
		 *     是指嵌入在其他sql语句中的select语句，也叫嵌套查询
		 * 
		 * 单行子查询：
		 *     是指返回一行数据的子查询语句
		 *     如何显示与员工1同一部门的所有员工
		 *         分析：1.先查询到员工1的部门号
		 *               2.把select语句当作一个子查询来使用
		 *         SELECT * FROM emp
		 *                WHERE deptno = (
		 *                             SELECT deptno FROM emp WHERE ename = '员工1')
		 * 
		 * 
		 * 多行子查询（使用关键字IN）：
		 *     是指返回多行数据的子查询，需要使用关键字 IN
		 *     如何查询和部门10的工作相同，但是不含10号部门自己的雇员信息
		 *         SELECT * FROM emp
		 *                WHERE work IN (
		 *                            SELECT DISTINCT work FROM emp WHERE depthon = 10) AND depton != 10
		 */
}
