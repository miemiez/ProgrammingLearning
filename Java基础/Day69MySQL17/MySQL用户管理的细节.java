package Day69MySQL17;

public class MySQL用户管理的细节 {
	/*
	 * 1.在创建用户的时候，如果不指定HOST，则为%，%表示所有IP都有连接权限：
	 *     create user xxx;
	 * 2.也可以这样指定：
	 *     create user 'xxx'@'192.168.1.%' 表示 xxx 用户在192.168.1.*的ip可以登录mysql
	 * 3.在删除用户的时候，如果host不是%，需要明确指定 '用户'@'host值'
	 *     DROP USER xxx; --如果host值是%
	 *     DROP USER 'xxx'@'host值';  --如果host值不是%
	 */
}
