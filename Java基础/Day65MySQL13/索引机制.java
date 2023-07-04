package Day65MySQL13;

public class 索引机制 {
	/*
	 * 索引的原理
	 *     当我们没有索引
	 *         SELECT * FROM emp WHERE id = 1; 这条语句会进行全表扫描，查询速度慢
	 *     使用索引会快是因为
	 *         会形成一个索引的数据结构，比如二叉树
	 *     
	 * 索引的代价
	 *     （1）磁盘占用
	 *     （2）对dml（update delete insert）语句的效率影响（每次执行dml语句，都会对索引进行维护重新，排序）
	 *     
	 * 在项目中，select操作【占90%以上】比update，delete，insert操作多的多，所以就算索引会对dml语句的效率造成影响，但是其中的利大于弊，索引的建立是很有必要的
	 * 
	 */
}
