package Day71MySQL19练习;

public class MySQL练习4 {
	/*
	 * （1）列出至少有一个员工的所有部门
	 *     SELECT dname FROM dept GROUP BY deptno HAVING COUNT(*) >= 1;
	 * （2）列出薪金比“SMITH”多的所有员工
	 *     SELECT * FROM emp WHERE sal > (SELECT sal FROM emp WHERE ename = "SMITH");
	 * （3）列出受雇日期晚于其直接上级的所有员工
	 *     SELECT * FROM emp worker,emp leader WHERE worker.mgr = leader.empno AND worker.hiredate > leader.hiredate;
	 * （4）列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门
	 *     SELECT dname,emp.* FROM dept LEFT JOIN emp ON dept.deptno = emp.empno;
	 * （5）列出所有“CLERK”（办事员）的姓名及其部门名称
	 *     SELECT ename,dname FROM emp,dept WHERE job = 'CLERK' AND emp.deptno = dept.deptno;
	 * （6）列出最低薪金大于1500的各种工作
	 *     SELECT job,MIN(sal) AS '最低薪金' FROM emp GROUP BY job HAVING MIN(sal) > 1500;
	 * （7）列出在部门“SALES”销售部工作的员工的姓名
	 *     SELECT ename FROM emp,dname WHERE dname = 'SALES' AND emp.deptno = dept.deptno;
	 * （8）列出薪金高于公司平均薪金的所有员工
	 *     SELECT * FROM emp WHERE sal > (SELECT AVG(sal) FROM emp);
	 *  
	 * （9）列出与“SCOTT”从事相同工作的所有员工
	 *     SELECT * FROM emp WHERE job = (SELECT job FROM emp WHERE ename = "SCOTT");
	 * （10）列出薪金高于所在部门30的工作的所有员工的薪金的员工姓名和薪金
	 *     SELECT ename,sal FROM emp WHERE sal > all(SELECT sal FORM emp WHERE deptno = 30);
	 * （11）列出在每个部门工作的员工数量，平均工资和平均服务期限
	 *     SELECT deptno,COUNT(*),AVG(sal),AVG(DATEDIFF(NOW(),hiredate)) FROM emp GROUP BY deptno;
	 * （12）列出所有员工的姓名，部门名和工资
	 *     SELECT ename,dname,sal FROM emp,dept WHERE emp.deptno = dept.deptno;
	 * （13）列出所有部门的详细信息和部门人数
	 *     SELECT dept.*,temp.c FROM dept,(SELECT COUNT(*) AS c,deptno FORM emp GROUP BY deptno) temp;
	 * （14）列出各种工作的最低工资
	 *     SELECT MIN(sal),job FROM emp GROUP BY job;
	 * （15）列出MANAGER（经理）的最低薪金
	 *     SELECT MIN(sal) WHERE job = 'MANAGER';
	 * （16）列出所有员工的年工资，按年薪从低到高排序
	 *     SELECT ename,(sal*12+IFNULL(bonus,0)) AS "ANNUAL SALARY' FROM emp ORDER BY "ANNUAL SALARY"; 
	 */
}
