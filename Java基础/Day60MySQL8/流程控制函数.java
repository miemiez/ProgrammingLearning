package Day60MySQL8;

public class 流程控制函数 {
	/* 
	 * 1.IF(表达式1,表达式2,表达式3)：如果表达式1位TRUE，则返回表达式2，否则返回表达式3
	 *     SELECT IF(TRUE,'XYY','LYY') FROM dual
	 * 
	 * 2.IFNULL(表达式1,表达式2)：如果表达式1不为空NULL，则返回表达式1，否则返回表达式2
	 *     SELECT IFNULL(NULL,'FYY') FROM dual
	 * 
	 * 3.SELECT CASE WHEN 表达式1 THEN 表达式2 WHEN 表达式3 THEN 表达式4 ELSE 表达式5 END：【类似多重分支】
	 *     如果表达式1为TRUE，则返回表达式2，如果表达式3为TRUE则返回表达式4，否则返回表达式5
	 *         SELECT CASE WHEN TRUE THEN 'MYY'
	 *                     WHEN TRUE THEN 'NYY' ELSE 'RMM' END
	 * 
	 * 需求：
	 * 查询emp表，如果comm是null，则显示0.0
	 * 如果emp表的job是CLERK则显示职员，如果是MANAGER则显示经理，如果是SALESMAN则显示销售人员，其他正常显示
	 */
}
