package Git学习;

public class E_Git常用指令 {
	/*
	 * 主要讲解如何使用命令来控制这些状态之间的转换：
	 *     一：添加以及提交
	 *         1.git add（工作区 -> 暂存区）
	 *         2.git commit（暂存区 -> 本地仓库）
	 *     二：查看修改的状态（status）
	 *         1.作用：查看修改的状态（暂存区，工作区）
	 *         2.命令形式：git status
	 *     三：添加工作区到暂存区（add）
	 *         1.作用：添加工作区一个或多个文件的修改到暂存区
	 *         2.命令形式：git add 单个文件名|通配符
	 *         		将所有修改加入暂存区：git add
	 *     四：提交暂存区到本地仓库（commit）
	 *         1.作用：提交暂存区内容到本地仓库的当前分支
	 *         2.命令形式：git commit -m "注释内容"
	 *     五：查看提交日志（log）
	 *         1.作用：查看提交记录
	 *         2.命令形式：git log [option]
	 *         		options：
	 *         			--all 显示所有分支
	 *         			--pretty=oneline 将提交信息显示为一行
	 *         			--abbrev-commit 使得输出的commit id更短
	 *         			--graph 以图的形式显示
	 *         【可以在.bashrc文件中进行以下配置：
	 *         		#用于输出git提交日志
					alias git-log='git log --pretty=oneline --all --graph --abbrev-commit'
	 *         source ~/.bashrc 运行之后， git-log 这个指令
	 *         就可以当 git log --pretty=oneline --all --graph --abbrev-commit 使用了】
	 *     六：版本回退：
	 *     		作用：版本切换
	 *     		命令形式：git reset --hard commitID
	 *     			commitID 可以使用git-log或git log指令查看
	 *     		如何查看已经删除的记录：
	 *     			git reflog
	 *     			这个指令可以看到已经删除的提交记录
	 */
}
