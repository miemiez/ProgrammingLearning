package Git学习;

public class G_配置SSH公钥 {
	/*
	 * 生成SSH公钥：
	 *     ssh-keygen -t rsa
	 *     不断回车
	 *         如果公钥已经存在，则自动覆盖
	 * 
	 * Gitee设置账户共公钥
	 *     获取公钥：
	 *         cat ~/.ssh/id_rsa.pub
	 *     在gitee的SSH公钥设置中添加公钥
	 *     验证是否配置成功：
	 *          ssh -T git@gitee.com
	 */
}
