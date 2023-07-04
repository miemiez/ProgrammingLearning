package Day59MySQL7;

public class 统计函数 {
	/*
	 * mysql统计函数（count）
	 *     1.统计一个班级共有多少学生
	 *         SELECT COUNT(*) FROM student
	 *     2.统计数学成绩大于90的学生有多少个？
	 *         SELECT COUNT(*) FROM student WHERE math > 90
	 *     3.统计总分大于250的人数有多少？
	 *         SELECT COUNT(*) FROM student WHERE (chinese+english+math) > 250
	 *     4.count(*)和count(列)的区别
	 *         count(*)：返回满足条件的记录的行数
	 *         count(列)：统计满足条件的某列有多少个，但是会排除为null的情况
	 *         
	 * mysql合计函数（sum）
	 *     1.统计一个班级数学总成绩
	 *         SELECT SUM(math) FROM student
	 *     2.统计一个班级语文，英语，数学各科的总成绩
	 *         SELECT SUM(chinese),SUM(english),SUM(math) FROM student
	 *     3.统计一个班级语文，英语，数学的成绩总和
	 *         SELECT SUM(chinese+english+math) FROM student
	 *     4.统计一个班级语文成绩平均分
	 *         SELECT SUM(chinese+english+math)/COUNT(*) FROM student
	 * 
	 * mysql平均函数（avg）
	 *     1.求一个班级数学平均分
	 *         SELECT AVG(math) FROM student
	 *     2.求一个班级总分平均分
	 *         SELECT AVG(chinese+english+math) FROM student
	 *         
	 * mysql最值函数（max/min）
	 *     1.求一个班级的最高分和最低分（数值范围在统计中特别有用）
	 *         SELECT MAX(chinese+english+math),MIN(chinese+english+math) FROM student
	 */
}
