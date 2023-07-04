package Day70MySQL18练习;

public class MySQL练习2 {
	/*
	 * (1)选择部门30中的所有员工
	 *     SELECT DISTINCT ename FROM dept WHERE deptno = 30;
	 * (2)列出所有办事员（CLERK）的姓名，编号和部门编号
	 *     SELECT ename,empno,deptno,job FROM emp WHERE job = 'CLERK';
	 * (3)找出奖金高于薪水的员工
	 *     SELECT * FROM emp WHERE IFNULL(bonus,0) > sal;
	 * (4)找出奖金高于薪水60%的员工
	 *     SELECT * FROM emp WHERE IFNULL(bonus,0) > sal*0.6;
	 * (5)找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料
	 *     SELECT * FROM dept WHERE (job = 'MANAGER' AND deptno = 10) OR (job = 'CLERK' AND deptno = 20);
	 * (6)找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），还有既不是经理又不是办事员但是薪资大于或等于2000的所有员工的详细资料
	 *     SELECT * FROM dept WHERE (job = 'MANAGER' AND deptno = 10) OR (job = 'CLERK' AND deptno = 20)
	 *                                                                OR (job <> 'MANAGER' AND job <> 'CLERK' AND sal >=2000);
	 * (7)找出收取佣金的员工的不同工作
	 *     SELECT DISTINCT job FROM emp WHERE bonus IS NOT NULL;
	 * (8)找出不收佣金或者收取的佣金低于100的员工
	 *     SELECT * FROM emp WHERE bonus IS NULL OR IFNULL(bonus,0) < 100;
	 * (9)找出各月倒数第三天受雇的所有员工【LAST_DAY(日期)，可以返回该日期所在月份的最后一天】
	 *     SELECT * FROM emp WHERE LAST_DAY(hiredate) - 2 = hiredate;
	 * (10)找出早于12年前受雇员工
	 *     SELECT * FROM emp WHERE DATE_ADD(hiredate, INTERVAL 12 YEAR) < NOW();
	 * (11)以首字母小写的方式显示所有员工的姓名
	 *     SELECT CONCAT(LCASE(LEFT(ename,1)),SUBSTRING(ename,2)) FROM emp;
	 * (12)显示正好为5个字符的员工姓名
	 *     SELECT ename FROM emp WHERE LENGTH(ename) = 5;
	 *     SELECT ename FROM emp WHERE ename LIKE '_____';
	 */
}
