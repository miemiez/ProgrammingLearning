package Day70MySQL18练习;

public class MySQL练习1 {
	/*
	 * (1)SELECT DISTINCT dname FROM dept; --显示所有部门名称
	 * 
	 * (2)SELECT ename,(sal + IFNULL(bonus,0))*13 "Annual Salary" FROM emp;  --显示所有雇员名及其全年收入，13月（公子＋补助），并指定列别名“年收入”
	 * 
	 * (3)SELECT ename,sal FROM emp WHERE sal > 2850;  --显示工资超过2850的雇员姓名和工资
	 * 
	 * (4)SELECT ename,sal FROM emp WHERE sal < 1500 OR sal > 2850  --显示工资不在1500到2850之间的所有雇员名和工资
	 * 
	 * (5)SELECT ename,deptno FROM dept WHERE empno = 7566;  --显示编号为7566的雇员姓名及所在的部门编号
	 * 
	 * (6)SELECT ename,sal FROM emp,dept WHERE (deptno = 10 OR deptno = 30) AND sal > 1500;  --显示部门10和30中工资超过1500的雇员名和工资
	 * 
	 * (7)SELECT ename,job,hiredate WHERE hiredate >= '1991-02-01' AND hiredate <= '1991-05-01' ORDER BY hiredate;
	 *    显示在1991年2月1日到1991年5月1日之间雇佣的雇员名，岗位以及雇佣日期，并以雇佣日期进行排序【默认】
	 * 
	 * (8)SELECT ename,sal,bonus FROM emp WHERE bonus IS NOT NULL ORDER BY sal DESC;
	 *    显示获得补助的所有雇员名，工资以及补助，并以工资降序排序
	 */
}
