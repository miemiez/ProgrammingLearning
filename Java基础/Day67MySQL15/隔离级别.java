package Day67MySQL15;

public class 隔离级别 {
	/*
	 * 事务隔离级别介绍
	 *     1.多个连接开启各自事务操作数据库中数据时，数据库系统要负责隔离操作，以保证各个连接在获取数据时的准确性
	 *     2.如果不考虑隔离性，可能会引发如下问题：
	 *         脏读（dirty read）：当一个事务读取另一个事务尚未提交的修改时，产生脏读
	 *         不可重复读（nonrepeatable read）：同一个查询在同一事务中多次进行，由于其他提交事务所做的修改或删除，每次返回不同的结果集，此时发生不可重复读
	 *         幻读（phantom read）：同一个查询在同一个事务中多次进行，由于其他提交事务所做的插入操作，每次返回不同的结果集，此时发生幻读
	 *         
	 *     事务隔离级别定义了 事务与事务之间的隔离程度
	 *     MySQL隔离级别（4钟）：
	 *         读未提交（Read uncommitted）
	 *         读已提交（Read committed）
	 *         可重复读（Repeatable read）
	 *         可串行化（Serializable）【隔离级别最高，并且会加锁（当当前事务操作一个数据库的时候，其他事务都不能进行操作）】
	 *    
	 * 查看当前mysql的隔离级别：
	 *     SELECT @@tx_isolation;
	 * 把其中一个控制台的隔离级别设置成Read uncommitted
	 *     SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
	 * 开始事务：
	 *     START TRANSACTION
	 * 创建表
	 */
}
