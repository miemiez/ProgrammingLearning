package Day70MySQL18练习;

public class MySQL练习3 {
	/*
	 * （1）显示不带有“R”的员工的姓名：
	 *     SELECT ename FROM emp WHERE INSTR(ename,'R') = 0;
	 * （2）显示所有员工姓名的前三个字符
	 *     SELECT LEFT(ename,3) FROM emp;
	 * （3）显示所有员工的姓名，用a替换所有“A”
	 *     SELECT REPLACE(ename,'A','a') FROM emp;
	 * （4）显示满10年服务年限的员工的姓名和受雇日期
	 *     SELECT ename,hiredate FROM emp WHERE DATE_SUB(NOW(),INTERVAL 10 YEAR) <= hiredate;
	 * （5）显示员工的详细资料，按姓名排序
	 *     SELECT * FROM emp ORDER BY ename;
	 * （6）显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面
	 *     SELECT ename,hiredate FROM emp ORDER BY hiredate;
	 *     
	 * （7）显示所有员工的姓名，工作和薪金，按工作降序排序，若工作相同则按薪金排序
	 *     SELECT ename,job,sal FROM emp ORDER BY job DESC,sal;
	 * （8）显示所有员工的姓名，加入公司的年份和月份，按受雇日期所在月排序，若月份相同则将最早年份的员工排在最前面
	 *     SELECT ename,CONCAT(YEAR(hiredate),'-',MONTH(hiredate)) ORDER BY MONTH(hiredate),YEAR(hiredate);
	 * （9）显示在一个月为30天的情况所有员工的日薪金，忽略余数
	 *     SELECT ename,FLOOR(sal/30,0) FORM emp;
	 * （10）找出在（任何年份的）2月受聘的所有员工
	 *     SELECT * FROM emp WHERE MONTH(hiredate) = 2;
	 * （11）对于每个员工，显示其加入公司的天数
	 *     SELECT ename,DATEDIFF(NOW(),hiredate) FROM emp;
	 *     
	 * （12）显示姓名字段的任何位置含有“A”的所有员工的姓名
	 *     SELECT ename FROM emp WHERE ename LIKE '%A%';
	 * （13）以年月日的方式显示所有员工的服务年限（大概）
	 *     SELECT ename,FLOOR(DATEDIFF(NOW(),hiredate) / 365) AS "工作年",FLOOR(DATEDIFF(NOW(),hiredate) % 365 / 30) AS "工作月",DATEDIFF(NOW(),hiredate) % 31 AS "工作天" FROM emp;
	 */
}
