package Day67MySQL15;

public class 设置隔离级别 {
	/* 
	 * 查看当前会话隔离级别
	 *     SELECT @@tx_isolation;【MySQL5.7】
	 *     SELECT @@transaction_isolation【MySQL8.0】
	 * 设置隔离级别：
	 *     SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
	 *                                             READ COMMITTED
	 *                                             REPEATABLE READ
	 *                                             SERIALIZABLE
	 * MsSQL 默认的事务隔离级别是repeatable read，一般情况下，没有特殊要求，没有必要修改（因为该级别可以满足绝大部分项目需求）
	 */
}
