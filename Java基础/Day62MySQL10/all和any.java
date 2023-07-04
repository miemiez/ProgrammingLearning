package Day62MySQL10;

public class all和any {
	/*
	 * 如何显示工资比部门30的所有员工的工资高的员工的信息
	 *     (1)SELECT *  FROM emp
	 *            WHERE salary > all (SELECT salary FROM emp WHERE depton = 30)
	 *            
	 *     (2)SELECT * FROM emp
	 *            WHERE salary > (SELECT MAX(salary) FROM emp WHERE depton = 30)
	 *            
	 * 如何显示工资比部门30的任意员工工资高的员工的信息
	 *     (1)SELECT * FROM emp
	 *               WHERE salary > any(SELECT salary FROM emp WHERE depton = 30)
	 *     (2) SELECT * FROM emp
	 *               WHERE salary > (SELECT MIN(salary) FROM emp WHERE depton = 30)
	 */
}
