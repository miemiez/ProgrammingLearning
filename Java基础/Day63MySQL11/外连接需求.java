package Day63MySQL11;

public class 外连接需求 {
	/*
	 * 作用于多表查询
	 * 
	 * 列出部门名称和这些部门的员工名称和工作，同时要求 显示出没有员工的部门（需要使用外连接）
	 *     外连接：
	 *         （1）左外连接（如果左侧的表完全显示，就是左外连接）：左边的表和右边的表，哪怕没有匹配的记录，也会显示出来
	 *             语法：select ... from 表1 left join 表2 on 条件
	 *         （2）右外连接（如果右侧的表完全显示，就是右外连接）
	 *             语法：select ... from 表1 right join 表2 on 条件
	 *         
	 * 
	 * //表stu
	 * CREATE TABLE stu(id INT,`name` VARCHAR(32));
	 * INSERT INTO stu VALUES(1,'jack'),(2,'tom'),(3,'kity'),(4,'nono');
	 * 
	 * //表exam
	 * CREATE TABLE exam(id INT,grade INT);
	 * INSERT INTO exam VALUES(1,56),(2,76),(11,8)
	 * 
	 * 使用左外连接（显示所有人的成绩，如果没有成绩，也要显示该人的姓名和id号，成绩显示为空）
	 *     SELECT `name`,stu.id,grade FROM stu,exam WHERE stu.id = exam.id;
	 *     改成左外连接为：
	 *     SELECT `name`,stu.id,grade FROM stu LEFT JOIN exam ON stu.id = exam.id;
	 *     改成右外连接为：
	 *     SELECT `name`,stu.id,grade FROM stu RIGHT JOIN exam ON stu.id = exam.id;
	 *
	 *
	 * 练习：
	 *     列出部门名称和这些部门的员工信息（名字和工作），同时列出那些没有员工的部门
	 *     左外连接：
	 *         SELECT dname,ename,job FROM emp RIGHT JOIN dept ON emp.deptno = dept.deptno
	 *     右外连接：
	 *         SELECT dname,ename,job FROM deptno LEFT JOIN emp ON dept.deptno = emp.deptno
	 *         
	 *
	 * 小结：
	 *     在实际的开发中，绝大多数的情况下使用的是前面学过的连接（内连接）
	 */
}
