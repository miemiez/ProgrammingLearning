package Day68MySQL16;

public class 存储引擎 {
	/*
	 * MySQL表类型和存储引擎：
	 *     基本介绍：
	 *         1.MySQL的表类型由存储引擎（Storage Engines）决定，主要包括MyISAM，innoDB，Memory等
	 *         2.MySQL数据表主要支持六种类型，分别是：CSV，Memory，ARCHIVE，MRG_MYISAM，MYISAM，InnoDB
	 *         3.这六种又分为两类，一类是“事务安全型”（transaction—safe），比如：InnoDB；
	 *                            其余都属于第二类，称为"非事务安全型"（non-transaction-safe）[myisam和memory]。
	 *         
	 * 查看所有的存储引擎
	 *     SHOW ENGINES
	 *     
	 * 重点说明三种：
	 *     1.MyISAM
	 *         MyISAM不支持事务，也不支持外键，但其访问速度快，对事务完整性没有要求，锁机制是表锁
	 *     2.InnoDB存储引擎提供了具有提交，回滚和崩溃恢复能力的事务安全，
	 *       但比起MyISAM存储引擎，InnoDB写的处理效率差一些，并且会占用更多的磁盘空间以保留数据和索引
	 *     3.Memory存储引擎使用存在内存中的内容来创建表，每个Memory表只实际对应一个磁盘文件，
	 *       Memory类型的表访问非常得快，因为它的数据是存放在内存中的，并且默认使用HASH索引，
	 *       但是一旦服务关闭，表的数据就会全部丢失，但表的结构还在
	 * 
	 * 如何选择表的存储引擎：
	 *     1.如果你的应用不需要事务，处理的只是基本的CRUD操作，那么MyISAM是不二的选择，速度快
	 *     2.如果需要支持事务，选择InnoDB。
	 *     3.Memory存储引擎就是将数据存储在内存中，由于没有磁盘I/O的等待，速度极快，但由于是内存存储引擎，所做的任何修改在服务器重启后都将消失
	 *       （经典用法 用户的在线状态().）
	 * 
	 * 指令修改存储引擎：
	 *     ALTER TABLE `表面` ENGINE = 存储引擎;
	 */
}
