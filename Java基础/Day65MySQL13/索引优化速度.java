package Day65MySQL13;

public class 索引优化速度 {
	/*
	 * 提高数据库性能，索引是最物美价廉的东西，不用加内存，不用改程序，不用调sql，查询速度就可能提高百倍千倍
	 *     CREATE INDEX empno_index ON emp(empno)  --在emp表的empno列创建名为empno_index 的索引（索引也会占用内存）
	 * 
	 * 创建索引后，只对创建了索引的列有效
	 *     SELECT * FROM emp WHERE ename = 'xyy'  -- 由于没有在ename列上创建索引，所以耗时仍然比较久
	 */
}
