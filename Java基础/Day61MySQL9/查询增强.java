package Day61MySQL9;

public class 查询增强 {
	/*
	 * 查询增强
	 *     1.使用where子句，查找1992.1.1后入学的学生
	 *         在mysql中，日期类型可以直接比较（需要注意格式）
	 *             SELECT * FROM student WHERE school_time > '1992-01-01'
	 *             
	 *     2.使用like操作符（模糊查询）
	 *         %：表示0到多个任意字符   _：表示单个任意字符
	 *         (1)显示字符中有'羊羊'的学生信息
	 *             SELECT * FROM student WHERE `name` LIKE '%羊羊%'
	 *         (2)显示第2字符为'灰'的学生信息
	 *             SELECT * FROM student WHERE `name` LIKE '_灰%"
	 *     
	 *     3.显示姓名为NULL的学生（当为值为NULL的时候，一定要用 IS 关键字，不能用 = ）
	 *         SELECT * FROM student WHERE `name` IS NULL
	 *         
	 *     4.查询表结构
	 *         DESC emp
	 *     
	 *     5.先按照部门号升序再按照雇员的工资降序排列，显示雇员信息（排序过后再排序）
	 *         SELECT * FROM student ORDER BY dept ASC，sal DESC
	 */
}
