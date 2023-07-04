package Day62MySQL10;

public class 多表查询的自连接 {
	/*
	 * 自连接：
	 *     自连接是指在同一张表的连接查询[将同一张表看作两张表]，自连接查询一般使用别名（方式：表名 别名）
	 * 
	 * 自连接特点：
	 *     1.把同一张表当作两张表使用
	 *     2.需要给表取别名
	 *     3.如果列名信息不明确的话，建议的给列名也定制别名（列名的别名：列名 AS 别名）
	 *     
	 * 
	 * 思考：显示公司员工和他上级的名字
	 *     分析：1.1员工名字在emp表，上级的名字也在emp表
	 *           1.2员工和上级是通过emp表的mgr列关联的
	 *     SELECT woker.ename AS '职员名',manager.ename AS '上级名' FROM emp worker,emp manager
	 *                 WHERE worker.mgr = manager.empno
	 */
}
