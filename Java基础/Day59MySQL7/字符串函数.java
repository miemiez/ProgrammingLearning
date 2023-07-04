package Day59MySQL7;

public class 字符串函数 {
	/*
	 * 字符串相关函数
	 *     1.CHARSET(str)
	 *         返回字串字符集
	 *             SELECT CHARSET(`name`) FROM student
	 *             
	 *     2.CONCAT(string2[,...])
	 *         连接字串
	 *             SELECT CONCAT('我的名字是',`name`) FROM student
	 *             
	 *     3.INSTR(string,substring)
	 *         返回substring在string中出现的位置，没有则返回0
	 *             SELECT INSTR(`name`,'羊羊') FROM student
	 *             
	 *     4.UCASE(string2)
	 *         转换成大写
	 *             SELECT UCASE('a') FROM dual（dual亚元表）
	 *             
	 *     5.LCASE(string2)
	 *         转换成小写
	 *             SELECT LCASE('A') FROM dual
	 *     6.LEFT(string2,length)  /  RIGHT(string2,length)
	 *     
	 *         从string2中的 左边/右边 起取length个字符
	 *             SELECT LEFT(`name`,2) FROM student  /  SELECT RIGHT(`name`,2) FROM student
	 *             
	 *     7.LENGTH(string)
	 *         string长度【按照字节】
	 *             SELECT LENGTH(`name`) FROM student
	 *             
	 *     8.REPLACE(str,search_str,replace_str)
	 *         在str中用replace_str替换search_str
	 *             SELECT REPLACE(`name`,'羊羊'，'洋洋') FROM student
	 *             
	 *     9.STRCMP(string1,string2)
	 *         逐字符比较两字串大小
	 *             SELECT STRCMP('hsp','asp') FROM dual
	 *             
	 *     10.SUBSTRING(str,position[,length])
	 *         从str的position开始[【从1开始计算】，取length个字符
	 *             SELECT SUBSTRING(`name`,2,1) FROM student
	 *             
	 *     11.LTRIM(string2) RTRIM(string2) TRIM(string2)
	 *         去除前端空格或后端空格
	 *             SELECT LTRIM('  喜羊羊') FROM dual
	 *             SELECT RTRIM('喜羊羊  ') FROM dual
	 *             SELECT TRIM('  喜羊羊  ') FROM dual
	 *             
	 * 
	 * 练习：以首字母大写的方式显示所有人的姓名
	 *     (1)SELECT CONCAT(UCASE(SUBSTRING(`name`,1,1)),SUBSTRING(`name`,2)) FROM student
	 *     (2)SELECT CONCAT(UCASE(LEFT(`name`,1)),SUBSTRING(`name`,2)) FROM student
	 */
}
