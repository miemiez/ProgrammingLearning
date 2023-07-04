package Day63MySQL11;

public class 子查询练习 {
	/*
	 * 1.查找每个部门工资高于本部门平均工资的人的资料
	 *     SELECT * FROM emp,(SELECT deptno,AVG(salary) FROM emp GROUP BY deptno) temp WHERE emp.edptno = temp.edptno AND emp.salary > temp.AVG(salary)
	 *     
	 * 2.查找每个部门工资最高的人的详细资料
	 *     SELECT * FROM emp,(SELECT deptno,MAX(salary) FROM emp GROUP BY deptno) temp WHERE emp.deptno = temp.deptno AND emp.salary = temp.MAX(salary)
	 *     
	 * 3.查询每个部门的信息和人员数量
	 *     SELECT *,sum_nub FROM emp,(SELECT COUNT(*) AS sum_num,deptno FROM emp GROUP BY depton) temp WHERE temp.deptno = emp.deptno
	 */
}
