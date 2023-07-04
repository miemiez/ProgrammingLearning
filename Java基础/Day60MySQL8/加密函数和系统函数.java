package Day60MySQL8;

public class 加密函数和系统函数 {
	/*
	 * 1.USER()：查询用户
	 *     可以查看登录到mysql的有哪些用户，以及登录的ip
	 *         SELECT USER() FROM dual --用户@IP地址
	 *         
	 * 2.DATABASE()：查询当前使用数据库名称
	 *     SELECT DATABASE()
	 *     
	 * 3.MD5(str)：为字符串算出一个MD5，32个字符的的字符串（char(32)），常用（用户密码）加密
	 *     root密码是 hsp -> 加密md5 -> 在数据库中存放的是加密后的密码
	 *         SELECT MD5('hsp') FROM dual
	 *         
	 *         演示用户表存放密码：
	 *             CREATE TABLE hsp_user(id INT,`name` VARCHAR(32) NOT NULL DEFAULT '',password CHAR(32) NOT NULL DEFAULT '')
	 *             INSERT INTO hsp_user VALUES(01,'root',MD5('hsp'));
	 *             SELECT password FROM hsp_user
	 *         
	 * 4.PASSWORD(str)：加密函数，MySQL数据库的用户名密码就算PASSWORD函数加密
	 *     SELECT PASSWORD('hsp') FROM dual
	 *     SELECT * FROM mysql.user \G  --从原文密码str计算并返回密码字符串
	 */
}
