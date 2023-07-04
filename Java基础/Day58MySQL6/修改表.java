package Day58MySQL6;

public class 修改表 {
	/*
	 * 添加列：（在emp表上增加一个image列，varchar类型，在resume后面）
	 *     ALTER TABLE emp
	 *                 ADD image VARCHAR(32) NOT NULL DEFAULT ''
	 *                 AFTER RESUME
	 *                 
	 * DESC emp //显示表结构，可以查看表的所有列
	 * 
	 * 修改列：（修改job列，使其长度为60）
	 *     ALTER TABLE emp
	 *                 MODIFY job VARCHAR(60) NOT NULL DEFAULT ''
	 * 
	 * 删除sex列：
	 *     ALTER TABLE emp
	 *                 DROP sex
	 *     
	 * 表名改为employee
	 *     RENAME TABLE emp 
	 *                  TO employee
	 * 
	 * 修改表的字符集为utf8
	 *     ALTER TABLE employee 
	 *                 CHARSET(CHARACTER SET) uft8
	 * 
	 * 列名name改为user_name
	 *     ALTER TABLE employee
	 *                 CHANGE `name` `user_name` VARCHAR(32) NOT NULL DEFAULT ''
	 *               
	 * DESC employee //显示表结构，可以查看表的所有列
	 */
}
