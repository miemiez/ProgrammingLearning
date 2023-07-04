package Day59MySQL7;

public class 分组统计 {
	/*
	 * mysql分组统计（group by（分组）having（过滤））
	 *     1.按照部门分组来查询
	 *         SELECT AVG(sal),MAX(sal),dept
	 *                FROM emp GROUP BY dept
	 *     2.显示每个部门的每种岗位的平均工资和最低工资
	 *         SELECT AVG(sal),MIN(sal),dept,job
	 *                FROM emp GROUP BY dept,job
	 *     3.显示平均工资低于2000的部门号和它的平均工资 //用别名进行过滤效率更高
	 *         SELECT AVG(sal) AS avg_sal,dept
	 *                FROM emp GROUP BY dept
	 *                         HAVING avg_sal < 2000
	 */
}
