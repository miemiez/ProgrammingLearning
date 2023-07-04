package Day61MySQL9;

public class 多表笛卡尔集 {
	/*
	 * 多表查询是指基于两个和两个以上表的查询，在实际应用中，查询单个表可能不能满足需求，需要使用多个表
	 * 
	 * 在默认情况下：当两个表查询时，规则
	 *     1.从第一张表中取出一行，和第二张表中的每一行进行组合，返回结果【含有两张表的所有列】
	 *     2.一共返回的记录数为，第一张表行数*第二张表的行数
	 *     3.这样的多表查询默认处理返回的结果，称为笛卡尔集
	 *     4.解决多表的关键就是要写出正确的过滤条件 where，需要程序员进行分析
	 * 
	 * 多表查询练习：
	 *     1.显示雇员名，雇员工资以及所在部门的名称【笛卡尔集】（多表查询的条件不能少于表的个数-1，否则会出现笛卡尔集）
	 *         分析：1.1雇员名，雇员工资来自emp表
	 *               1.2部门的名字，来自dept表
	 *               1.3需求对emp和dept查询
	 *               1.4当我们需要指定显示某个表的列是，需要 表.列表
	 *         SELECT ename,sal,dname,emp.deptno FROM emp,dept
	 *                                           WHERE emp.deptno = dept.deptno
	 *         
	 *     2.如何显示部门号为10的部门名，员工名和工资
	 *         SELECT emo.dname,emo.ename,salary FROM emp,dept
	 *                                           WHERE emp.deptno = dept.deptno AND emp.deptno = 10
	 *         
	 *     3.显示各个员工的姓名，工资，及其工资的级别
	 *         分析：1.1姓名工资来自emp
	 *               1.2工资级别来自sal_level
	 *         SELECT emo.ename,salary,sal_level FROM emp,salgrand
	 *                                           WHERE sal BETWEEN min_level AND max_level
	 */
}
