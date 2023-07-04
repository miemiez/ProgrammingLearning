package Day61MySQL9;

public class 分页查询 {
	/*
	 * 分页查询（select ... limit start,rows : 表示从start + 1 行开始取，取出rows行，start从0开始计算）
	 * 
	 * 1.按学生的id号升序取出，每页显示3条记录，分别显示第一页，第二页，第三页
	 *     第一页
	 *         SELECT * FROM student
	 *                  ORDER BY id
	 *                  LIMIT 0,3
	 *     
	 *     第二页
	 *         SELECT * FROM student
	 *                  ORDER BY id
	 *                  LIMIT 3,3
	 *     
	 *     第三页
	 *         SELECT * FROM student
	 *                  ORDER BY id
	 *                  LIMIT 6,3
	 * 
	 *     总结：LIMIT 每页显示记录数*（第几页-1），每页显示记录数
	 * 
	 * 2.按学生的id降序取出，每页显示5条记录，分别显示第3页，第5页对应的sql语句
	 *     第一页
	 *         SELECT * FROM student
	 *                  ORDER BY id
	 *                  LIMIT 12,5
	 *                  
	 * 3.显示每个班级的学生总数，平均语文成绩
	 *     SELECT COUNT(*),AVG(chinese) FROM student GROUP BY class
	 * 
	 * 4.显示学生总数，以及没有获得奖励的学生数
	 *     (1)SELECT COUNT(*),COUNT(IF(award IS NULL,1,NULL)) FROM student
	 *     (2)SELECT COUNT(*),COUNT(*) - COUNT(award) FROM student
	 * 
	 * 5.显示老师的总人数（在表中老师有重复，可以用DISTINCT去重）
	 *     SELECT COUNT(DISTINCT teacher) FROM student
	 *     
	 * 6.显示学生语文成绩的最大差值
	 *     SELECT MAX(chinese) - MIN(chinese) FROM student
	 */
}
