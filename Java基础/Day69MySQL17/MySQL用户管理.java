package Day69MySQL17;

public class MySQL用户管理 {
	/*
	 * MySQL用户：
	 *     mysql中的用户，都存储在系统数据库mysql中的user表中
	 *     其中user表的重要字段说明：
	 *         1.host：允许登录的"位置"，localhost表示该用户只允许本机登录，也可以指定ip地址，比如：192.168.1.100
	 *         2.user：用户名；
	 *         3.authentication_string：密码，是通过mysql的password()函数加密之后的密码。
	 * 
	 * MySQL管理：
	 *     1.创建用户：
	 *     
	 * MySQL用户管理的原因：
	 *     当我们做项目开发时，可以根据不同的开发人员，赋给他相应的MySQL操作权限
	 *     所以，MySQL数据库管理人员（root），根据需要创建不同的用户，赋给相应的权限，供人员使用
	 * 
	 * 1.创建新的用户
	 *     解读：（1）'lhy_stu'@'localhost'表示用户的完整信息，'lhy_stu'用户名'localhost'登录的IP
	 *           （2）123456密码，但是注意存放到mysql.user表时，是password('123456')加密后的密码
	 *     CREATE USER 'lhy_stu'@'localhost' IDENTIFIED BY '123456'
	 * 2.删除用户
	 *     DROP USER 'lhy_stu'@'localhost'
	 * 3.修改自己的密码
	 *     UPDATE user SET authentication_string = '密码' WHERE user = 'root' AND host = 'localhost';【mysql5.7】
	 *     SET PASSWORD = PASSWORD('密码');【mysql5.7】
	 *     ALTER USER 'root'@'localhost' IDENTIFIED BY '密码';【mysql8.0】
	 * 4.修改其他人的密码，需要权限
	 *     SET PASSWORD FRO 'root'@'localhost' = PASSWORD('密码');
	 */
}
