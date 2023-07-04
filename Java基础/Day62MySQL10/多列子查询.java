package Day62MySQL10;

public class 多列子查询 {
	/*
	 * 多子列查询：
	 *     是指查询返回多个列数据的子查询语句
	 *     (字段1，字段2...) = (select 字段1,字段2 FROM ...)
	 *     
	 * 查询和学生1数学，语文，英语完全相同的学生
	 *     SELECT * FROM student 
	 *            WHERE (math,chinese,english) = (SELECT math,chinese,english FROM student WHERE sname = '学生1')
	 */
}
