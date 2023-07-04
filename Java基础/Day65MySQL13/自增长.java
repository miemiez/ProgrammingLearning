package Day65MySQL13;

public class 自增长 {
	/*
	 * 在某张表中，存在一个id列（整数），希望在添加记录的时候，该列从1开始，自动的增长
	 *     字段名 整型 primary key auto_increment
	 *     
	 * 演示自增长的使用
	 * 创建表
	 *     CREATE TABLE tab03(id INT PRIMARY KEY AUTO_INCREMENT,
	 *                        email VARCHAR(32) NOT NULL DEFAULT '',
	 *                        `name` VARCHAR(32) NOT NULL DEFAULT '');
	 *     DESC tab03;
	 * 测试自增长的使用
	 *      (1)INSERT INTO tab03
	 *                     VALUES(NULL,'xyy@123.com','xyy');
	 *         SELECT * FROM tab03;  //1,xyy@123.com,xyy
	 *      (2)INSERT INTO tab0(email,`name`)
	 *                     VALUES('nyy@123.com','nyy');
	 *                     
	 *                     
	 * 自增长的使用细节：
	 *     （1）一般来说自增长是和PRIMARY KEY配合使用的
	 *     （2）自增长也可以单独使用【但是需要配合一个unique】
	 *     （3）自增长修饰的字段为整数型的（虽然小数也可以但是非常非常少这样使用）
	 *     （4）自增长默认从 1 开始，也可以通过如下命令修改
	 *          ALTER TABLE 表名 AUTO_INCREMENT = xxx;
	 *     （5）如果你添加数据时，给自增长字段（列）指定的有值，则以指定的值为准
	 */
}
