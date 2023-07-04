package Day61MySQL9;

public class 多子句查询 {
	/*
	 * 应用案例：
	 *     统计各个部门的平均工资大于1000的，并按照平均工资从高到底排序，最终取出前两行记录
	 *         SELECT * FROM emp GROUP BY salary HAVING AVG(salary) > 1000 ORDER BY AVG(salary) DESC LIMIT  0,2
	 */
}
